package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import cl.bit01.icaro.R;

/*
 * Created by miguelost on 29-05-15.
 */

public class Calendar extends Fragment {
    private FrameLayout layout;
    private TextView eventName;
    private TextView eventDate;
    private TextView eventTime;
    private Button buttonConfirm;
    private Bundle bundle;

    private String titleEvent;
    private String dayEvent;
    private String monthEvent;
    private String hourEvent;
    private String minutesEvent;
    private String horarie;

    public Calendar() {
        // Required empty public constructor
    }

    // TODO: Add Pseudoday Support

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);
        bundle = this.getArguments();

        Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_calendar);
        layout = (FrameLayout) rootView.findViewById(R.id.calendar_layout);
        eventName = (TextView) rootView.findViewById(R.id.calendar_eventName);
        eventDate = (TextView) rootView.findViewById(R.id.calendar_date);
        eventTime = (TextView) rootView.findViewById(R.id.calendar_time);
        buttonConfirm = (Button) rootView.findViewById(R.id.calendar_button_confirm);

        layout.setVisibility(View.INVISIBLE);
        if (bundle != null) {
            titleEvent = bundle.getString("event");
            dayEvent = bundle.getString("day");
            monthEvent = bundle.getString("month");
            hourEvent = bundle.getString("hour");
            minutesEvent = bundle.getString("minutes");
            horarie = bundle.getString("horarie");

            addEvent(titleEvent, dayEvent, monthEvent, hourEvent, minutesEvent, horarie);
        }

        return rootView;
    }

    private void addEvent(final String titleEvent, String dayEvent, String monthEvent, String hourEvent, String minutesEvent, String horarie) {

        final int eventDay = convertDay(dayEvent);
        final int eventMonth = convertMonth(monthEvent);
        final int eventHour = convertHour(Integer.parseInt(hourEvent), horarie);
        final int eventMinutes = convertMinutes(minutesEvent);

        eventName.setText(titleEvent);
        eventDate.setText(String.valueOf(eventDay) + " de " + getMonth(eventMonth));
        eventTime.setText(String.format("%02d:%02d", eventHour, eventMinutes));

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                java.util.Calendar beginTime = java.util.Calendar.getInstance();
                java.util.Calendar endTime = java.util.Calendar.getInstance();

                int presentYear = calendar.get(java.util.Calendar.YEAR);
                long startMillis = 0;
                long endMillis = 0;

                //By Default, the end time of event, is 1 hour later
                beginTime.set(presentYear, eventMonth - 1, eventDay, eventHour, eventMinutes);
                startMillis = beginTime.getTimeInMillis();
                endTime.set(presentYear, eventMonth - 1, eventDay, eventHour + 1, eventMinutes);
                endMillis = endTime.getTimeInMillis();

                // Insert Event
                ContentResolver cr = getActivity().getContentResolver();
                ContentValues values = new ContentValues();
                TimeZone timeZone = TimeZone.getDefault();
                values.put(CalendarContract.Events.DTSTART, startMillis);
                values.put(CalendarContract.Events.DTEND, endMillis);
                values.put(CalendarContract.Events.EVENT_TIMEZONE, timeZone.getID());
                values.put(CalendarContract.Events.TITLE, titleEvent);
                values.put(CalendarContract.Events.CALENDAR_ID, 1);
                Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);

                // Retrieve ID for new event
                Log.d("Icaro", "Evento Creado, ID Evento: " + uri.getLastPathSegment());
                Toast.makeText(getActivity(), "Evento almacenado", Toast.LENGTH_LONG).show();
            }
        });

        layout.setVisibility(View.VISIBLE);

    }

    private String getMonth(int eventMonth) {
        if (eventMonth == 1) return "Enero";
        if (eventMonth == 2) return "Febrero";
        if (eventMonth == 3) return "Marzo";
        if (eventMonth == 4) return "Abril";
        if (eventMonth == 5) return "Mayo";
        if (eventMonth == 6) return "Junio";
        if (eventMonth == 7) return "Julio";
        if (eventMonth == 8) return "Agosto";
        if (eventMonth == 9) return "Septiembre";
        if (eventMonth == 10) return "Octubre";
        if (eventMonth == 11) return "Noviembre";
        if (eventMonth == 12) return "Diciembre";
        return null;
    }

    private int convertMinutes(String minutesEvent) {
        if (minutesEvent == null) return 0;
        else return Integer.parseInt(minutesEvent);
    }

    private int convertHour(int hourEvent, String horarie) {
        if (horarie != null && !horarie.isEmpty()) {
            //entrada horario: mañana - tarde - noche
            if ((horarie.contains("tarde") && hourEvent + 12 <= 24) || (horarie.contains("noche") && hourEvent + 12 >= 20))
                return hourEvent + 12;
        }
        return hourEvent;
    }

    private int convertMonth(String monthEvent) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        String presentMonth = new SimpleDateFormat("MMMM").format(cal.getTime());
        Log.d("Icaro", "Mes Actual debug " + presentMonth);

        if (monthEvent == null) monthEvent = presentMonth;

        if (!monthEvent.isEmpty()) {
            if (monthEvent.compareTo("enero") == 0) return 1;
            if (monthEvent.compareTo("febrero") == 0) return 2;
            if (monthEvent.compareTo("marzo") == 0) return 3;
            if (monthEvent.compareTo("abril") == 0) return 4;
            if (monthEvent.compareTo("mayo") == 0) return 5;
            if (monthEvent.compareTo("junio") == 0) return 6;
            if (monthEvent.compareTo("julio") == 0) return 7;
            if (monthEvent.compareTo("agosto") == 0) return 8;
            if (monthEvent.compareTo("septiembre") == 0) return 9;
            if (monthEvent.compareTo("octubre") == 0) return 10;
            if (monthEvent.compareTo("noviembre") == 0) return 11;
            if (monthEvent.compareTo("diciembre") == 0) return 12;
        }
        return 0;
    }

    private int convertDay(String dayEvent) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int diaActual = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String diaSemana = sdf.format(d);
        diaSemana = Normalizer.normalize(diaSemana, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        Log.d("Icaro", diaSemana);

        Map<String, Integer> map = new HashMap<>();
        map.put("lunes", 1);
        map.put("martes", 2);
        map.put("miercoles", 3);
        map.put("jueves", 4);
        map.put("viernes", 5);
        map.put("sabado", 6);
        map.put("domingo", 7);

        if (dayEvent.compareTo("hoy") == 0) {
            return diaActual;
        }

        if (dayEvent.compareTo("mañana") == 0) {
            return diaActual + 1;
        }

        if (dayEvent.compareTo("pasado mañana") == 0) {
            return diaActual + 2;
        }

        if ((dayEvent.compareTo("lunes") == 0) || (dayEvent.compareTo("martes") == 0) || (dayEvent.compareTo("miercoles") == 0)
                || (dayEvent.compareTo("jueves") == 0) || (dayEvent.compareTo("viernes") == 0) || (dayEvent.compareTo("sabado") == 0)
                || (dayEvent.compareTo("domingo") == 0)) {

            int fecha = 7 - map.get(diaSemana) + map.get(dayEvent);
            if (fecha > 7) fecha = fecha - 7;

            return diaActual + fecha;
        } else {
            return Integer.parseInt(dayEvent);
        }
    }


}
