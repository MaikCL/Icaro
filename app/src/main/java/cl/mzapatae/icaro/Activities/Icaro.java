package cl.mzapatae.icaro.Activities;

// Proyect Created 28 Noviembre 2014

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.Engine.IcaroEngineLexer;
import cl.mzapatae.icaro.Engine.IcaroEngineParser;
import cl.mzapatae.icaro.Utils.Speaker;


public class Icaro extends ActionBarActivity {
    public static final int LONG_DURATION = 5000;
    public static final int SHORT_DURATION = 1200;
    public static Speaker speaker;
    private final int REQUEST_OK = 1;
    private int TTS_DATA_CHECK = 1;
    private FragmentManager fragmentManager;
    private Locale Spanish = new Locale("spa");
    private TextView peticionUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_icaro);
        initTextToSpeech();

        fragmentManager = getFragmentManager();
        peticionUsuario = (TextView) findViewById(R.id.text_peticion);
        FloatingActionButton buttonMic = (FloatingActionButton) findViewById(R.id.mic_button);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle(R.string.app_name);
        mToolbar.inflateMenu(R.menu.menu_icaro);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_settings:
                        Intent intent = new Intent();
                        intent.setClass(Icaro.this, Settings.class);
                        startActivityForResult(intent, 0);
                        return true;
                }
                return false;
            }
        });

        buttonMic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reconocimientoVoz();
                //debugMode("que hora es");
            }
        });
    }

    private void debugMode(String query) {
        ejecutarEngine(query);
    }

    private void initTextToSpeech() {
        Intent intent = new Intent(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(intent, TTS_DATA_CHECK);
    }

    private void reconocimientoVoz() {
        Intent googleVoice = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        googleVoice.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "es-CL");
        googleVoice.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        try {
            startActivityForResult(googleVoice, REQUEST_OK);
        } catch (Exception e) {
            Toast.makeText(this, R.string.error_inicializarMic, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //TODO: Add If for check allow TTS, if true, launch try, false case, do nothing

        /*try {
            speaker = new Speaker(this);
            speaker.allow(true);
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.tts_install_warning));
        }*/

        if (resultCode != TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
            Intent install = new Intent();
            install.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
            startActivity(install);
        } else {
            speaker = new Speaker(this);
            speaker.allow(true);
        }

        if (requestCode == REQUEST_OK && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            peticionUsuario.setText(matches.get(0));
            peticionUsuario.setVisibility(TextView.VISIBLE);
            ejecutarEngine(matches.get(0));
            Log.d("Icaro", "Frase reconocida: " + matches.get(0));
        }
    }

    private void ejecutarEngine(String peticion) {
        peticion = Normalizer.normalize(peticion, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        Log.d("Icaro", "Frase Normalizada: " + peticion);

        IcaroEngineLexer lexer = new IcaroEngineLexer(new ANTLRInputStream(peticion.toLowerCase(Spanish))); //locale español
        IcaroEngineParser parser = new IcaroEngineParser(new CommonTokenStream(lexer));
        parser.icaro(fragmentManager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        speaker.destroy();
    }
}
