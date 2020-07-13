package com.example.amiverse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

import java.nio.InvalidMarkException;

public class GuestHome extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    ImageView leader, quicklink;
    Button tour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        quicklink = (ImageView) findViewById(R.id.h_quick_link);
        leader = (ImageView) findViewById(R.id.h_contact_hierarchy);
        tour = (Button) findViewById(R.id.campustour);

        quicklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qlink = new Intent(GuestHome.this,GuestQuickLinks.class);
                startActivity(qlink);
            }
        });

        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lead = new Intent(GuestHome.this,GuestLeadership.class);
                startActivity(lead);

            }
        });

        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/@26.2731402,78.2286453,2a,75y,130.83h,82.77t,4.78r/data=!3m6!1e1!3m4!1s-cChDfYbXDsjMIh7URz7uQ!2e0!7i13312!8i6656";
                Intent tour;
                tour = new Intent(Intent.ACTION_VIEW);
                tour.setData(Uri.parse(url));
                startActivity(tour);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_guest);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.m_guesthome:
                        Intent i1 = new Intent(getApplicationContext(), GuestHome.class);
                        startActivity(i1);
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
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
    @Override
    protected void onStop() {
        finish();
        super.onStop();
    }

}
