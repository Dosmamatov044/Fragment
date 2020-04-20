package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number;
    double firstValue;
    double secondValue;
    double result;
    String operation;


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

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstValue = Double.valueOf(number.getText().toString());
                number.setText(firstValue + "+");
                operation = "+";
                break;
            case R.id.divide:
                firstValue = Double.valueOf(number.getText().toString());
                number.setText(firstValue + "/");
                operation = "/";
                break;
            case R.id.multiply:
                firstValue = Double.valueOf(number.getText().toString());
                number.setText(firstValue + "*");
                operation = "*";
                break;
            case R.id.minus:
                firstValue = Double.valueOf(number.getText().toString());
                number.setText(firstValue + "-");
                operation = "-";
                break;
            case R.id.ravno:
                String two = number.getText().toString().replace(firstValue + operation, "");
                secondValue = Double.valueOf(two);
                if (operation == "+") {
                    result = firstValue + secondValue;
                    number.setText(String.valueOf(result));
                    operation = "+";
                }
                if (operation == "-") {
                    result = firstValue - secondValue;
                    number.setText(String.valueOf(result));
                    operation = "-";
                }
                if (operation == "*") {
                    result = firstValue * secondValue;
                    number.setText(String.valueOf(result));
                    operation = "*";
                }
                if (operation == "/") {
                    result = firstValue / secondValue;
                    number.setText(String.valueOf(result));
                    operation = "/";
                }
                break;
        }
    }

    public void shareOpen() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,number.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}