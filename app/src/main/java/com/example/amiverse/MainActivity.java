package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button adminpanel, studentpanel , otherspanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adminpanel = (Button) findViewById(R.id.admin);
        studentpanel= (Button) findViewById(R.id.student);
        otherspanel = (Button) findViewById(R.id.others);

        adminpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AdminLogin.class));
                //Toast.makeText(MainActivity.this, "You have choose Admin Panel",Toast.LENGTH_SHORT).show();
            }
        });

        studentpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });

        otherspanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You have choose Other Panel",Toast.LENGTH_SHORT).show();

            }
        });

    }
}