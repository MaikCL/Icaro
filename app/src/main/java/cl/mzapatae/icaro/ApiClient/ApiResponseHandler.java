package cl.mzapatae.icaro.ApiClient;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;
import java.util.List;

import cl.mzapatae.icaro.ModelData.Gson.FoursquareSearchJSON;
import cl.mzapatae.icaro.Utils.GPSTracker;

/*
 * Created by miguelost on 30-01-15.
 */
interface InterfaceApiResponseHandler {
    public void onSuccess(HashMap<String, String> response);

    public void onSuccess(List<HashMap> response);

    public void onSuccess(FoursquareSearchJSON foursquareGson);

    public void onError();

    public void onError(Context mContext, int errorCode);

    public void onStart();

    public LatLng getCurrentPosition(Context mContext);

    public void onFinish();
}

public class ApiResponseHandler implements InterfaceApiResponseHandler {

    @Override
    public void onSuccess(HashMap<String, String> response) {
    }

    public void onSuccess(List<HashMap> response) {
    }

    public void onSuccess(FoursquareSearchJSON foursquareGson) {
    }

    @Override
    public void onError() {
    }

    //Todo: DEPRECATED - Remove this method and use Utils.ErrorManager
    @Override
    public void onError(Context mContext, int errorCode) {
        if (errorCode == 0)
            Toast.makeText(mContext, "Los datos descargados estan corruptos", Toast.LENGTH_SHORT).show();
        if (errorCode == 1)
            Toast.makeText(mContext, "Hay problemas accediendo al servicio", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
    }

    @Override
    public LatLng getCurrentPosition(Context mContext) {
        GPSTracker gps = new GPSTracker(mContext);
        if (gps.canGetLocation()) {
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();
            Log.d("ApiResponseHandler", "Returned Lat/Lng: " + latitude + "," + longitude);
            return new LatLng(latitude, longitude);
        } else {
            return null;
        }
    }

    @Override
    public void onFinish() {
    }
}
