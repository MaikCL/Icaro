package cl.bit01.icaro.ApiClient;
/*
 * Created by miguelost on 05-02-15.
 */

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;
import java.text.Normalizer;
import java.util.HashMap;

import cl.bit01.icaro.R;
import cl.bit01.icaro.Utils.ApiKeyReader;

public class ApiWeather {
    private static Context mContext;
    private static String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";
    private static String URL_OPTIONS = "&units=metric&lang=sp&type=like";
    private OkHttpClient httpClient = null;
    private String apiKey;

    public ApiWeather() {
        httpClient = new OkHttpClient();
    }

    public static void setContext(Context context) {
        ApiWeather.mContext = context;
    }

    public void retrieveWeather(double latitude, double longitude, ApiResponseHandler handler) throws IOException {
        apiKey = mContext.getResources().getString(R.string.key_OpenWeatherMap);
        String url = BASE_URL + "lat=" + latitude + "&lon=" + longitude + URL_OPTIONS + "&appid=" + apiKey;
        handler.onStart();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-Access-Token", apiKey)
                .build();

        httpClient.newCall(request).enqueue(getInfoParse(handler));
    }

    public void retrieveWeather(String city, ApiResponseHandler handler) throws IOException {
        apiKey = ApiKeyReader.readApiKey(mContext, R.raw.key_open_weather_map);
        String url = BASE_URL + "q=" + city.replace(" ", "+") + URL_OPTIONS + "&appid=" + apiKey;
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

                        String weatherStatus = Normalizer.normalize(
                                apiReturnedData.getJSONArray("weather")
                                        .getJSONObject(0)
                                        .getString("description"), Normalizer.Form.NFD)
                                .replaceAll("[^\\p{ASCII}]", "");

                        int weatherTemp = (int) Math.round(Double.parseDouble(
                                apiReturnedData.getJSONObject("main").getString("temp")));

                        int weatherTempMin = (int) Math.round(Double.parseDouble(
                                apiReturnedData.getJSONObject("main").getString("temp_min")));

                        int weatherTempMax = (int) Math.round(Double.parseDouble(
                                apiReturnedData.getJSONObject("main").getString("temp_max")));

                        String weatherHumidity = apiReturnedData.getJSONObject("main").getString("humidity");

                        String weatherCity = apiReturnedData.getString("name");

                        String weatherCountry = apiReturnedData.getJSONObject("sys").getString("country");

                        String weatherCode = apiReturnedData.getJSONArray("weather")
                                .getJSONObject(0).getString("icon");

                        dataValues.put("status", weatherStatus);
                        dataValues.put("temperature", String.valueOf(weatherTemp));
                        dataValues.put("temperatureMin", String.valueOf(weatherTempMin));
                        dataValues.put("temperatureMax", String.valueOf(weatherTempMax));
                        dataValues.put("humidity", weatherHumidity);
                        dataValues.put("city", weatherCity);
                        dataValues.put("country", weatherCountry);
                        dataValues.put("code", weatherCode);
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
                    Log.e("Error Api Weather", "Cant parse data");
                    Log.e("Icaro Api Weather", e.getMessage());
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            handler.onError(mContext, 0);
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
                        handler.onError(mContext, 1);
                        handler.onFinish();
                    }
                });
            }
        };
    }
}
