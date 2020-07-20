package com.example.amiverse.AmitiansFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.amiverse.R;

public class clubs extends Fragment {

    TextView toolbarText;
    TextView coding_title, coding_des, eco_title, eco_des, literature_title, literature_des;
    ImageView coding_img, eco_img, literature_img;
    CardView club1, club2, club3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_clubs, container, false);
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText(" AUMP Clubs");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        coding_title = view.findViewById(R.id.title1);
        coding_des = view.findViewById(R.id.des1);
        coding_img = view.findViewById(R.id.club_img);
        eco_title = view.findViewById(R.id.title2);
        eco_des = view.findViewById(R.id.des2);
        eco_img = view.findViewById(R.id.eco_club2);
        literature_title = view.findViewById(R.id.title3);
        literature_des = view.findViewById(R.id.des3);
        literature_img = view.findViewById(R.id.parikalp);
        club1 = view.findViewById(R.id.club1);
        club2 = view.findViewById(R.id.club2);
        club3 = view.findViewById(R.id.club3);

        coding_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://accmp.co.in/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
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