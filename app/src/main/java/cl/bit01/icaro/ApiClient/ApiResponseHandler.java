package cl.bit01.icaro.ApiClient;

import android.content.Context;
import android.widget.Toast;

import java.util.HashMap;

/*
 * Created by miguelost on 30-01-15.
 */
interface InterfaceApiResponseHandler {
    public void onSuccess(HashMap<String, String> response);

    public void onError();

    public void onError(Context mContext, int errorCode);

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
    public void onFinish() {

    }
}
