package com.example.amiverse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amiverse.GuestFragments.GuestHome;
import com.google.android.material.navigation.NavigationView;

import java.util.prefs.PreferenceChangeEvent;

public class Guesthome extends AppCompatActivity {

        private Fragment fragment;
        NavigationView nav;
        ActionBarDrawerToggle toggle;
        DrawerLayout drawerLayout;
        ImageView leader, quicklink;
        CardView tour;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_guesthome);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            nav = (NavigationView) findViewById(R.id.nav_view);
            drawerLayout = (DrawerLayout) findViewById(R.id.drawer_guest);

            toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            getSupportFragmentManager().beginTransaction().replace(R.id.guestcontent,new GuestHome()).commit();
            nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {

                        case R.id.m_guesthome:
                            fragment = new GuestHome();
                            break;

                        default:
                            throw new IllegalStateException("Unexpected value: " + item.getItemId());
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.guestcontent,fragment).commit();
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

    }
