package com.example.amiverse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.amiverse.GuestFragments.GuestHome;
import com.google.android.material.navigation.NavigationView;

public class GuestQuickLinks extends AppCompatActivity {

    TextView ami_place,ami_web,ami_dis,ami_program,ami_admission,ami_carrier;

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_quick_links);


        //Getting refernce to link when it is click on
        ami_place = (TextView) findViewById(R.id.amity_placement);
        ami_place.setMovementMethod(LinkMovementMethod.getInstance());

        ami_web = (TextView) findViewById(R.id.amity_web);
        ami_web.setMovementMethod(LinkMovementMethod.getInstance());

        ami_dis = (TextView) findViewById(R.id.amity_dist_learn);
        ami_dis.setMovementMethod(LinkMovementMethod.getInstance());

        ami_program = (TextView) findViewById(R.id.programs);
        ami_program.setMovementMethod(LinkMovementMethod.getInstance());

        ami_admission = (TextView) findViewById(R.id.admission);
        ami_admission.setMovementMethod(LinkMovementMethod.getInstance());

        ami_carrier = (TextView) findViewById(R.id.carrier);
        ami_carrier.setMovementMethod(LinkMovementMethod.getInstance());


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drwaer_Glinks);

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
    protected void onStop() {
        finish();
        super.onStop();
    }
}
