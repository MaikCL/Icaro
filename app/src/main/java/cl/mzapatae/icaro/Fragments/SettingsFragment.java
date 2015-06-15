package cl.mzapatae.icaro.Fragments;

/*
 * Created by mzapata on 05-06-2015.
 */

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.Activities.AboutMe;
import cl.mzapatae.icaro.Utils.LocalStorage;

public class SettingsFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener,
        Preference.OnPreferenceChangeListener {
    final String TWITTER_LOGIN = "key_loginTwitter";
    final String ABOUT_ME = "key_aboutMe";
    final String HELP = "key_help";
    final String ALLOW_TTS = "key_allowTTS";

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
                allowTTS.setSummary("Voice Screen Apagado");
            } else {
                ((SwitchPreference) preference).setChecked(true);
                LocalStorage.setAllowVoiceScreen(true);
                allowTTS.setSummary("Voice Screen Encendido");
            }
        }
        return false;
    }
}