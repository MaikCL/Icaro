package cl.bit01.icaro.Fragments.Funcionalidades;
/*
 * Created by miguelost on 05-02-15.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.HashMap;

import cl.bit01.icaro.ApiClient.ApiResponseHandler;
import cl.bit01.icaro.ApiClient.ApiWeather;
import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.GPSTracker;

public class Weather extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = null;
        Bundle bundle = this.getArguments();
        view = inflater.inflate(R.layout.fragment_weather, container, false);

        Toolbar mToolbarCard = (Toolbar) view.findViewById(R.id.toolbar_weather);
        mToolbarCard.setTitle("Temperatura");

        if (bundle != null) {
            setWeather(bundle.getString("city"));
        } else {
            GPSTracker gps = new GPSTracker(getActivity());
            if (gps.canGetLocation()) {
                setWeather(gps.getLatitude(), gps.getLongitude());
            }
        }
        return view;
    }

    private void setWeather(double latitude, double longitude) {
        try {
            ApiWeather client = new ApiWeather();
            ApiWeather.setContext(getActivity());
            client.retrieveWeather(latitude, longitude, new ApiResponseHandler() {
                @Override
                public void onStart() {

                }

                @Override
                public void onFinish() {

                }

                @Override
                public void onSuccess(HashMap<String, String> dataReturned) {

                }

                @Override
                public void onError() {
                    Log.d("Icaro", "Get Data From Weather API Failure");
                    Toast.makeText(getActivity(), "HAY ERROR CONECTANDO", Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception e) {
            Log.e("API Error", Log.getStackTraceString(e));
        }
    }

    private void setWeather(String city) {
        try {
            ApiWeather client = new ApiWeather();
            ApiWeather.setContext(getActivity());
            client.retrieveWeather(city, new ApiResponseHandler() {
                @Override
                public void onStart() {

                }

                @Override
                public void onFinish() {

                }

                @Override
                public void onSuccess(HashMap<String, String> dataReturned) {

                }

                @Override
                public void onError() {
                    Log.d("Icaro", "Get Data From Weather API Failure");
                    Toast.makeText(getActivity(), "HAY ERROR CONECTANDO", Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception e) {
            Log.e("API Error", Log.getStackTraceString(e));
        }
    }
}
