package cl.mzapatae.icaro.Fragments;

/*
 * Created by mzapata on 05-06-2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.Activities.AboutMe;

public class SettingsFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener {
    final String TWITTER_LOGIN = "key_loginTwitter";
    final String ABOUT_ME = "key_aboutMe";
    final String HELP = "key_help";

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);

        Preference twitterLogin = findPreference(TWITTER_LOGIN);
        Preference helpScreen = findPreference(HELP);
        Preference aboutMe = findPreference(ABOUT_ME);

        twitterLogin.setOnPreferenceClickListener(this);
        helpScreen.setOnPreferenceClickListener(this);
        aboutMe.setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {

        if (preference.getKey().equals(ABOUT_ME)) {
            Intent aboutMeScreen = new Intent(this.getActivity(), AboutMe.class);
            this.getActivity().startActivity(aboutMeScreen);
        }

        return false;
    }
}