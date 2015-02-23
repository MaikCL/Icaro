package cl.bit01.icaro.Fragments.Features;
/*
 * Created by miguelost on 11-02-15.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;

import java.util.HashMap;

import cl.bit01.icaro.ApiClient.ApiBusiness;
import cl.bit01.icaro.ApiClient.ApiResponseHandler;
import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.GPSTracker;
import cl.bit01.icaro.Utils.ProgressBar;

public class Business extends Fragment {
    private FrameLayout layout;
    private TextView name;
    private TextView address;
    private TextView secondaryAddress;
    private TextView distance;
    private TextView phone;
    private TextView poweredBy;
    private MapView mMapView;
    private GoogleMap mGoogleMap;
    private Bundle mBundle;
    private GPSTracker gps;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_business, container, false);
        MapsInitializer.initialize(getActivity());
        Bundle bundle = this.getArguments();

        Toolbar mToolbarCard = (Toolbar) view.findViewById(R.id.toolbar_business);
        layout = (FrameLayout) view.findViewById(R.id.business_layout);
        name = (TextView) view.findViewById(R.id.business_name);
        address = (TextView) view.findViewById(R.id.business_address);
        secondaryAddress = (TextView) view.findViewById(R.id.business_secondaryAddress);
        distance = (TextView) view.findViewById(R.id.business_distance);
        phone = (TextView) view.findViewById(R.id.business_phone);
        poweredBy = (TextView) view.findViewById(R.id.business_poweredBy);
        mMapView = (MapView) view.findViewById(R.id.business_googlemap);
        mToolbarCard.setTitle("Explorando Negocios");
        layout.setVisibility(View.INVISIBLE);

        mMapView.onCreate(mBundle);
        initMapView(view);

        if (bundle.getString("mode").equals("explore")) {
            exploreBusiness(bundle.getString("business"), bundle.getBoolean("near"));
        } //else (bundle.getString("mode").equals("search")){

        //}
        return view;
    }

    private void exploreBusiness(String business, boolean near) {
        try {
            ApiBusiness client = new ApiBusiness();
            ApiBusiness.setContext(getActivity());
            client.retrieveBusinessExplore(business, near, new responseHandler());
        } catch (Exception e) {
            Log.e("exploreBussiness Error:", Log.getStackTraceString(e));
        }
    }

    private void setCurrentLocation() {

    }

    private void initMapView(View view) {
        if (mGoogleMap == null) {
            mGoogleMap = ((MapView) view.findViewById(R.id.business_googlemap)).getMap();
            if (mGoogleMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        mGoogleMap.setMyLocationEnabled(true);
        mGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState;
        gps = new GPSTracker(getActivity());
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

    private class responseHandler extends ApiResponseHandler {
        @Override
        public void onStart() {
            ProgressBar.showLoadProgressBar(getActivity());
            setCurrentLocation();
        }

        @Override
        public void onFinish() {
            ProgressBar.dismissLoadProgressBar();
        }

        @Override
        public void onSuccess(HashMap<String, String> dataReturned) {

            layout.setVisibility(View.VISIBLE);
        }

        @Override
        public void onError() {
            Log.d("Icaro Business", "Failed to access API Service");
        }
    }
}
