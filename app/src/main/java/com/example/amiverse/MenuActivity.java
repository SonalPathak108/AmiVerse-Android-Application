package com.example.amiverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    EditText name;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout = findViewById(R.id.draw);
        name = findViewById(R.id.name);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = String.valueOf(name.getText());
                Intent intent = null;
                intent.putExtra("name",Name);
                startActivity(intent);
            }
        });

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState==null){
            //getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new HomeFragment()).commit();
            //navigationView.setCheckedItem(R.id.home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.m_home:
                Intent i1 = new Intent(this,HomeMain.class);
                startActivity(i1);
                break;
            case R.id.m_quicklinks:
                Intent i2 = new Intent(this,Quick_links.class);
                startActivity(i2);
                break;
            case R.id.m_events:
                Intent i3 = new Intent(this,Upcoming_events.class);
                startActivity(i3);
            break;
            case R.id.m_eforms:
                Intent i4 = new Intent(this,eFormsMain.class);
                startActivity(i4);
            break;

            case R.id.m_aumpclubs:
                Intent i5 = new Intent(this,club_activity.class);
                startActivity(i5);
            break;

            case R.id.m_gallery:
                Intent i6 = new Intent(this,gallery.class);
                startActivity(i6);
            break;

            case R.id.m_scoreboard:
                Intent i8 = new Intent(this,scoreCard.class);
                startActivity(i8);
            break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}




