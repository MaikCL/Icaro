package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toolbar;

import cl.bit01.icaro.R;

public class Search extends Fragment {
    private WebView websearch;
    private Bundle bundle;

    public Search() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        bundle = this.getArguments();

        Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_search);
        websearch = (WebView) rootView.findViewById(R.id.search_webView);

        mToolbarCard.setTitle(getResources().getString(R.string.search_toolbar_title));

        if (bundle != null) {


            search(null);
        }
        return rootView;
    }

    private void search(String query) {
        String url = "https://www.google.cl/search?q=" + query;
        websearch.getSettings().setJavaScriptEnabled(true);
        websearch.loadUrl(url);
    }


}
