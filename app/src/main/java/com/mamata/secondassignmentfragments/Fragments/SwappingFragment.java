package com.mamata.secondassignmentfragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mamata.secondassignmentfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingFragment extends Fragment implements View.OnClickListener{


    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_swapping, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
