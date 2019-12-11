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

import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {
    private Button btncalculateauto;
    private EditText etautonum;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etautonum = view.findViewById(R.id.etautonum);
        btncalculateauto = view.findViewById(R.id.btncalculateauto);
        btncalculateauto.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etautonum.getText())) {
            etautonum.setError("Please input number.");
            return;
        }
        int number = Integer.parseInt(etautonum.getText().toString());
        int sq = number * number;
        int c = 0;
        int copy = number;

        while (copy>0){
            c++;
            copy = copy/10;

        }
        int end = sq % (int) Math.pow(10,c);
        if (number == end){
            Toast.makeText(getActivity(), number + " is a Automorphic number." , Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(getActivity(), number + " is not a Automorphic number." , Toast.LENGTH_SHORT).show();

        }

    }
}
