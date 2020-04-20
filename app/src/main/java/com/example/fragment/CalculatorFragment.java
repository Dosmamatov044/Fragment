package com.example.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment extends Fragment {


    TextView number;
    Button button1, button2, button0, button3, button4, button5, button6,
            button7, button8, button9, ravno, tochka, divide, multiply, plus,
            minus;
    Button clear;

    MainActivity listener;

    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calculator, container, false);
        number = v.findViewById(R.id.numberField);
        listener = (MainActivity) getActivity();
        ((MainActivity) getActivity()).number = number;
        button0 = v.findViewById(R.id.zero);
        button1 = v.findViewById(R.id.button1);
        clear = v.findViewById(R.id.rav);
        button2 = v.findViewById(R.id.button2);
        button3 = v.findViewById(R.id.button3);
        button4 = v.findViewById(R.id.button4);
        button5 = v.findViewById(R.id.button5);
        button6 = v.findViewById(R.id.button6);
        button7 = v.findViewById(R.id.button7);
        button8 = v.findViewById(R.id.button8);
        button9 = v.findViewById(R.id.button9);
        tochka = v.findViewById(R.id.tocka);
        minus = v.findViewById(R.id.minus);
        multiply = v.findViewById(R.id.multiply);
        divide = v.findViewById(R.id.divide);
        plus = v.findViewById(R.id.plus);
        ravno = v.findViewById(R.id.ravno);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        tochka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.numberFild(v);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.clear();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);
            }
        });
        ravno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOperationClick(v);
            }
        });

        return v;
    }


}