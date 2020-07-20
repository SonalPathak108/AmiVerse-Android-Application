package com.example.amiverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    Button studentpanel, otherspanel;
    TextView admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final User user= new User(MainActivity.this);

        admin = (TextView) findViewById(R.id.admin);
        studentpanel = (Button) findViewById(R.id.student);
        otherspanel = (Button) findViewById(R.id.others);


        studentpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            if((user.getName()!=""))
                            {
                                sleep(500);
                                Intent i = new Intent(MainActivity.this, HomeMain.class);
                                i.putExtra("name",user.getName());
                                startActivity(i);
                            }
                            else
                            {
                                sleep(500);
                                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                                startActivity(i);
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                });

                thread.start();
            }
        });

        otherspanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Guesthome.class));
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AdminLogin.class));
            }
        });

    }

}



