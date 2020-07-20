package com.example.amiverse.AmitiansFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amiverse.R;

public class gallert extends Fragment {

    TextView sangathan, amichroma, raising, clickomania;
    TextView toolbarText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("Ami Gallery");
        return inflater.inflate(R.layout.fragment_gallert, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sangathan = (TextView) view.findViewById(R.id.sangathan);
        sangathan.setMovementMethod(LinkMovementMethod.getInstance());

        amichroma = (TextView) view.findViewById(R.id.Amichroma);
        amichroma.setMovementMethod(LinkMovementMethod.getInstance());

        raising = (TextView) view.findViewById(R.id.Raising_day);
        raising.setMovementMethod(LinkMovementMethod.getInstance());
        clickomania = (TextView) view.findViewById(R.id.Click_o_mania);
        clickomania.setMovementMethod(LinkMovementMethod.getInstance());
    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
}