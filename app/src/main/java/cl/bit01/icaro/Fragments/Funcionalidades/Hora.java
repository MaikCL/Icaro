package cl.bit01.icaro.Fragments.Funcionalidades;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;

import cl.bit01.icaro.R;

import static cl.bit01.icaro.R.id.clock_minutes;

public class Hora extends Fragment {
    TextView hour;
    TextView minutes;
    Calendar calendar;


    public Hora() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hora, container, false);

        hour = (TextView) view.findViewById(R.id.clock_hour);
        minutes = (TextView) view.findViewById(clock_minutes);

        setClock();
        speak();
        return view;
    }

    private void setClock() {
        calendar = Calendar.getInstance();

        hour.setText(String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)));
        minutes.setText(String.valueOf(calendar.get(Calendar.MINUTE)));
    }
}
