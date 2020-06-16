package com.example.amiverse;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeMain extends AppCompatActivity {

    GridLayout mainGrid;
    ImageView quicklink,events,eforms,aumpclub,gallery,leadership;

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
        leadership = (ImageView) findViewById(R.id.h_contact_hierarchy);

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

        leadership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leader_ship= new Intent(v.getContext(),Leadership_Activity.class);
                startActivity(leader_ship);
            }
        });
    }


}
