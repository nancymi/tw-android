package utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.nancymi.twandroid.MainActivity;

import animation.BgAction;
import animation.BgActionImpl;
import animation.DialogAction;
import animation.DialogActionImpl;
import animation.PMDialAction;
import animation.PMDialActionImpl;
import config.MyApplication;
import db.PMDataPref;

/**
 * Created by nancymi on 12/20/15.
 */
public class PMSingtonUtil {

    private static PMDataPref pmDataPref;

    private static RequestQueue requestQueue;

    private static final Context APP_CONTEXT =
            MyApplication.getAppRuntime().getAppContext();

    public static synchronized PMDataPref getPmDataPref() {
        if (pmDataPref == null) {
            pmDataPref = new PMDataPref(APP_CONTEXT);
        }
        return pmDataPref;
    }

    public static synchronized RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(APP_CONTEXT);
        }
        return requestQueue;
    }
}
