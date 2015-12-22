package config;

import android.content.Context;

import animation.BgAction;
import animation.DialogAction;
import animation.PMDialAction;
import db.PMDataPref;
import utils.PMSingtonUtil;

/**
 * Created by nancymi on 12/22/15.
 */
public class AppRuntime {

    private Context context;

    public AppRuntime(Context context) {
        this.context = context;
    }

    public Context getAppContext() {
        return context;
    }
}
