package com.example.creditscorecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class language extends AppCompatActivity {
    ImageView imglogo;
    androidx.cardview.widget.CardView english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        intiview();
    }

    private void intiview() {
        imglogo=findViewById(R.id.imglogo);
        english=findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b= new Intent(language.this, menupage.class);
                startActivity(b);
            }
        });
    }
}