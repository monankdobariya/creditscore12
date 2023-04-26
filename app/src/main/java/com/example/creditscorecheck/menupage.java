package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menupage extends AppCompatActivity {
    androidx.cardview.widget.CardView calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage);
        intiview();
    }

    private void intiview() {
        calculator=findViewById(R.id.calculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c= new Intent(menupage.this, calculatorList.class);
                startActivity(c);
            }
        });
    }
}