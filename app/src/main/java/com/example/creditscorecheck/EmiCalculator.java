package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmiCalculator extends AppCompatActivity {
    EditText edtamount, edtrate, edtmonth;
    TextView txtemi, txtinterst, txttotalamount;
    androidx.cardview.widget.CardView cardbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);
        intiview();
    }

    private void intiview() {
        edtamount = findViewById(R.id.edtamount);
        edtrate = findViewById(R.id.edtrate);
        edtmonth = findViewById(R.id.edtmonth);
        txtemi = findViewById(R.id.txtemi);
        txtinterst = findViewById(R.id.txtinterst);
        txttotalamount = findViewById(R.id.txttotalamount);
        cardbutton = findViewById(R.id.cardbutton);

        cardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer p = Integer.parseInt(edtamount.getText().toString());
                Integer r = Integer.parseInt(edtrate.getText().toString());
                Integer n = Integer.parseInt(edtmonth.getText().toString());


                Float ans = Float.valueOf(p * r / 100 * (1 + r / 100) ^ n / ((1 + r / 100) ^ n - 1));
                Float interest = Float.valueOf(p * r * n)/100;
                Float totalans= p+interest;



                txtemi.setText(Float.toString(ans));
                txtinterst.setText(Float.toString(interest));
                txttotalamount.setText(Float.toString(totalans));
            }
        });


    }
}