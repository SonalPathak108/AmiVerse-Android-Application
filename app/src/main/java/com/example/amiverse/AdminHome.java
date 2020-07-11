package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.nio.InvalidMarkException;

public class AdminHome extends AppCompatActivity {


    ImageView photo, scorecard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);

        scorecard = (ImageView) findViewById(R.id.sangathan_admin);
        photo = (ImageView) findViewById(R.id.photo_upload);

        scorecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scorecard= new Intent(v.getContext(),Adminscoreboard.class);
                startActivity(scorecard);
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoupload = new Intent(AdminHome.this,UploadImage.class);
                startActivity(photoupload);

            }
        });
    }
}
