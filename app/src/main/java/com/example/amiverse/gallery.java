package com.example.amiverse;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.amiverse.R;

public class gallery extends AppCompatActivity {
    TextView sangathan,amichroma,raising,clickomania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        sangathan = (TextView) findViewById(R.id.sangathan);
    sangathan.setMovementMethod(LinkMovementMethod.getInstance());

       amichroma = (TextView) findViewById(R.id.Amichroma);
        amichroma.setMovementMethod(LinkMovementMethod.getInstance());

       raising = (TextView) findViewById(R.id.Raising_day);
       raising.setMovementMethod(LinkMovementMethod.getInstance());
       clickomania = (TextView) findViewById(R.id.Click_o_mania);
     clickomania.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
