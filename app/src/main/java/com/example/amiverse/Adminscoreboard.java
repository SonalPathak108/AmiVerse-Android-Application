package com.example.amiverse;

import android.app.DownloadManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Adminscoreboard extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    EditText score, bronzeMedal, silverMedal, goldMedal;
     String Departement;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_scoreboard);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Block, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        score = (EditText) findViewById(R.id.score);
        bronzeMedal = (EditText) findViewById(R.id.bronze);
        silverMedal = (EditText) findViewById(R.id.silver);
        goldMedal = (EditText) findViewById(R.id.gold);
        submit = (Button) findViewById(R.id.submit);


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

                        Log.d("asd",response);
                        Toast.makeText(Adminscoreboard.this,response,Toast.LENGTH_SHORT).show();
                    }
                },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                                Toast.makeText(Adminscoreboard.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
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
                RequestQueue requestQueue = Volley.newRequestQueue(Adminscoreboard.this);
                requestQueue.add(request);

            }

        });

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         Departement = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
