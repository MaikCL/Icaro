package cl.mzapatae.icaro.Utils;
/*
 * Created by miguelo on 22-01-15.
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.HashMap;
import java.util.Locale;

public class Speaker implements TextToSpeech.OnInitListener {
    Locale spanish = new Locale("es", "ES");
    private TextToSpeech tts;
    private boolean ready = false;
    private boolean allowed = false;

    public Speaker(Context context) {
        tts = new TextToSpeech(context, this);
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void allow(boolean allowed) {
        this.allowed = allowed;
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            if (tts.isLanguageAvailable(spanish) >= 0) {
                tts.setLanguage(spanish);
                tts.setSpeechRate(1.1f);
                tts.setPitch(0.8f);
                ready = true;
                Log.d("Icaro Speak", "OnInit Speak Ready");
            }
        } else {
            ready = false;
        }
    }

    public void speak(String text) {
        // Speak only if the TTS is ready and the user has allowed speech
        if (ready && allowed) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21(text);
            } else {
                ttsUnder20(text);
            }
        }
    }

    public void destroy() {
        tts.shutdown();
    }

    public void pause(int duration) {
        //tts.playSilence(duration, TextToSpeech.QUEUE_ADD, null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            pauseGreater21(duration);
        } else {
            pauseUnder20(duration);
        }
    }

    @SuppressWarnings("deprecation")
    private void ttsUnder20(String text) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put(TextToSpeech.Engine.KEY_PARAM_STREAM,
                String.valueOf(AudioManager.STREAM_NOTIFICATION));
        tts.speak(text, TextToSpeech.QUEUE_ADD, hash); //use flush
        Log.d("Icaro Speak", " API Under 20 - Speek Done!");
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void ttsGreater21(String text) {
        String utteranceId = this.hashCode() + "";
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId);
        Log.d("Icaro Speak", " API Under 20 - Speek Done!");

    }

    @SuppressWarnings("deprecation")
    private void pauseUnder20(int duration) {
        tts.playSilence(duration, TextToSpeech.QUEUE_ADD, null);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void pauseGreater21(int duration) {
        String utteranceId = this.hashCode() + "";
        tts.playSilentUtterance(duration, TextToSpeech.QUEUE_ADD, utteranceId);
    }
}
