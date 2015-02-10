package cl.bit01.icaro.Fragments.Features;
/*
 * Created by miguelost on 09-02-15.
 */

import android.app.Fragment;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.ErrorManager;
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
    private GPSTracker gps;

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
        gps = new GPSTracker(getActivity());
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
        mGoogleMap.setMyLocationEnabled(true);
        mGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
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
        double currentLatitude;
        double currentLongitude;
        String locationCity;
        String locationCountry;
        String locationAddress;
        int errorCode = 0;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressBar.showLoadProgressBar(getActivity());
        }


        @Override
        protected Void doInBackground(Void... params) {
            if (gps.canGetLocation()) {
                currentLatitude = gps.getLatitude();
                currentLongitude = gps.getLongitude();

                Geocoder geocoder = new Geocoder(getActivity(), Locale.getDefault());
                try {
                    List<Address> currentLocation = geocoder.getFromLocation(currentLatitude, currentLongitude, 1);
                    if (currentLocation.size() > 0) {
                        locationCity = currentLocation.get(0).getLocality();
                        locationCountry = currentLocation.get(0).getCountryName();
                        locationAddress = currentLocation.get(0).getAddressLine(0);
                    }
                } catch (IOException e) {
                    errorCode = 1001;
                    ErrorManager.logError(getClass().getEnclosingClass().getSimpleName(),
                            "GeoCoder Error", e.getMessage());
                }
            } else {
                errorCode = 1000;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (errorCode == 0) {
                UiSettings mapSettings = mGoogleMap.getUiSettings();
                mapSettings.setCompassEnabled(true);
                mapSettings.setRotateGesturesEnabled(true);
                mapSettings.setScrollGesturesEnabled(true);
                mapSettings.setTiltGesturesEnabled(false);
                mapSettings.setZoomControlsEnabled(false);
                mapSettings.setZoomGesturesEnabled(true);

                CameraPosition mapPosition = new CameraPosition.Builder()
                        .target(new LatLng(currentLatitude, currentLongitude))
                        .zoom(16)
                        .bearing(0)
                        .tilt(38)
                        .build();
                CameraUpdate camUpdate = CameraUpdateFactory.newCameraPosition(mapPosition);
                mGoogleMap.animateCamera(camUpdate);

                country.setText(locationCountry);
                city.setText(locationCity);
                street.setText(locationAddress);

                layout.setVisibility(View.VISIBLE);
            } else {
                ErrorManager.notify(getActivity(), errorCode);
            }
            ProgressBar.dismissLoadProgressBar();
        }
    }
}
