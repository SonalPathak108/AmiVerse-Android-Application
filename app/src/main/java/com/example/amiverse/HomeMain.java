package com.example.amiverse;


import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeMain extends AppCompatActivity {

    GridLayout mainGrid;
    ImageView quicklink,events,eforms,aumpclub,gallery,menu,scorecard;
    Button tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        quicklink = (ImageView) findViewById(R.id.h_quick_link);
        events = (ImageView) findViewById(R.id.h_events);
        eforms = (ImageView) findViewById(R.id.h_eforms);
        aumpclub = (ImageView) findViewById(R.id.h_clubs);
        gallery = (ImageView) findViewById(R.id.h_gallery);
        scorecard =(ImageView) findViewById(R.id.h_scorecard);
        tour = findViewById(R.id.campustour);
        menu= findViewById(R.id.imageView2);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageView2 = new Intent(v.getContext(),MenuActivity.class);
                startActivity(imageView2);
            }
        });



        quicklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qlink = new Intent(v.getContext(),Quick_links.class);
                startActivity(qlink);
            }
        });

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent event = new Intent(v.getContext(),Upcoming_events.class);
                startActivity(event);
            }
        });

        eforms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eform = new Intent(v.getContext(),eFormsMain.class);
                startActivity(eform);
            }
        });

        aumpclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent auclub = new Intent(v.getContext(),club_activity.class);
                startActivity(auclub);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent gal = new Intent(v.getContext(),gallery.class);
                   startActivity(gal);
               }
           });

        scorecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scorecard= new Intent(v.getContext(),scoreCard.class);
                startActivity(scorecard);
            }
        });

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
