package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cl.mzapatae.icaro.Activities.Icaro;
import cl.mzapatae.icaro.R;
import cl.mzapatae.icaro.Utils.DeleteRememberBroadcast;
import cl.mzapatae.icaro.Utils.LocalStorage;

/*
 * Created by miguelost on 22-04-15.
 */
public class Remember extends Fragment {
    private TextView tRemember;
    private TextView tActionText;
    private Button bConfirm;
    private String mode;
    private String remember;

    public Remember() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_remember, container, false);
        Bundle bundle = this.getArguments();

        mode = bundle.getString("mode");

        if (mode.equals("addRemember")) {
            Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_remember);
            mToolbarCard.setTitle("Añadir Recordatorio");
            tRemember = (TextView) rootView.findViewById(R.id.remember_rememberText);
            bConfirm = (Button) rootView.findViewById(R.id.remember_button_confirm);
            remember = bundle.getString("remember");

            tRemember.setText(remember);
            bConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    addRemember(remember);
                }
            });
            speak("Este es tu recordatorio, recuerda confirmar");
        }

        if (mode.equals("deleteRemember")) {
            LocalStorage.initLocalStorage(getActivity());
            Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_remember);
            mToolbarCard.setTitle("Eliminar Recordatorio");
            tRemember = (TextView) rootView.findViewById(R.id.remember_rememberText);
            tActionText = (TextView) rootView.findViewById(R.id.remember_actionText);
            bConfirm = (Button) rootView.findViewById(R.id.remember_button_confirm);

            tActionText.setVisibility(View.VISIBLE);
            tRemember.setText(LocalStorage.getRemember());
            bConfirm.setText("Eliminar");
            bConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteRemember();
                }
            });
        }

        if (mode.equals("showRemember")) {
            LocalStorage.initLocalStorage(getActivity());
            Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_remember);
            mToolbarCard.setTitle("Recordatorios Pendientes");
            tRemember = (TextView) rootView.findViewById(R.id.remember_rememberText);
            tActionText = (TextView) rootView.findViewById(R.id.remember_actionText);
            bConfirm = (Button) rootView.findViewById(R.id.remember_button_confirm);

            tActionText.setVisibility(View.VISIBLE);
            tActionText.setText("Acuerdate de...");
            tRemember.setText(LocalStorage.getRemember());
            speak("Recuerda que debes " + LocalStorage.getRemember());
            bConfirm.setVisibility(View.GONE);

        }
        return rootView;
    }

    private void addRemember(String remember) {
        //TODO: Add compatibility with api 15
        Log.d("Icaro", "Add Remember: " + remember);
        LocalStorage.initLocalStorage(getActivity());
        LocalStorage.setRemember(remember);

        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Intent intent = new Intent(getActivity(), DeleteRememberBroadcast.class);
        PendingIntent pIntent = PendingIntent.getBroadcast(getActivity(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification mNotification = new Notification.Builder(getActivity())
                .setContentTitle("Icaro te recuerda...")
                .setContentText(remember)
                .setSmallIcon(R.drawable.ic_mic_none_white_24dp)
                .setSound(soundUri)
                .addAction(0, "Eliminar recordatorio", pIntent)
                .setOngoing(true)    //persistent notification
                .build();

        NotificationManager notificationManager = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1050, mNotification); //set notification ID to 1050
    }

    private void deleteRemember() {
        LocalStorage.setRemember(null);
    }

    private void speak(String text) {
        LocalStorage.initLocalStorage(getActivity());
        if (LocalStorage.getAllowVoiceScreen()) {
            Icaro.speaker.pause(Icaro.SHORT_DURATION);
            Icaro.speaker.speak(text);

        }
    }
}
