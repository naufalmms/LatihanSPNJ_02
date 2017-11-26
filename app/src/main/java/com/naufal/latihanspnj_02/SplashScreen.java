package com.naufal.latihanspnj_02;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        splashAja();

    }


    public void splashAja()
    {
        logo = findViewById(R.id.logosplash);
        AlphaAnimation animation1 = new AlphaAnimation(0.0f,1.0f);
        animation1.setDuration(1000);
        animation1.setStartOffset(1000);

        logo.startAnimation(animation1);

        Thread timerThread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this,Sign.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();


    }
}
