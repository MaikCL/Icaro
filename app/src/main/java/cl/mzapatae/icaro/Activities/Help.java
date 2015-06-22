package cl.mzapatae.icaro.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import cl.bit01.icaro.R;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        WebView help = (WebView) findViewById(R.id.help_webview);
        help.loadUrl("file:///android_asset/help.html");
    }
}
