package com.mamata.secondassignmentfragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mamata.secondassignmentfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {
    private Button btnCalculate;
    private EditText etnum;



    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_area_of_circle, container, false);
        etnum = view.findViewById(R.id.etnum);
        btnCalculate = view.findViewById(R.id.btncalculate);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius, result;
        radius = Float.parseFloat(etnum.getText().toString());
        result = (radius * radius * 22)/7;
        Toast.makeText(getActivity(), "radius is" + result, Toast.LENGTH_SHORT).show();
    }
}
