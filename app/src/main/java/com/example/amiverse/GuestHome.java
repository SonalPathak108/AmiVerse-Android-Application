package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.nio.InvalidMarkException;

public class GuestHome extends AppCompatActivity {


    ImageView leader, quicklink;
    Button tour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        quicklink = (ImageView) findViewById(R.id.h_quick_link);
        leader = (ImageView) findViewById(R.id.h_contact_hierarchy);
        tour = (Button) findViewById(R.id.campustour);

        quicklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qlink = new Intent(GuestHome.this,Quick_links.class);
                startActivity(qlink);
            }
        });

        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lead = new Intent(GuestHome.this,Leadership_Activity.class);
                startActivity(lead);

            }
        });

        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/@26.2731402,78.2286453,2a,75y,130.83h,82.77t,4.78r/data=!3m6!1e1!3m4!1s-cChDfYbXDsjMIh7URz7uQ!2e0!7i13312!8i6656";
                Intent tour;
                tour = new Intent(Intent.ACTION_VIEW);
                tour.setData(Uri.parse(url));
                startActivity(tour);
            }
        });
    }
}
