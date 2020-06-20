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
//        TextView  textview =(TextView) findViewById(R.id.tv1);
//        TextView  textview1 =(TextView) findViewById(R.id.tv2);
//        TextView  textview2 =(TextView) findViewById(R.id.tv3);
//        TextView  textview3 =(TextView) findViewById(R.id.tv4);
//        TextView  textview4 =(TextView) findViewById(R.id.tv5);
//        TextView  textview5 =(TextView) findViewById(R.id.tv6);
//        TextView  textview6 =(TextView) findViewById(R.id.tv7);
//        TextView  textview7 =(TextView) findViewById(R.id.tv8);
//        TextView  textview8 =(TextView) findViewById(R.id.tv9);
//        TextView  textview9 =(TextView) findViewById(R.id.tv10);

//        TextView  textview11 =(TextView) findViewById(R.id.tv11);
//        TextView  textview12 =(TextView) findViewById(R.id.tv12);
//        TextView  textview13 =(TextView) findViewById(R.id.tv13);
//        TextView  textview14 =(TextView) findViewById(R.id.tv14);
//        TextView  textview15=(TextView) findViewById(R.id.tv15);
//        TextView  textview16 =(TextView) findViewById(R.id.tv16);
//        TextView  textview17=(TextView) findViewById(R.id.tv17);
//        TextView  textview18=(TextView) findViewById(R.id.tv18);
//        TextView  textview19 =(TextView) findViewById(R.id.tv19);
//        TextView  textview20=(TextView) findViewById(R.id.tv20);
//        TextView  textview21=(TextView) findViewById(R.id.tv21);
//        TextView  textview22 =(TextView) findViewById(R.id.tv22);
//        TextView  textview23=(TextView) findViewById(R.id.tv23);
//        TextView  textview24=(TextView) findViewById(R.id.tv24);
//        TextView  textview25=(TextView) findViewById(R.id.tv25);
//        TextView  textview26=(TextView) findViewById(R.id.tv26);
//        TextView  textview27 =(TextView) findViewById(R.id.tv27);
//        TextView  textview28=(TextView) findViewById(R.id.tv28);


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
               return true;
            case R.id.resultpdf:
                return  true;


        }
        return super.onOptionsItemSelected(item);
    }
}