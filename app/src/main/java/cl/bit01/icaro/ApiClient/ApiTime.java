package cl.bit01.icaro.ApiClient;
/*
 * Created by miguelost on 30-01-15.
 */

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.ApiKeyReader;

public class ApiTime {
    private static String BASE_URL = "http://api.worldweatheronline.com/free/v1/tz.ashx?";
    private static Context mContext;
    private OkHttpClient httpClient = null;
    private String apiKey;

    public ApiTime() {
        httpClient = new OkHttpClient();
    }

    public static void setContext(Context context) {
        ApiTime.mContext = context;
    }

    public void retrieveWorldTime(double latitude, double longitude, ApiResponseHandler handler) throws IOException {
        apiKey = ApiKeyReader.readApiKey(mContext, R.raw.key_world_weather_online);
        String url = BASE_URL + "key=" + apiKey + "&q=" + latitude + "," + longitude + "&format=json";
        handler.onStart();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-Access-Token", apiKey)
                .build();

        httpClient.newCall(request).enqueue(getInfoParse(handler));
    }

    public void retrieveWorldTime(String city, ApiResponseHandler handler) throws IOException {
        apiKey = ApiKeyReader.readApiKey(mContext, R.raw.key_world_weather_online);
        String url = BASE_URL + "key=" + apiKey + "&q=" + city + "&format=json";
        handler.onStart();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-Access-Token", apiKey)
                .build();

        httpClient.newCall(request).enqueue(getInfoParse(handler));
    }

    private JsonHttpResponseHandler getInfoParse(final ApiResponseHandler handler) {
        final Handler mainHandler = new Handler(Looper.getMainLooper());
        return new JsonHttpResponseHandler(handler) {
            @Override
            public void onResponse(final Response response) throws IOException {
                final HashMap<String, String> dataValues = new HashMap<>();
                try {
                    final JSONObject apiReturnedData = new JSONObject(response.body().string());
                    for (int i = 0; i < apiReturnedData.length(); i++) {

                        String localtime = apiReturnedData.getJSONObject("data")
                                .getJSONArray("time_zone").getJSONObject(0)
                                .getString("localtime");
                        String query = apiReturnedData.getJSONObject("data")
                                .getJSONArray("request").getJSONObject(0)
                                .getString("query");

                        if (!localtime.isEmpty() && !query.isEmpty()) {
                            dataValues.put("hour", localtime.substring(11, 13));
                            dataValues.put("minutes", localtime.substring(14, 16));
                        }
                    }
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            handler.onSuccess(dataValues);
                            handler.onFinish();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
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