package com.example.amiverse;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class menuNav extends AppCompatActivity {

    Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.resource_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

                int id = item.getItemId();
                if(id == R.id.m_home){

                    Intent i = new Intent(this,HomeMain.class);
                    startActivity(i);
                    return true;
                }

                if(id == R.id.m_feedback){

                    Toast.makeText(this,"thanks for FeedBack",Toast.LENGTH_SHORT).show();
                    return true;
                }
                if(id == R.id.m_share){
                    Toast.makeText(this,"Thanks for sharing",Toast.LENGTH_SHORT).show();
                    return true;
                }

                return super.onOptionsItemSelected(item);

        }

}

