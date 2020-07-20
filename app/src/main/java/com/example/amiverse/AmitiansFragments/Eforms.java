package com.example.amiverse.AmitiansFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.amiverse.R;

public class Eforms extends Fragment {

    TextView toolbarText;
    Button oval1, oval2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("Eforms");
        return inflater.inflate(R.layout.fragment_eforms, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        oval1 = (Button) view.findViewById(R.id.oval1);
        oval1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Register!", Toast.LENGTH_SHORT).show();
            }
        });
        oval2 = (Button) view.findViewById(R.id.oval2);
        oval2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Register!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
}