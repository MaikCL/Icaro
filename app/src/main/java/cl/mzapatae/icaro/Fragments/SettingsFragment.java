package cl.mzapatae.icaro.Fragments;

/*
 * Created by mzapata on 05-06-2015.
 */

import android.os.Bundle;
import android.preference.PreferenceFragment;

import cl.bit01.icaro.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}