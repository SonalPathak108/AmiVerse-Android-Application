package com.example.amiverse;


import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Upcoming_events extends AppCompatActivity {

    TextView amity_sangathan;
    TextView amichroma;
    TextView mediafest;
    TextView conference;

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);

        amity_sangathan = (TextView) findViewById(R.id.amity_sangathan);
        amity_sangathan.setMovementMethod(LinkMovementMethod.getInstance());

        amichroma = (TextView) findViewById(R.id.amichroma);
        amichroma.setMovementMethod(LinkMovementMethod.getInstance());

        mediafest = (TextView) findViewById(R.id.mediafest);
        mediafest.setMovementMethod(LinkMovementMethod.getInstance());

        conference = (TextView) findViewById(R.id.conference);
        conference.setMovementMethod(LinkMovementMethod.getInstance());


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_upcoming_event);

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


    }
    @Override
    protected void onStop() {
        finish();
        super.onStop();
    }
}
