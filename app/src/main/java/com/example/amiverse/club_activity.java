package com.example.amiverse;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
//import androidx.cardview.widget.CardView;

import android.app.UiAutomation;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class club_activity extends AppCompatActivity {
TextView coding_title,coding_des,eco_title,eco_des,literature_title,literature_des;
ImageView coding_img,eco_img,literature_img;
CardView club1,club2,club3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        coding_title=findViewById(R.id.title1);
        coding_des=findViewById(R.id.des1);
        coding_img=findViewById(R.id.club_img);
        eco_title=findViewById(R.id.title2);
        eco_des=findViewById(R.id.des2);
        eco_img=findViewById(R.id.eco_club2);
        literature_title=findViewById(R.id.title3);
        literature_des=findViewById(R.id.des3);
        literature_img=findViewById(R.id.parikalp);
        club1=findViewById(R.id.club1);
        club2=findViewById(R.id.club2);
        club3=findViewById(R.id.club3);
        coding_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://acc.amityaump.com/register/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }


}
