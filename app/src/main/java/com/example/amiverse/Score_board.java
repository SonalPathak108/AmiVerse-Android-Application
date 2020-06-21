package com.example.amiverse;

//import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
//import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score_board extends AppCompatActivity {

//TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
//        TextView  textview =(TextView) findViewById(R.id.Abs_gold);
//        TextView  textview1 =(TextView) findViewById(R.id.Abs_silver);
//        TextView  textview2 =(TextView) findViewById(R.id.Abs_bronze);
//        TextView  textview3 =(TextView) findViewById(R.id.Abs_score);
//        TextView  textview4 =(TextView) findViewById(R.id.Als_gold);
//        TextView  textview5 =(TextView) findViewById(R.id.Als_silver);
//        TextView  textview6 =(TextView) findViewById(R.id.Als_bronze);
//        TextView  textview7 =(TextView) findViewById(R.id.Als_score);
//        TextView  textview8 =(TextView) findViewById(R.id.Aset_gold);
//        TextView  textview9 =(TextView) findViewById(R.id.Aset_silver);

//        TextView  textview11 =(TextView) findViewById(R.id.Aset_bronze);
//        TextView  textview12 =(TextView) findViewById(R.id.Aset_score);
//        TextView  textview13 =(TextView) findViewById(R.id.Asco_gold);
//        TextView  textview14 =(TextView) findViewById(R.id.Asco_silver);
//        TextView  textview15=(TextView) findViewById(R.id.Asco_bronze);
//        TextView  textview16 =(TextView) findViewById(R.id.Asco_score;
//        TextView  textview17=(TextView) findViewById(R.id.Aibas_gold);
//        TextView  textview18=(TextView) findViewById(R.id.Aibas_silver);
//        TextView  textview19 =(TextView) findViewById(R.id.Aibas_bronze);
//        TextView  textview20=(TextView) findViewById(R.id.Aibas_score);
//        TextView  textview21=(TextView) findViewById(R.id.Asp_gold);
//        TextView  textview22 =(TextView) findViewById(R.id.Asp_silver);
//        TextView  textview23=(TextView) findViewById(R.id.Asp_bronze);
//        TextView  textview24=(TextView) findViewById(R.id.Asp_score);
//        TextView  textview25=(TextView) findViewById(R.id.Afd_gold);
//        TextView  textview26=(TextView) findViewById(R.id.Afd_silver);
//        TextView  textview27 =(TextView) findViewById(R.id.Afd_bronze);
//        TextView  textview28=(TextView) findViewById(R.id.Afd_score);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.scoreboardmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item)
    {
        int id=item.getItemId();
        switch(id){
            case R.id.notice:
                return true;
            case R.id.announcement:

            case R.id.resultpdf:



        }
        return super.onOptionsItemSelected(item);
    }
}