package com.example.amiverse;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

public class eFormsMain extends AppCompatActivity {
    Button oval1,oval2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eforms_main);
        oval1 = (Button) findViewById(R.id.oval1);
        oval1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"Register!",Toast.LENGTH_SHORT).show();
        }
    });
        oval2 = (Button) findViewById(R.id.oval2);
        oval2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Register!",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
