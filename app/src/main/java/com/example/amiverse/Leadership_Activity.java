package com.example.amiverse;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.amiverse.R;

public class Leadership_Activity extends AppCompatActivity {
    TextView leadert1,leadert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership);
        leadert1 = (TextView) findViewById(R.id.textleader1);
        leadert1.setMovementMethod(LinkMovementMethod.getInstance());

        leadert2 = (TextView) findViewById(R.id.textleader2);
        leadert2.setMovementMethod(LinkMovementMethod.getInstance());


    }
}