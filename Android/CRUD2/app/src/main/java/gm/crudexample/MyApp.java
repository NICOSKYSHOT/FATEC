package gm.crudexample;

import android.app.Application;
import android.content.Context;

/**
 * Created by Gilian Marques on 28/09/2017.
 */

public class MyApp extends Application {

    private static Context mContext;


    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext() {
        return mContext;
    }


}
