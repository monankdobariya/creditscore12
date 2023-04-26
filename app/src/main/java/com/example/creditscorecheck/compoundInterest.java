package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class compoundInterest extends AppCompatActivity {

    EditText edtamount,edtrate,edtyear;
    androidx.cardview.widget.CardView cardcalculate;

    TextView txtans,txtinterst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
        intview();
    }

    private void intview() {
        edtamount=findViewById(R.id.edtamount);
        edtrate=findViewById(R.id.edtrate);
        edtyear=findViewById(R.id.edtyear);
        cardcalculate=findViewById(R.id.cardcalculate);
        txtans=findViewById(R.id.txtans);
        txtinterst=findViewById(R.id.txtinterst);

        cardcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1=Integer.parseInt(edtamount.getText().toString());
                Integer num2= Integer.parseInt(edtrate.getText().toString());
                Integer num3=Integer.parseInt(edtyear.getText().toString());

                Float ans= Float.valueOf(num1*num2*num3)/100;
                Float totalans= ans+num1;

                txtans.setText(Float.toString(totalans));
                txtinterst.setText(Float.toString(ans));
            }
        });
    }
}
