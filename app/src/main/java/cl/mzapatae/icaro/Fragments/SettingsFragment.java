package cl.mzapatae.icaro.Fragments;

/*
 * Created by mzapata on 05-06-2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.speech.tts.TextToSpeech;

import com.afollestad.materialdialogs.MaterialDialog;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.Activities.AboutMe;
import cl.mzapatae.icaro.Activities.Icaro;
import cl.mzapatae.icaro.Utils.LocalStorage;
import cl.mzapatae.icaro.Utils.Speaker;

public class SettingsFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener,
        Preference.OnPreferenceChangeListener {
    final String TWITTER_LOGIN = "key_loginTwitter";
    final String ABOUT_ME = "key_aboutMe";
    final String HELP = "key_help";
    final String ALLOW_TTS = "key_allowTTS";

    private final int CHECK_CODE = 0x2;

    private Preference twitterLogin;
    private Preference helpScreen;
    private Preference aboutMe;
    private Preference allowTTS;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
        LocalStorage.initLocalStorage(getActivity());

        twitterLogin = findPreference(TWITTER_LOGIN);
        helpScreen = findPreference(HELP);
        aboutMe = findPreference(ABOUT_ME);
        allowTTS = findPreference(ALLOW_TTS);

        twitterLogin.setOnPreferenceClickListener(this);
        helpScreen.setOnPreferenceClickListener(this);
        aboutMe.setOnPreferenceClickListener(this);
        allowTTS.setOnPreferenceChangeListener(this);

        loadSavedPreferences();

    }

    private void loadSavedPreferences() {
        //This verification is in case than Icaro Class try/catch, failed
        if (LocalStorage.getAllowVoiceScreen()) {
            ((SwitchPreference) allowTTS).setChecked(true);
        } else {
            ((SwitchPreference) allowTTS).setChecked(false);
        }
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if (preference.getKey().equals(ABOUT_ME)) {
            AboutMe aboutMe = new AboutMe(getActivity());
            aboutMe.show();
        }
        return false;
    }


    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        if (preference.getKey().equals(ALLOW_TTS)) {
            boolean checked = ((SwitchPreference) preference).isChecked();
            if (checked) {
                ((SwitchPreference) preference).setChecked(false);
                LocalStorage.setAllowVoiceScreen(false);
            } else {
                checkTTS();
            }
        }
        return false;
    }

    private void checkTTS() {
        Intent check = new Intent();
        check.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(check, CHECK_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                LocalStorage.setAllowVoiceScreen(true);
                allowTTS.setSummary("Voice Screen Encendido");
                ((SwitchPreference) allowTTS).setChecked(true);
            } else {
                new MaterialDialog.Builder(getActivity())
                        .title("Atencion")
                        .content("Para activar esta funcionalidad, debes instalar los datos necesarios.")
                        .positiveText("Instalar")
                        .negativeText("Cancelar")
                        .callback(new MaterialDialog.ButtonCallback() {
                            @Override
                            public void onPositive(MaterialDialog dialog) {
                                Intent install = new Intent();
                                install.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                                startActivity(install);
                            }
                        }).show();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (LocalStorage.getAllowVoiceScreen()) {
            if (Icaro.speaker == null) {
                Icaro.speaker = new Speaker(getActivity());
                Icaro.speaker.allow(true);
            }
        }
    }
}