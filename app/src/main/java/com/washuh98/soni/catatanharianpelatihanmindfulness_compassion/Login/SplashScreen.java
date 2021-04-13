package com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.R;
import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Common;
import io.paperdb.Paper;


public class SplashScreen extends AppCompatActivity {
    ImageView splash;

    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim_splashscreen);
        splash = findViewById(R.id.sLogo);
        splash.startAnimation(anim);
        final Intent splash = new Intent(SplashScreen.this,LoginActivity.class);

        Paper.init(this);

        final String splash_Username = Paper.book().read(Common.USER_KEY);
        final String splash_Password = Paper.book().read(Common.PWD_KEY);

        Thread timer  = new Thread()
        {
            @Override
            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                finally {
                    if(splash_Username != null && splash_Password != null)
                    {
                        LoginPeserta(splash_Username,splash_Password);
                    }
                    else {
                        startActivity(splash);
                        finish();
                    }
                }
            }
        };
        timer.start();
    }

    private void LoginPeserta(final String username, final String password)
    {
        LoginPengurus(username,password);
    }

    private void LoginPengurus(final String username, final String password)
    {

    }
}