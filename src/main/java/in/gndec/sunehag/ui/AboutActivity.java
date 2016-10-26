package in.gndec.sunehag.ui;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;

import in.gndec.sunehag.R;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Boolean dark = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                        .getString("theme", "light").equals("dark");
        int mTheme = dark ? R.style.ConversationsTheme_Dark : R.style.ConversationsTheme;
        setTheme(mTheme);

        setContentView(R.layout.activity_about);
    }
}
