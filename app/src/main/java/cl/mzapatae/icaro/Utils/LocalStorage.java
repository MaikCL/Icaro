package cl.mzapatae.icaro.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/*
 * Created by mzapata on 22-04-2015.
 */
public class LocalStorage {
    private static final String SHARED_PREFERENCE_FILE = "cl.mzapatae.icaro.local_storage";
    private static final String KEY_REMEMBER_DATA = "remember_data";
    private static final String KEY_ALLOW_VOICESCREEN = "allow_voicescreen";

    private static SharedPreferences SHARED_PREFERENCE;
    private static SharedPreferences.Editor PREFERENCE_EDITOR;

    public static void initLocalStorage(Context context) {
        SHARED_PREFERENCE = context.getSharedPreferences(SHARED_PREFERENCE_FILE, Activity.MODE_PRIVATE);
    }

    public static String getRemember() {
        return SHARED_PREFERENCE.getString(KEY_REMEMBER_DATA, "No existen recordatorios");
    }

    public static void setRemember(String remember) {
        PREFERENCE_EDITOR = SHARED_PREFERENCE.edit();
        PREFERENCE_EDITOR.putString(KEY_REMEMBER_DATA, remember);
        PREFERENCE_EDITOR.apply();
    }

    public static boolean getAllowVoiceScreen() {
        return SHARED_PREFERENCE.getBoolean(KEY_ALLOW_VOICESCREEN, false);
    }

    public static void setAllowVoiceScreen(boolean status) {
        PREFERENCE_EDITOR = SHARED_PREFERENCE.edit();
        PREFERENCE_EDITOR.putBoolean(KEY_ALLOW_VOICESCREEN, status);
        PREFERENCE_EDITOR.apply();
    }
}
