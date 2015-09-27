package cl.mzapatae.icaro.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import cl.mzapatae.icaro.Fragments.SettingsFragment;
import cl.mzapatae.icaro.R;

public class Settings extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.Settings_toolbar);
        toolbar.setTitle("Ajustes");

        getFragmentManager().beginTransaction().replace(R.id.Settings_frameContainer, new SettingsFragment()).commit();
    }
}
