package com.example.amiverse.AdminFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.amiverse.Adminscoreboard;
import com.example.amiverse.R;

import java.util.HashMap;
import java.util.Map;

public class adminScorecard extends Fragment {

    EditText score, bronzeMedal, silverMedal, goldMedal;
    String Departement;
    Button submit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_scorecard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        Spinner spinner = view.findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.Block, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) getContext());

        score = (EditText) view.findViewById(R.id.score);
        bronzeMedal = (EditText) view.findViewById(R.id.bronze);
        silverMedal = (EditText) view.findViewById(R.id.silver);
        goldMedal = (EditText) view.findViewById(R.id.gold);
        submit = (Button) view.findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String Score = score.getText().toString().trim();
                final String Bronze = bronzeMedal.getText().toString().trim();
                final String Gold = goldMedal.getText().toString().trim();
                final String Silver = silverMedal.getText().toString().trim();


                StringRequest request = new StringRequest(Request.Method.POST, "https://ep4.virtualmist.com/amiverse/AdminScoreCard.php", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        score.setText("");
                        bronzeMedal.setText("");
                        silverMedal.setText("");
                        goldMedal.setText("");

                        Log.d("asd", response);
                        Toast.makeText(getContext(), response, Toast.LENGTH_SHORT).show();
                    }
                },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                                Toast.makeText(getContext(), error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                ) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {

                        Map<String, String> map = new HashMap<String, String>();

                        map.put("Score", Score);
                        map.put("BronzeMedal", Bronze);
                        map.put("GoldMedal", Gold);
                        map.put("SilverMedal", Silver);
                        map.put("Departement", Departement);
                        return map;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(getContext());
                requestQueue.add(request);

            }

        });



    }
}