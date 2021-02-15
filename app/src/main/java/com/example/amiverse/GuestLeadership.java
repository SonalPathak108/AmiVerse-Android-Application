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
import com.example.amiverse.R;
import com.google.android.material.navigation.NavigationView;

public class GuestLeadership extends AppCompatActivity {
    TextView leadert1,leadert2;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_leadership);
        leadert1 = (TextView) findViewById(R.id.textleader1);
        leadert1.setMovementMethod(LinkMovementMethod.getInstance());

        leadert2 = (TextView) findViewById(R.id.textleader2);
        leadert2.setMovementMethod(LinkMovementMethod.getInstance());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_Gleadership);

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
