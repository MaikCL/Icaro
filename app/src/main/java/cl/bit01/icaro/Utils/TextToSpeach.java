package cl.bit01.icaro.Utils;
/*
 * Created by miguelo on 22-01-15.
 */

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class TextToSpeach extends Activity {
    private static int TTS_DATA_CHECK = 1;
    static private boolean isInitTTS;
    static private TextToSpeech tts = null;
    Locale Español = new Locale("spa");

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    static public void speak(String text, String id) {
        if (tts != null && isInitTTS) {
            int currentapiVersion = android.os.Build.VERSION.SDK_INT;
            if (currentapiVersion >= Build.VERSION_CODES.LOLLIPOP) {
                // For Lollipop or newer version of Android
                tts.speak(text, TextToSpeech.QUEUE_ADD, null, id);
            } else {
                // For older devices
                tts.speak(text, TextToSpeech.QUEUE_ADD, null);
            }


        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TTS_DATA_CHECK) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        // TODO Auto-generated method stub
                        if (status == TextToSpeech.SUCCESS) {
                            isInitTTS = true;
                            if (tts.isLanguageAvailable(Español) >= 0) {
                                tts.setLanguage(Español);
                                tts.setPitch(0.8f);
                                tts.setSpeechRate(1.1f);
                            }
                        } else {
                            Intent intn = new Intent(
                                    TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                            startActivity(intn);
                        }
                    }
                });
            }
        }
    }
}
