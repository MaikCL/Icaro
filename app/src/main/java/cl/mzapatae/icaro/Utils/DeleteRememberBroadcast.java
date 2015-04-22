package cl.mzapatae.icaro.Utils;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*
 * Created by mzapata on 22-04-2015.
 */
public class DeleteRememberBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        LocalStorage.initLocalStorage(context);
        LocalStorage.setRemember(null);

        String ns = Context.NOTIFICATION_SERVICE;
        NotificationManager nMgr = (NotificationManager) context.getSystemService(ns);
        nMgr.cancel(1050);
    }
}
