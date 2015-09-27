package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cl.mzapatae.icaro.R;

public class Search extends Fragment {
    private WebView websearch;
    private Bundle bundle;
    private Toolbar mToolbarCard;

    public Search() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        bundle = this.getArguments();

        mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_search);
        websearch = (WebView) rootView.findViewById(R.id.search_webView);

        mToolbarCard.setTitle("Cargando...");

        if (bundle != null) {
            String mode = bundle.getString("mode","lucky");
            String query = bundle.getString("search");

            if (mode.equals("lucky")) {
                searchLucky(query);
            } else {
            }
        }
        return rootView;
    }

    private void searchLucky(String query) {
        String url = "http://www.google.cl/search?q=" + query + "&btnI=I'm+Feeling+Lucky";
        WebSettings webSettings = websearch.getSettings();
        webSettings.setBuiltInZoomControls(false);
        websearch.setWebViewClient(new Callback());  //HERE IS THE MAIN CHANGE
        websearch.getSettings().setJavaScriptEnabled(true);
        websearch.loadUrl(url);
    }

    private class Callback extends WebViewClient {  //HERE IS THE MAIN CHANGE.

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            mToolbarCard.setTitle(view.getTitle());
        }

    }


}
