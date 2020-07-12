package com.example.amiverse;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

//import androidx.cardview.widget.CardView;


public class club_activity extends AppCompatActivity {
    TextView coding_title, coding_des, eco_title, eco_des, literature_title, literature_des;
    ImageView coding_img, eco_img, literature_img;
    CardView club1, club2, club3;

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        coding_title = findViewById(R.id.title1);
        coding_des = findViewById(R.id.des1);
        coding_img = findViewById(R.id.club_img);
        eco_title = findViewById(R.id.title2);
        eco_des = findViewById(R.id.des2);
        eco_img = findViewById(R.id.eco_club2);
        literature_title = findViewById(R.id.title3);
        literature_des = findViewById(R.id.des3);
        literature_img = findViewById(R.id.parikalp);
        club1 = findViewById(R.id.club1);
        club2 = findViewById(R.id.club2);
        club3 = findViewById(R.id.club3);
        coding_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://accmp.co.in/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_clubs);

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
