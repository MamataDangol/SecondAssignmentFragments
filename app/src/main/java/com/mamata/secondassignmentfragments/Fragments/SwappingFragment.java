package com.mamata.secondassignmentfragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mamata.secondassignmentfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingFragment extends Fragment implements View.OnClickListener{
    private EditText etfirst, etsecond;
    private Button btncalc;
    private TextView tvSwapResult;




    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etfirst = view.findViewById(R.id.etfirst);
        etsecond = view.findViewById(R.id.etsecond);
        btncalc = view.findViewById(R.id.btncalc);
        tvSwapResult = view.findViewById(R.id.tvSwapResult);
        btncalc.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first, second, temp, bfirst, bsecond;
        first = Integer.parseInt(etfirst.getText().toString());
        second = Integer.parseInt(etsecond.getText().toString());
        bfirst = first;
        bsecond = second;

        temp = first;
        first = second;
        second = temp;


        tvSwapResult.append("the value before swipping. \n First Number is " + bfirst + "\n Second Number" +
                bsecond + ".\n The value after swipping.\n First number is " +first + "\n Second Number is" +second + ".\n");

    }
}
