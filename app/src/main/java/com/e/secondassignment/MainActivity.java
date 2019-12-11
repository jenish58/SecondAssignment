package com.e.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.secondassignment.fragments.AreaofCircle;
import com.e.secondassignment.fragments.ArmstrongNumber;
import com.e.secondassignment.fragments.AutoMorphic;
import com.e.secondassignment.fragments.PalindromeNumber;
import com.e.secondassignment.fragments.SimpleInterest;
import com.e.secondassignment.fragments.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAreaofCircle, btnPalindrome, btnSimpleInterest, btnArmstrong,
            btnAutoMorphic, btnSwapping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAreaofCircle = findViewById(R.id.btnAreaofCircle);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutoMorphic = findViewById(R.id.btnAutoMorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnAreaofCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutoMorphic.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnAreaofCircle:

                AreaofCircle areaofCircle = new AreaofCircle();
                fragmentTransaction.replace(R.id.fragmentContainer,areaofCircle);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:

                PalindromeNumber palindrome = new PalindromeNumber();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;
            case R.id.btnSimpleInterest:

                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterest);
                fragmentTransaction.commit();
                break;
            case R.id.btnArmstrong:

                ArmstrongNumber armstrong = new ArmstrongNumber();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrong);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutoMorphic:

                AutoMorphic automorphic = new AutoMorphic();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
                fragmentTransaction.commit();
                break;
            case R.id.btnSwapping:

                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer,swapping);
                fragmentTransaction.commit();
                break;
        }


    }
}