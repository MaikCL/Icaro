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

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
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

    public void retrieveBusinessExplore(String business, boolean near, ApiResponseHandler handler) throws IOException {
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

            handler.onStart();
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
                final ArrayList<HashMap> businessList = new ArrayList<>();
                try {
                    final JSONObject apiReturnedData = new JSONObject(response.body().string());
                    int countResults = Integer.parseInt(apiReturnedData.getJSONObject("response").getString("totalResults"));
                    if (countResults >= 20) countResults = 20;

                    for (int i = 0; i < countResults - 1; i++) {
                        final HashMap<String, String> dataValues = new HashMap<>();
                        JSONObject businessData = apiReturnedData
                                .getJSONObject("response")
                                .getJSONArray("groups")
                                .getJSONObject(0)
                                .getJSONArray("items")
                                .getJSONObject(i)
                                .getJSONObject("venue");

                        if (businessData.has("name"))
                            dataValues.put("name", businessData.getString("name"));
                        else dataValues.put("name", "No registrado");

                        if (businessData.getJSONObject("contact").has("phone"))
                            dataValues.put("phone", businessData.getJSONObject("contact").getString("formattedPhone"));
                        else dataValues.put("phone", "No disponible");

                        if (businessData.getJSONObject("location").has("address"))
                            dataValues.put("address", businessData.getJSONObject("location").getString("address"));
                        else dataValues.put("address", "No disponible");

                        if (businessData.getJSONObject("location").has("crossStreet"))
                            dataValues.put("crossStreet", businessData.getJSONObject("location").getString("crossStreet"));
                        else dataValues.put("crossStreet", "No existe ninguna calle de referencia");

                        if (businessData.getJSONObject("location").has("lat"))
                            dataValues.put("latitude", businessData.getJSONObject("location").getString("lat"));
                        else dataValues.put("latitude", "null");

                        if (businessData.getJSONObject("location").has("lng"))
                            dataValues.put("longitude", businessData.getJSONObject("location").getString("lng"));
                        else dataValues.put("longitude", "null");

                        if (businessData.getJSONObject("location").has("distance"))
                            dataValues.put("distance", businessData.getJSONObject("location").getString("distance"));
                        else dataValues.put("distance", "Desconocida");

                        if (businessData.getJSONObject("location").has("city"))
                            dataValues.put("city", businessData.getJSONObject("location").getString("city"));
                        else dataValues.put("city", "Desconocida");

                        businessList.add(dataValues);
                    }
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            handler.onSuccess(businessList);
                            handler.onFinish();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("Error Api Bussiness", "Cant parse data");
                    Log.e("Icaro Api Bussines", e.getMessage());
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            handler.onError();
                            handler.onFinish();
                        }
                    });
                }
            }

            @Override
            public void onFailure(Request request, IOException e) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        handler.onError();
                        handler.onFinish();
                    }
                });
            }
        };
    }
}
