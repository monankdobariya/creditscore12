package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class calculatorList extends AppCompatActivity {
    androidx.cardview.widget.CardView compound, cardemi, gst, fd, rd,sip,vat,comparelone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_list);
        intview();
    }

    private void intview() {
        compound = findViewById(R.id.compound);
        cardemi = findViewById(R.id.cardemi);
        gst = findViewById(R.id.gst);
        fd = findViewById(R.id.fd);
        rd = findViewById(R.id.rd);
        sip=findViewById(R.id.sip);
        vat=findViewById(R.id.vat);
        comparelone=findViewById(R.id.comparelone);
        compound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(calculatorList.this, compoundInterest.class);
                startActivity(d);
            }
        });
        cardemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(calculatorList.this, EmiCalculator.class);
                startActivity(e);
            }
        });
        gst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(calculatorList.this, GstCalculator.class);
                startActivity(f);
            }
        });
        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(calculatorList.this, FdCalculator.class);
                startActivity(e);
            }
        });
        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(calculatorList.this, RdCalculator.class);
                startActivity(f);
            }
        });
        sip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(calculatorList.this, Sipcalculator.class);
                startActivity(g);
            }
        });
        vat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(calculatorList.this, Vatcalculator.class);
                startActivity(h);
            }
        });
        comparelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(calculatorList.this, CompareLone.class);
                startActivity(i);
            }
        });
    }
}