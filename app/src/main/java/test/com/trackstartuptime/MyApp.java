package test.com.trackstartuptime;

import android.app.Application;
import android.os.Debug;

/**
 * Created by WingHinChan on 2016/07/28.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Debug.startMethodTracing("startup");
    }

}
