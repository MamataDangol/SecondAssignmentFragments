package com.mamata.secondassignmentfragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
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
public class SimpleInterestFragment extends Fragment implements View.OnClickListener{
   private EditText etPrincipal, etTime, etRate;
    private Button btncalculateSI;



    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etPrincipal = view.findViewById(R.id.etPrincipal);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        btncalculateSI = view.findViewById(R.id.btncalculateSI);
        btncalculateSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etPrincipal.getText())) {
            etPrincipal.setError("Please input principal.");
            return;
        } else if (TextUtils.isEmpty(etTime.getText())) {
            etTime.setError("Please input time");
            return;
        } else if (TextUtils.isEmpty(etRate.getText())) {
            etRate.setError("Please input rate");
            return;
        }


        float principal, time, rate, result;

        principal = Float.parseFloat(etPrincipal.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());
        result = (principal * time * rate)/100;
        Toast.makeText(getActivity(), "simple interest is" + result, Toast.LENGTH_SHORT).show();


    }
}
