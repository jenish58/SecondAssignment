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
public class ArmstrongNumber extends Fragment implements View.OnClickListener{

    private Button btnArmstrong;
    private TextView tvResult;
    private EditText etNumber;


    public ArmstrongNumber() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong_number, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        tvResult = view.findViewById(R.id.tvResult);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);

        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int c=0,a,temp;
        int number = Integer.parseInt(etNumber.getText().toString());

        temp=number;
        while(number>0)
        {
            a=number%10;
            number=number/10;
            c=c+(a*a*a);
        }

        if(temp==c)

            tvResult.setText("Number is Armstrong");
        else
            tvResult.setText("Number is not Armstrong");

    }
}
