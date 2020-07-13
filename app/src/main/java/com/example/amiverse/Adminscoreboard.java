package com.example.amiverse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.navigation.NavigationView;

import java.util.HashMap;
import java.util.Map;

public class Adminscoreboard extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;


    EditText score, bronzeMedal, silverMedal, goldMedal;
    String Departement;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_scoreboard);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Block, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        score = (EditText) findViewById(R.id.score);
        bronzeMedal = (EditText) findViewById(R.id.bronze);
        silverMedal = (EditText) findViewById(R.id.silver);
        goldMedal = (EditText) findViewById(R.id.gold);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String Score = score.getText().toString().trim();
                final String Bronze = bronzeMedal.getText().toString().trim();
                final String Gold = goldMedal.getText().toString().trim();
                final String Silver = silverMedal.getText().toString().trim();


                StringRequest request = new StringRequest(Request.Method.POST, "https://ep4.virtualmist.com/amiverse/AdminScoreCard.php", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        score.setText("");
                        bronzeMedal.setText("");
                        silverMedal.setText("");
                        goldMedal.setText("");

                        Log.d("asd", response);
                        Toast.makeText(Adminscoreboard.this, response, Toast.LENGTH_SHORT).show();
                    }
                },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                                Toast.makeText(Adminscoreboard.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                ) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {

                        Map<String, String> map = new HashMap<String, String>();

                        map.put("Score", Score);
                        map.put("BronzeMedal", Bronze);
                        map.put("GoldMedal", Gold);
                        map.put("SilverMedal", Silver);
                        map.put("Departement", Departement);
                        return map;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(Adminscoreboard.this);
                requestQueue.add(request);

            }

        });




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_admin_scoreC);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.m_Adminhome:
                        Intent i1 = new Intent(getApplicationContext(), AdminHome.class);
                        startActivity(i1);
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Departement = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onStop() {
        finish();
        super.onStop();
    }
}
