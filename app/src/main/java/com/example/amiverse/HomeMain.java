package com.example.amiverse;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.amiverse.AmitiansFragments.Eforms;
import com.example.amiverse.AmitiansFragments.QuickLinks;
import com.example.amiverse.AmitiansFragments.UpcomingEvents;
import com.example.amiverse.AmitiansFragments.clubs;
import com.example.amiverse.AmitiansFragments.gallert;
import com.example.amiverse.AmitiansFragments.scorecard;
import com.google.android.material.navigation.NavigationView;

public class HomeMain extends AppCompatActivity {

    private Fragment fragment;
    private int checkedItem = 0;
    private boolean navItemSelected = false;

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    TextView toolbarText;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        toolbarText = (TextView) findViewById(R.id.toolbarText);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_homeMain);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.cont,new com.example.amiverse.AmitiansFragments.HomeMain()).commit();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                switch (item.getItemId()) {
                    case R.id.m_home:
                        checkedItem = R.id.m_home;
                        //Intent i1 = new Intent(getApplicationContext(), HomeMain.class);
                        //startActivity(i1);
                        toolbarText.setText("AmiHome");
                        fragment = new com.example.amiverse.AmitiansFragments.HomeMain();
                        break;
                   case R.id.m_quicklinks:
                       toolbarText.setText("Quick Links");
                       fragment = new QuickLinks();
                        break;
                    case R.id.m_events:

                        toolbarText.setText("Upcoming Events");
                        fragment = new UpcomingEvents();
                        break;
                    case R.id.m_eforms:
                       toolbarText.setText("EForms");
                       fragment = new Eforms();
                        break;

                     case R.id.m_aumpclubs:
                        toolbarText.setText("AUMP Clubs");
                        fragment = new clubs();
                         break;

                    case R.id.m_gallery:

                        toolbarText.setText("Gallery");
                        fragment = new gallert();
                        break;

                    case R.id.m_scoreboard:
                       toolbarText.setText("ScoreCard");
                       fragment = new scorecard();
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                getSupportFragmentManager().beginTransaction().replace(R.id.cont,fragment).commit();
                return true;
            }
        });



       /* mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        quicklink = (ImageView) findViewById(R.id.h_quick_link);
        events = (ImageView) findViewById(R.id.h_events);
        eforms = (ImageView) findViewById(R.id.h_eforms);
        aumpclub = (ImageView) findViewById(R.id.h_clubs);
        gallery = (ImageView) findViewById(R.id.h_gallery);
        scorecard =(ImageView) findViewById(R.id.h_scorecard);
        tour = (CardView) findViewById(R.id.tour);



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

        */
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
