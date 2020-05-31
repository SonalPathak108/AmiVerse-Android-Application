package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class SplashMain extends AppCompatActivity {

    ImageView splash_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main);

        splash_image = (ImageView)findViewById(R.id.official_logo);
        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        splash_image.startAnimation(myAnim);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        sleep(3000);
                        Intent i = new Intent(SplashMain.this, HomeMain.class);
                        startActivity(i);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
        });

        thread.start();

    }


}
