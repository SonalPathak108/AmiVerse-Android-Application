package com.example.amiverse;
//For fetching score from dataBase
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class scoreCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);

        final RecyclerView scoreView = (RecyclerView) findViewById(R.id.scoreCard);
        scoreView.setLayoutManager(new LinearLayoutManager(this));


        StringRequest request = new StringRequest("https://ep4.virtualmist.com/amiverse/ScoreFetch.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                ScoreJson[] data =  gson.fromJson(response,ScoreJson[].class);
                scoreView.setAdapter(new ScoreCardAdapter(data));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){

        };

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }
}