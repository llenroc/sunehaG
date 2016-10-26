package in.gndec.sunehag.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.gndec.sunehag.R;
import in.gndec.sunehag.entities.Conversation;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		startActivity(new Intent(WelcomeActivity.this, ConversationActivity.class));
		finish();
	}

}
