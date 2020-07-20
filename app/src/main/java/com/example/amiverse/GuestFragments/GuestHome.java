package com.example.amiverse.GuestFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.amiverse.AmitiansFragments.QuickLinks;
import com.example.amiverse.AmitiansFragments.leadership;
import com.example.amiverse.R;

public class GuestHome extends Fragment {


    Fragment fragment;
    ImageView leader, quicklink;
    CardView tour;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guest_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        quicklink = (ImageView) view.findViewById(R.id.h_quick_link);
        leader = (ImageView) view.findViewById(R.id.h_contact_hierarchy);
        tour = (CardView) view.findViewById(R.id.tour);

        quicklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new QuickLinks();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.guestcontent,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new leadership();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.guestcontent,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/maps/@26.2731402,78.2286453,2a,75y,130.83h,82.77t,4.78r/data=!3m6!1e1!3m4!1s-cChDfYbXDsjMIh7URz7uQ!2e0!7i13312!8i6656";
                Intent tour;
                tour = new Intent(Intent.ACTION_VIEW);
                tour.setData(Uri.parse(url));
                startActivityForResult(tour,1);
            }
        });
    }

}