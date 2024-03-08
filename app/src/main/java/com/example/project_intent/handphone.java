package com.example.project_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class handphone extends AppCompatActivity {

    ImageButton btnsamsung, btnip, btnbs, btnrog, btnrealme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handphone);
        btnsamsung = findViewById(R.id.btnsamsung);
        btnip = findViewById(R.id.btnip);
        btnbs = findViewById(R.id.btnbs);
        btnrog = findViewById(R.id.btnrog);
        btnrealme = findViewById(R.id.btnrealme);
        klikhp1 ();
        klikhp2 ();
        klikhp3 ();
        klikhp4 ();
        klikhp5 ();
    }
    void klikhp1 (){
        btnsamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalsamsung = new Intent(handphone.this, samsung.class);
                startActivity(intenhalsamsung);
            }
        });
    }
    void klikhp2 (){
        btnip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhaliphone = new Intent(handphone.this, iphone.class);
                startActivity(intenhaliphone);
            }
        });
    }
    void klikhp3 (){
        btnbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalblackshark = new Intent(handphone.this, blackshark.class);
                startActivity(intenhalblackshark);
            }
        });
    }
    void klikhp4 (){
        btnrog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalrog = new Intent(handphone.this, rog.class);
                startActivity(intenhalrog);
            }
        });
    }
    void klikhp5 (){
        btnrealme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalrealme = new Intent(handphone.this, realme.class);
                startActivity(intenhalrealme);
            }
        });
    }
}