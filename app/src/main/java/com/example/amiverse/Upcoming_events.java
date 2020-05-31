package com.example.amiverse;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Upcoming_events extends AppCompatActivity {

    TextView amity_sangathan;
    TextView amichroma;
    TextView mediafest;
    TextView conference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);

        amity_sangathan = (TextView) findViewById(R.id.amity_sangathan);
        amity_sangathan.setMovementMethod(LinkMovementMethod.getInstance());

        amichroma = (TextView) findViewById(R.id.amichroma);
        amichroma.setMovementMethod(LinkMovementMethod.getInstance());

        mediafest = (TextView) findViewById(R.id.mediafest);
        mediafest.setMovementMethod(LinkMovementMethod.getInstance());

        conference = (TextView) findViewById(R.id.conference);
        conference.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
