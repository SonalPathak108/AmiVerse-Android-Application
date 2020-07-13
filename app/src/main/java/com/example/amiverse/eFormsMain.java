package com.example.amiverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class eFormsMain extends AppCompatActivity {
    Button oval1, oval2;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eforms_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_eforms);

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

        oval1 = (Button) findViewById(R.id.oval1);
        oval1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register!", Toast.LENGTH_SHORT).show();
            }
        });
        oval2 = (Button) findViewById(R.id.oval2);
        oval2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register!", Toast.LENGTH_SHORT).show();
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
