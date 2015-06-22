package cl.mzapatae.icaro.Activities;

// Proyect Created 28 Noviembre 2014

import android.app.FragmentManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.melnykov.fab.FloatingActionButton;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.Engine.IcaroEngineLexer;
import cl.mzapatae.icaro.Engine.IcaroEngineParser;
import cl.mzapatae.icaro.Utils.LocalStorage;
import cl.mzapatae.icaro.Utils.Speaker;


public class Icaro extends AppCompatActivity {
    public static final int LONG_DURATION = 5000;
    public static final int SHORT_DURATION = 1200;
    public static Speaker speaker;
    private final int REQUEST_OK = 0x1;
    private FragmentManager fragmentManager;
    private Locale Spanish = new Locale("spa");
    private TextView peticionUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_icaro);
        LocalStorage.initLocalStorage(this);

        if (LocalStorage.getAllowVoiceScreen()) initVoiceScreen();

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
                    case R.id.action_help:
                        Intent intentAyuda = new Intent();
                        intentAyuda.setClass(Icaro.this, Help.class);
                        startActivityForResult(intentAyuda, 0);
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

        if (isFirstTime()) {
            new MaterialDialog.Builder(this)
                    .title("Bienvenido a Icaro Beta")
                    .content("Gracias por descargar este pequeño proyecto personal. \n\n " +
                            "Este asistente de voz actualmente tiene un conjunto reducido de funciones. " +
                            "Esto debido a que es un proyecto ambicioso y de gran tamaño para solo una persona, actualmente " +
                            "estoy dedicandome a pulir las funcionalidades ya existentes y corregir los errores, " +
                            "para posteriormente poder agregar nuevas funcionalidades. Te agradeceria que valoraras la aplicacion y tengas paciencia con este proyecto, " +
                            "Te recomiendo que veas la ayuda. \nGracias.")
                    .positiveText("Ver Ayuda")
                    .negativeText("Aceptar")
                    .cancelable(false)
                    .callback(new MaterialDialog.ButtonCallback() {
                        @Override
                        public void onPositive(MaterialDialog dialog) {
                            Intent intentAyuda = new Intent();
                            intentAyuda.setClass(Icaro.this, Help.class);
                            startActivityForResult(intentAyuda, 0);
                        }

                        @Override
                        public void onNegative(MaterialDialog dialog) {
                        }
                    })
                    .show();
        }
    }

    private boolean isFirstTime() {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        boolean ranBefore = preferences.getBoolean("RanBefore", false);
        if (!ranBefore) {
            // first time
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("RanBefore", true);
            editor.apply();
        }
        return !ranBefore;
    }

    private void initVoiceScreen() {
        try {
            speaker = new Speaker(this);
            speaker.allow(true);
        } catch (Exception e) {
            LocalStorage.setAllowVoiceScreen(false);
            new MaterialDialog.Builder(this)
                    .title("Error")
                    .content("Hubo un problema iniciando Voice Screen, asi que te lo hemos desactivado. \n " +
                            "Vuelve a activarlo desde las opciones.")
                    .cancelable(false)
                    .positiveText("Aceptar")
                    .show();
        }
    }

    private void debugMode(String query) {
        ejecutarEngine(query);
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
        if (speaker != null) speaker.destroy();
    }
}
