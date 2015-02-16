package cl.bit01.icaro.ApiClient;
/*
 * Created by miguelost on 15-02-15.
 */

import android.content.Context;

public class ApiBusiness {
    private static Context mContext;

    public static void setContext(Context context) {
        ApiBusiness.mContext = context;
    }

    public void retrieveBusinessExplore(String business, boolean near, ApiResponseHandler responseHandler) {

    }
}
