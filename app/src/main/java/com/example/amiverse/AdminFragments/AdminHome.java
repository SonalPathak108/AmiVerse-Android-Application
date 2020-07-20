package com.example.amiverse.AdminFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.amiverse.Adminscoreboard;
import com.example.amiverse.AmitiansFragments.QuickLinks;
import com.example.amiverse.R;
import com.example.amiverse.UploadImage;

public class AdminHome extends Fragment {

    Fragment fragment;
    ImageView photo, scorecard;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       scorecard = (ImageView) view.findViewById(R.id.sangathan_admin);
       photo = (ImageView) view.findViewById(R.id.photo_upload);

        scorecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(getContext(),Adminscoreboard.class);
                startActivity(i);
            }
        });

           photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoupload = new Intent(getContext(), UploadImage.class);
                startActivity(photoupload);
            }
        });
    }
}