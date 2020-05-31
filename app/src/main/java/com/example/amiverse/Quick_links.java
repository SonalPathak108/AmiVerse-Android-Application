package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Quick_links extends AppCompatActivity {

    TextView ami_place,ami_web,ami_dis,ami_program,ami_admission,ami_carrier;

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



    }
}
