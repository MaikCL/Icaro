package cl.mzapatae.icaro.Activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.widget.TextView;

import cl.mzapatae.icaro.R;

public class AboutMe extends Dialog {
    private static Context mContext = null;
    private TextView twitterText;


    public AboutMe(Context context) {
        super(context);
        mContext = context;
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_LEFT_ICON);
        setContentView(R.layout.dialog_aboutme);
        twitterText = (TextView) findViewById(R.id.about_twitterName);
        twitterText.setText(Html.fromHtml("<a href=\"" + "https://twitter.com/intent/user?screen_name=mzapatae_" + "\">" + "@MZapatae_" + "</a>"));
        twitterText.setClickable(true);
        twitterText.setMovementMethod(LinkMovementMethod.getInstance());
    }

}