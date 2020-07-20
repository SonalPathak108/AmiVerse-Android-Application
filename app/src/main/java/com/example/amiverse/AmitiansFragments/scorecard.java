package com.example.amiverse.AmitiansFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.amiverse.R;
import com.example.amiverse.AdminFragments.ScoreCardAdapter;
import com.example.amiverse.ScoreJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class scorecard extends Fragment {



    TextView toolbarText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("ScoreCard");
        return inflater.inflate(R.layout.fragment_scorecard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RecyclerView scoreView = (RecyclerView) view.findViewById(R.id.scoreCard);
        scoreView.setLayoutManager(new LinearLayoutManager(getContext()));


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

        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(request);
    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
    }
