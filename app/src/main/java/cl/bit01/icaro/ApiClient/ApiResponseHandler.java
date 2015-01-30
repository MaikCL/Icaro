package cl.bit01.icaro.ApiClient;

import java.util.HashMap;

/*
 * Created by miguelost on 30-01-15.
 */
interface InterfaceApiResponseHandler {
    public void onSuccess(HashMap<String, String> response);

    public void onError();

    public void onStart();

    public void onFinish();
}

public class ApiResponseHandler implements InterfaceApiResponseHandler {


    @Override
    public void onSuccess(HashMap<String, String> response) {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onFinish() {

    }
}
