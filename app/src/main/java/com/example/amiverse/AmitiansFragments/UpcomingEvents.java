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

public class UpcomingEvents extends Fragment {

    TextView amity_sangathan;
    TextView amichroma;
    TextView mediafest;
    TextView conference;
    TextView toolbarText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("Upcoming Events");
        return inflater.inflate(R.layout.fragment_upcoming_events, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        amity_sangathan = (TextView) view.findViewById(R.id.amity_sangathan);
        amity_sangathan.setMovementMethod(LinkMovementMethod.getInstance());

        amichroma = (TextView) view.findViewById(R.id.amichroma);
        amichroma.setMovementMethod(LinkMovementMethod.getInstance());

        mediafest = (TextView) view.findViewById(R.id.mediafest);
        mediafest.setMovementMethod(LinkMovementMethod.getInstance());

        conference = (TextView) view.findViewById(R.id.conference);
        conference.setMovementMethod(LinkMovementMethod.getInstance());
    }
    @Override
    public void onStop() {
        super.onStop();
        toolbarText = getActivity().findViewById(R.id.toolbarText);
        toolbarText.setText("AmiHome");
    }
}