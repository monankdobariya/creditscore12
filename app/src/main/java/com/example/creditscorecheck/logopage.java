package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class logopage extends AppCompatActivity {

    ImageView imglogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logopage);
        inttview();
    }

    private void inttview() {
        imglogo=findViewById(R.id.imglogo);
        imglogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(logopage.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}