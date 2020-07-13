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
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class HomeMain extends AppCompatActivity {

    GridLayout mainGrid;
    ImageView quicklink,events,eforms,aumpclub,gallery,menu,scorecard;
    Button tour;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_homeMain);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.m_home:
                        Intent i1 = new Intent(getApplicationContext(), HomeMain.class);
                        startActivity(i1);
                        break;
                    case R.id.m_quicklinks:
                        Intent i2 = new Intent(getApplicationContext(), Quick_links.class);
                        startActivity(i2);
                        break;
                    case R.id.m_events:
                        Intent i3 = new Intent(getApplicationContext(), Upcoming_events.class);
                        startActivity(i3);
                        break;
                    case R.id.m_eforms:
                        Intent i4 = new Intent(getApplicationContext(), eFormsMain.class);
                        startActivity(i4);
                        break;

                    case R.id.m_aumpclubs:
                        Intent i5 = new Intent(getApplicationContext(), club_activity.class);
                        startActivity(i5);
                        break;

                    case R.id.m_gallery:
                        Intent i6 = new Intent(getApplicationContext(), gallery.class);
                        startActivity(i6);
                        break;

                    case R.id.m_scoreboard:
                        Intent i8 = new Intent(getApplicationContext(), scoreCard.class);
                        startActivity(i8);
                        break;


                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });



        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        quicklink = (ImageView) findViewById(R.id.h_quick_link);
        events = (ImageView) findViewById(R.id.h_events);
        eforms = (ImageView) findViewById(R.id.h_eforms);
        aumpclub = (ImageView) findViewById(R.id.h_clubs);
        gallery = (ImageView) findViewById(R.id.h_gallery);
        scorecard =(ImageView) findViewById(R.id.h_scorecard);
        tour = findViewById(R.id.campustour);



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

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
