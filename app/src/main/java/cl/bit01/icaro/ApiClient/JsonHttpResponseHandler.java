package cl.bit01.icaro.ApiClient;
/*
 * Created by miguelost on 30-01-15.
 */

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class JsonHttpResponseHandler implements Callback {
    protected ApiResponseHandler handler;

    public JsonHttpResponseHandler(ApiResponseHandler handler) {
        super();
        this.handler = handler;
    }

    @Override
    public void onFailure(Request request, IOException e) {

    }

    @Override
    public void onResponse(Response response) throws IOException {

    }
}
