package cl.mzapatae.icaro.Utils;/*
 * Created by miguelost on 30-01-15.
 */

import android.content.Context;
import android.util.Log;

import java.io.InputStream;

public class ApiKeyReader {

    public static String readApiKey(Context context, int keyFileResource) {
        String key = "";
        try {
            InputStream inputStream = context.getResources().openRawResource(keyFileResource);
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            key = new String(b);
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Read Error", "Cant get Keys File");
        }
        return key;
    }
}
