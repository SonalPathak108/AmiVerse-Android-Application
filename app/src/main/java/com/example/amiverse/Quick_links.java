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

import com.google.android.material.navigation.NavigationView;

public class Quick_links extends AppCompatActivity {

    TextView ami_place,ami_web,ami_dis,ami_program,ami_admission,ami_carrier;

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_links);


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
        drawerLayout = (DrawerLayout) findViewById(R.id.drwaer_links);

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
