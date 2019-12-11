package com.e.secondassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.e.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment implements View.OnClickListener {

    private Button btnSimpleInterest;
    private EditText etPrincipal, etTime, etRate;
    private TextView tvResult;


    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrincipal = view.findViewById(R.id.etPrincipal);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);

        btnSimpleInterest = view.findViewById(R.id.btnSimpleInterest);
        tvResult = view.findViewById(R.id.tvResult);

       btnSimpleInterest.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principle, time, rate, result;

        principle = Float.parseFloat(etPrincipal.getText().toString());
        time = Float.parseFloat(etTime.getText().toString());
        rate = Float.parseFloat(etRate.getText().toString());

        result = (principle * time * rate)/100;

        tvResult.append("The SI of priciple Rs."+ principle + ", time "+ time +"yrs and rate "+ rate + " is Rs." +result+ ".\n");


    }
}