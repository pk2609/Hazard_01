package com.appexample.hazard_01;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash2 extends Activity {

    /** Duration of wait **/
    private final int Splas2_DISPLAY_LENGTH = 1500;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash2);

        /* New Handler to start the Menu-Activity
         * and close this Splas2-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
                boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);
                if(hasLoggedIn)
                {
                    Intent mainIntent = new Intent(Splash2.this, ChatActivity.class);
                    Splash2.this.startActivity(mainIntent);
                    Splash2.this.finish();
                }else {
                    Intent mainIntent = new Intent(Splash2.this, Login.class);
                    Splash2.this.startActivity(mainIntent);
                    Splash2.this.finish();
                }
            }
        }, Splas2_DISPLAY_LENGTH);
    }
}
