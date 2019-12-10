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
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private Button btncal;
    private EditText etpalindrome;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etpalindrome = view.findViewById(R.id.etpalindrome);
        btncal = view.findViewById(R.id.btncal);
        btncal.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int r, sum = 0, temp;
        int n = Integer.parseInt(etpalindrome.getText().toString());
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            Toast.makeText(getActivity(), temp + " is a palindrome number." , Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(getActivity(), temp + " is not a palindrome number." ,Toast.LENGTH_SHORT).show();
        }
    }
}
