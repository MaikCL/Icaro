package cl.bit01.icaro.ApiClient;/*
 * Created by miguelost on 05-02-15.
 */

import android.content.Context;

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;

public class ApiWeather {
    private static Context mContext;
    private OkHttpClient httpClient = null;

    public ApiWeather() {
        httpClient = new OkHttpClient();
    }

    public static void setContext(Context context) {
        ApiWeather.mContext = context;
    }

    public void retrieveWeather(double latitude, double longitude, ApiResponseHandler handler) throws IOException {
    }

    public void retrieveWeather(String city, ApiResponseHandler handler) throws IOException {
    }
}
