package cl.bit01.icaro.ApiClient;
/*
 * Created by miguelost on 15-02-15.
 */

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.HashMap;

import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.ErrorManager;

public class ApiBusiness {
    private static Context mContext;
    private static String BASE_URL = "https://api.foursquare.com/v2/venues";
    private static String API_VERSION = "20130815";
    private static String URL_OPTIONS = "&limit=15&venuePhotos=1&locale=es";
    private static String SEARCH_MODE = "/search?";
    private static String EXPLORE_MODE = "/explore?";
    private static String apiSecret;
    private static String apiId;
    private double userLatitude;
    private double userLongitude;

    private OkHttpClient httpClient = null;

    public ApiBusiness() {
        httpClient = new OkHttpClient();
    }

    public static void setContext(Context context) {
        ApiBusiness.mContext = context;
    }

    public void retrieveBusinessExplore(String business, boolean near, ApiResponseHandler handler) {
        apiSecret = mContext.getResources().getString(R.string.clientSecret_Foursquare);
        apiId = mContext.getResources().getString(R.string.clientId_Foursquare);

        LatLng currentPosition = handler.getCurrentPosition(mContext);
        if (currentPosition != null) {
            userLatitude = currentPosition.latitude;
            userLongitude = currentPosition.longitude;

            String url = BASE_URL + EXPLORE_MODE + "client_id=" + apiId +
                    "&client_secret=" + apiSecret + "&v=" + API_VERSION +
                    URL_OPTIONS + "&query=" + business.replace(" ", "%20") +
                    "&ll=" + userLatitude + "," + userLongitude;

            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("X-Access-Token", apiId)
                    .build();

            httpClient.newCall(request).enqueue(parseData(handler));
        } else {
            ErrorManager.notify(mContext, 1002);
            ErrorManager.logError("ApiBussines.java", "GeoCoder Error", "Lat/Lng is null");
        }
    }

    private JsonHttpResponseHandler parseData(final ApiResponseHandler handler) {
        final Handler mainHandler = new Handler(Looper.getMainLooper());
        return new JsonHttpResponseHandler(handler) {
            @Override
            public void onResponse(final Response response) throws IOException {
                final HashMap<String, String> dataValues = new HashMap<>();
                Log.d("Icaro", response.body().string());
            }

            @Override
            public void onFailure(Request request, IOException e) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        handler.onError(mContext, 1);
                        handler.onFinish();
                    }
                });
            }
        };
    }
}
