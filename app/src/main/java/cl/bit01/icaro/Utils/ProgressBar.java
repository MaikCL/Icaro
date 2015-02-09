package cl.bit01.icaro.Utils;/*
 * Created by miguelost on 05-02-15.
 */

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;

import cl.bit01.icaro.R;

public class ProgressBar {
    private static ProgressDialog progress;

    public static void showLoadProgressBar(Context mContext) {
        progress = new ProgressDialog(mContext, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
        progress.setTitle(mContext.getResources().getString(R.string.get_data));
        progress.setMessage(mContext.getResources().getString(R.string.wait_for_a_minute));
        progress.show();
    }

    public static void dismissLoadProgressBar() {
        progress.dismiss();
    }
}
