package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;

public class CampusTour extends AppCompatActivity {
    TextView Laboratory_t,campus_t,_Sport,_Cafeteria,_Hostal;
     ImageView Laboratory_img,Campus_img,_sport,_cafe,_hostal;
     Button tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campustour);


        Laboratory_t = findViewById(R.id.laboratry);
        Laboratory_img = findViewById(R.id.lab);
        campus_t = findViewById(R.id.campus);
        Campus_img = findViewById(R.id.campusimg);
        tour = findViewById(R.id.campustour);
        _Sport=findViewById(R.id.Sport);
        _Cafeteria=findViewById(R.id.cafeteria);
        _Hostal=findViewById(R.id.Hostal);
        _sport=findViewById(R.id.sport);
        _cafe=findViewById(R.id.cafe);
        _hostal=findViewById(R.id.hostal);


        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/@26.2731402,78.2286453,2a,75y,130.83h,82.77t,4.78r/data=!3m6!1e1!3m4!1s-cChDfYbXDsjMIh7URz7uQ!2e0!7i13312!8i6656";
                Intent i;
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }

}
