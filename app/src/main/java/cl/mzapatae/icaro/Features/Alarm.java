package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cl.bit01.icaro.R;

/*
 * Created by miguelost on 21-04-15.
 */
public class Alarm extends Fragment {
    private TextView tHour;
    private TextView tMinutes;
    private Button bConfirm;
    private String hour;
    private String minutes;
    private String horarie;

    public Alarm() {
    }

    //TODO: FIX para frase "Pon la alarma a las 2" y corregir engine para ingresar "pon la alarma a la una"

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_alarm, container, false);
        Bundle bundle = this.getArguments();

        hour = bundle.getString("hour");
        minutes = bundle.getString("minutes");
        horarie = bundle.getString("horarie");

        Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_alarm);
        mToolbarCard.setTitle("Establecer Alarma");
        tHour = (TextView) rootView.findViewById(R.id.alarm_hour);
        tMinutes = (TextView) rootView.findViewById(R.id.alarm_minutes);
        bConfirm = (Button) rootView.findViewById(R.id.alarm_button_confirm);

        setAlarmData(hour, minutes, horarie);

        bConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmAlarm(hour, minutes, horarie);
            }
        });
        return rootView;
    }

    private void setAlarmData(String hour, String minutes, String horarie) {
        tHour.setText(String.valueOf(hourConversion(Integer.parseInt(hour), horarie)));
        tMinutes.setText(String.valueOf(minuteConversion(minutes)));
    }

    private void confirmAlarm(String hour, String minutes, String horarie) {
        Intent newAlarm = new Intent(AlarmClock.ACTION_SET_ALARM);
        newAlarm.putExtra(AlarmClock.EXTRA_HOUR, hourConversion(Integer.parseInt(hour), horarie));
        newAlarm.putExtra(AlarmClock.EXTRA_MINUTES, minuteConversion(minutes));
        getActivity().startActivity(newAlarm);
    }

    private int hourConversion(int hour, String horarie) {
        if (horarie != null && !horarie.isEmpty()) {
            if ((horarie.contains("tarde") && hour + 12 <= 24) || (horarie.contains("noche") && hour + 12 >= 20))
                return hour + 12;
        }
        return hour;
    }

    private int minuteConversion(String minutes) {
        if (minutes == null) return 0;
        else return Integer.parseInt(minutes);
    }
}
