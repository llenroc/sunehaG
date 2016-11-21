package in.gndec.sunehag;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jugraj on 19/11/16.
 */

public class StartupManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    int PRIVATE_MODE = 0;

    private static final String PREFERENCE_NAME = "";
    private static final String IS_FIRST_TIME_LAUNCH = "";

    public StartupManager(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREFERENCE_NAME,PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
