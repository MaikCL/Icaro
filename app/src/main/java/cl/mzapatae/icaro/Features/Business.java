package cl.mzapatae.icaro.Features;
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

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.List;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.ApiClient.ApiBusiness;
import cl.mzapatae.icaro.ApiClient.ApiResponseHandler;
import cl.mzapatae.icaro.ModelData.Gson.FoursquareSearchJSON;
import cl.mzapatae.icaro.Utils.ProgressBar;

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

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View rootView = inflater.inflate(R.layout.fragment_business, container, false);
        MapsInitializer.initialize(getActivity());
        Bundle bundle = this.getArguments();

        Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_business);
        layout = (FrameLayout) rootView.findViewById(R.id.business_layout);
        name = (TextView) rootView.findViewById(R.id.business_name);
        address = (TextView) rootView.findViewById(R.id.business_address);
        secondaryAddress = (TextView) rootView.findViewById(R.id.business_secondaryAddress);
        distance = (TextView) rootView.findViewById(R.id.business_distance);
        phone = (TextView) rootView.findViewById(R.id.business_phone);
        poweredBy = (TextView) rootView.findViewById(R.id.business_poweredBy);
        mMapView = (MapView) rootView.findViewById(R.id.business_googlemap);
        layout.setVisibility(View.INVISIBLE);

        mMapView.onCreate(mBundle);
        initMapView(rootView);

        if (bundle.getString("mode").equals("explore")) {
            mToolbarCard.setTitle("Explorando Negocios");
            exploreBusiness(bundle.getString("business"), bundle.getBoolean("near"));
        } else if (bundle.getString("mode").equals("search")) {
            mToolbarCard.setTitle("Negocios Cerca");
            searchBusiness(bundle.getString("business"), bundle.getBoolean("near"));
        }
        return rootView;
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

    private void searchBusiness(String business, boolean near) {
        try {
            ApiBusiness client = new ApiBusiness();
            ApiBusiness.setContext(getActivity());
            client.retrieveBusinessSearch(business, near, new responseHandler());
        } catch (Exception e) {
            Log.e("searchBusiness Error:", Log.getStackTraceString(e));
        }
    }

    private void setCurrentLocation() {
        mGoogleMap.setMyLocationEnabled(true);
        mGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
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
        public void onSuccess(final FoursquareSearchJSON responseGson) {
            int minorDistance = responseGson.getResponse().getVenues().get(0).getLocation().getDistance();
            int minorDistanceId = 0;

            for (int i = 0; i < responseGson.getResponse().getVenues().size(); i++) {
                mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(
                        responseGson.getResponse().getVenues().get(i).getLocation().getLatitude(),
                        responseGson.getResponse().getVenues().get(i).getLocation().getLongitude()))
                        .title(responseGson.getResponse().getVenues().get(i).getVenueName()));
                if (responseGson.getResponse().getVenues().get(i).getLocation().getDistance() != null) {
                    if (responseGson.getResponse().getVenues().get(i).getLocation().getDistance() <= minorDistance) {
                        minorDistanceId = i;
                        minorDistance = responseGson.getResponse().getVenues().get(i).getLocation().getDistance();
                    }
                }
            }

            mGoogleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {
                    int id = Integer.parseInt(marker.getId().substring(1));
                    name.setText(responseGson.getResponse().getVenues().get(id).getVenueName());
                    address.setText(responseGson.getResponse().getVenues().get(id).getLocation().getAddress());
                    secondaryAddress.setText("Referencia: " + responseGson.getResponse()
                            .getVenues().get(id).getLocation().getCrossStreet());
                    phone.setText("Telefono: " + responseGson.getResponse().getVenues().get(id).getContact().getPhone());

                    if (responseGson.getResponse().getVenues().get(id).getLocation().getDistance() != null) {
                        distance.setText("Distancia: " + responseGson.getResponse().getVenues().get(id).getLocation().getDistance() + " metros");
                    } else {
                        distance.setText("Distancia: No Disponible");
                    }
                    return false;
                }
            });

            CameraPosition mapPosition = new CameraPosition.Builder()
                    .target(new LatLng(responseGson.getResponse().getVenues().get(minorDistanceId).getLocation().getLatitude(),
                            responseGson.getResponse().getVenues().get(minorDistanceId).getLocation().getLongitude()))
                    .zoom(14)
                    .bearing(0)
                    .tilt(40)
                    .build();
            CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(mapPosition);
            mGoogleMap.animateCamera(cameraUpdate);

            name.setText(responseGson.getResponse().getVenues().get(minorDistanceId).getVenueName());
            address.setText(responseGson.getResponse().getVenues().get(minorDistanceId).getLocation().getAddress());
            secondaryAddress.setText("Referencia: " + responseGson.getResponse().getVenues().get(minorDistanceId).getLocation().getCrossStreet());
            phone.setText("Telefono: " + responseGson.getResponse().getVenues().get(minorDistanceId).getContact().getPhone());
            distance.setText("Distancia: " + responseGson.getResponse().getVenues().get(minorDistanceId).getLocation().getDistance() + " metros");

            poweredBy.setText(R.string.powered_foursquare);
            layout.setVisibility(View.VISIBLE);
        }

        //TODO: Deprecate method onSuccess (ES: Reescribir de la misma manera que onSucess de Search con objeto Gson)
        @Override
        public void onSuccess(final List<HashMap> businessList) {
            int minorDistance = Integer.valueOf((String) businessList.get(1).get("distance"));
            int minorDistanceId = 1;
            double userLatitude = (double) businessList.get(0).get("latitude");
            double userLongitude = (double) businessList.get(0).get("longitude");

            for (int i = 1; i <= businessList.size() - 1; i++) {
                mGoogleMap.addMarker(new MarkerOptions().position(
                        new LatLng(Double.valueOf((String) businessList.get(i).get("latitude")),
                                Double.valueOf((String) businessList.get(i).get("longitude"))))
                        .title((String) businessList.get(i).get("name")));
                if (Integer.valueOf((String) businessList.get(i).get("distance")) <= minorDistance) {
                    minorDistanceId = i;
                    minorDistance = Integer.valueOf((String) businessList.get(i).get("distance"));
                }
            }

            mGoogleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {
                    int id = Integer.parseInt(marker.getId().substring(1));
                    name.setText((String) businessList.get(id + 1).get("name"));
                    address.setText((String) businessList.get(id + 1).get("address"));
                    secondaryAddress.setText("Referencia: " + businessList.get(id + 1).get("crossStreet"));
                    phone.setText("Telefono: " + businessList.get(id + 1).get("phone"));
                    distance.setText("Distancia: " + businessList.get(id + 1).get("distance") + " metros");
                    return false;
                }
            });

            CameraPosition mapPosition = new CameraPosition.Builder()
                    .target(new LatLng(Double.valueOf((String) businessList.get(minorDistanceId).get("latitude")),
                            Double.valueOf((String) businessList.get(minorDistanceId).get("longitude"))))
                    .zoom(14)
                    .bearing(0)
                    .tilt(40)
                    .build();
            CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(mapPosition);
            mGoogleMap.animateCamera(cameraUpdate);

            name.setText((String) businessList.get(minorDistanceId).get("name"));
            address.setText((String) businessList.get(minorDistanceId).get("address"));
            secondaryAddress.setText("Referencia: " + businessList.get(minorDistanceId).get("crossStreet"));
            phone.setText("Telefono: " + businessList.get(minorDistanceId).get("phone"));
            distance.setText("Distancia: " + businessList.get(minorDistanceId).get("distance") + "metros");

            poweredBy.setText(R.string.powered_foursquare);
            layout.setVisibility(View.VISIBLE);
        }

        @Override
        public void onError() {
            Log.d("Icaro Business", "Failed to access API Service");
        }
    }
}
