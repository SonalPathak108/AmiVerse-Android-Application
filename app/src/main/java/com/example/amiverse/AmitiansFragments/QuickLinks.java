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

public class QuickLinks extends Fragment {


    TextView ami_place,ami_web,ami_dis,ami_program,ami_admission,ami_carrier;
    TextView toolbarText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("QuickLinks");
        return inflater.inflate(R.layout.fragment_quick_links, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Getting refernce to link when it is click on
        ami_place = (TextView) view.findViewById(R.id.amity_placement);
        ami_place.setMovementMethod(LinkMovementMethod.getInstance());

        ami_web = (TextView) view.findViewById(R.id.amity_web);
        ami_web.setMovementMethod(LinkMovementMethod.getInstance());

        ami_dis = (TextView) view.findViewById(R.id.amity_dist_learn);
        ami_dis.setMovementMethod(LinkMovementMethod.getInstance());

        ami_program = (TextView) view.findViewById(R.id.programs);
        ami_program.setMovementMethod(LinkMovementMethod.getInstance());

        ami_admission = (TextView) view.findViewById(R.id.admission);
        ami_admission.setMovementMethod(LinkMovementMethod.getInstance());

        ami_carrier = (TextView) view.findViewById(R.id.carrier);
        ami_carrier.setMovementMethod(LinkMovementMethod.getInstance());

    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
}