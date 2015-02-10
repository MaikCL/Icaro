package cl.bit01.icaro.Fragments.Features;
/*
 * Created by miguelost on 09-02-15.
 */

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;

import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.GPSTracker;
import cl.bit01.icaro.Utils.ProgressBar;

public class Location extends Fragment {
    private FrameLayout layout;
    private TextView country;
    private TextView city;
    private TextView street;
    private MapView mMapView;
    private GoogleMap mGoogleMap;
    private Bundle mBundle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_location, container, false);
        MapsInitializer.initialize(getActivity());

        Toolbar mToolbarCard = (Toolbar) view.findViewById(R.id.toolbar_location);
        layout = (FrameLayout) view.findViewById(R.id.location_layout);
        country = (TextView) view.findViewById(R.id.location_country);
        city = (TextView) view.findViewById(R.id.location_city);
        street = (TextView) view.findViewById(R.id.location_street);
        mMapView = (MapView) view.findViewById(R.id.location_googlemap);
        mToolbarCard.setTitle(getResources().getString(R.string.location_toolbar_title));

        layout.setVisibility(View.INVISIBLE);

        mMapView.onCreate(mBundle);
        initMapView(view);
        setCurrentLocation();
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState;
    }

    private void initMapView(View mView) {
        if (mGoogleMap == null) {
            mGoogleMap = ((MapView) mView.findViewById(R.id.location_googlemap)).getMap();
            if (mGoogleMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        //TODO: Put config map method here
    }

    private void setCurrentLocation() {
        new BackgroundTask().execute();
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    private class BackgroundTask extends AsyncTask<Void, Void, Void> {
        LatLng currentLocation;
        String locationCity;
        String locationCountry;
        String locationAddress;
        GPSTracker gps;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressBar.showLoadProgressBar(getActivity());
            gps = new GPSTracker(getActivity());
        }


        @Override
        protected Void doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            layout.setVisibility(View.VISIBLE);
            ProgressBar.dismissLoadProgressBar();
        }
    }
}
