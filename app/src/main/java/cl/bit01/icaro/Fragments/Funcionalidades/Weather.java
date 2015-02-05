package cl.bit01.icaro.Fragments.Funcionalidades;
/*
 * Created by miguelost on 05-02-15.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.bit01.icaro.R;

public class Weather extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = null;
        Bundle bundle = this.getArguments();
        view = inflater.inflate(R.layout.fragment_weather, container, false);
        return view;
    }
}
