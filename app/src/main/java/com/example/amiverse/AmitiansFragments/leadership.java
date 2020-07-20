package com.example.amiverse.AmitiansFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amiverse.R;

public class leadership extends Fragment {


    TextView toolbarText;
    TextView leadert1,leadert2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("Leadership");
        return inflater.inflate(R.layout.fragment_leadership2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        leadert1 = (TextView) view.findViewById(R.id.textleader1);
        leadert1.setMovementMethod(LinkMovementMethod.getInstance());

        leadert2 = (TextView) view.findViewById(R.id.textleader2);
        leadert2.setMovementMethod(LinkMovementMethod.getInstance());
    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
}