package config;

import android.app.Application;

import config.AppRuntime;

/**
 * Created by nancymi on 12/20/15.
 */
public class MyApplication extends Application {

    private static AppRuntime appRuntime;

    @Override
    public void onCreate() {
        super.onCreate();
        appRuntime = new AppRuntime(getApplicationContext());
    }

    public static AppRuntime getAppRuntime() {
        return appRuntime;
    }
}
