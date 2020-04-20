package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.numberField);
    }

    public void Share(View view) {
        share();
    }

    public void Calculator(View view) {
        calc();
    }

    public void calc() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CalculatorFragment calculatorFragment = new CalculatorFragment();
        transaction.replace(R.id.conteiner, calculatorFragment);
        transaction.commit();
    }

    public void share() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        ShareFragment shareFragment = new ShareFragment();
        transaction.replace(R.id.conteinr,shareFragment);
        transaction.commit();
    }

    public void numberFild(View view) {
        number.append(((TextView) view).getText());

    }

    public void clear() {
        number.setText(" ");
    }




    public void shareOpen() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,number.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}