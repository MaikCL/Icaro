package cl.mzapatae.icaro.Activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

import cl.bit01.icaro.R;

public class AboutMe extends Dialog {
    private static Context mContext = null;

    public AboutMe(Context context) {
        super(context);
        mContext = context;
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_LEFT_ICON);
        setContentView(R.layout.dialog_aboutme);
    }

}