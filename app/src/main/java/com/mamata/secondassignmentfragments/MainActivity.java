package com.mamata.secondassignmentfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.mamata.secondassignmentfragments.Fragments.AreaOfCircleFragment;
import com.mamata.secondassignmentfragments.Fragments.PalindromeFragment;
import com.mamata.secondassignmentfragments.Fragments.SimpleInterestFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCircle, btnPalindrome, btnSimpleInterest, btnArmstrong, btnSwapping, btnAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = findViewById(R.id.btncircle);
        btnArmstrong = findViewById(R.id.btnarmstrong);
        btnAutomorphic = findViewById(R.id.btnautomorphic);
        btnPalindrome = findViewById(R.id.btnpalindrome);
        btnSimpleInterest = findViewById(R.id.btnsimpleinterest);
        btnAutomorphic = findViewById(R.id.btnautomorphic);
        btnSwapping = findViewById(R.id.btnswappig);

        btnAutomorphic.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnCircle.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btncircle:
                AreaOfCircleFragment areaOfCircleFragment = new AreaOfCircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaOfCircleFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnpalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnsimpleinterest:
                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterestFragment);
                fragmentTransaction.commit();
                break;


        }

    }
}
