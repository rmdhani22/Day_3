package com.example.project_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PS extends AppCompatActivity {

    ImageButton btnxbox, btnps2, btnps3, btnps4, btnps5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps);
        btnxbox = findViewById(R.id.btnxbox);
        btnps2 = findViewById(R.id.btnps2);
        btnps3 = findViewById(R.id.btnps3);
        btnps4 = findViewById(R.id.btnps4);
        btnps5 = findViewById(R.id.btnps5);

        klikps1 ();
        klikps2 ();
        klikps3 ();
        klikps4 ();
        klikps5 ();
    }
    void klikps1 (){
        btnxbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalxbox = new Intent(PS.this, xbox.class);
                startActivity(intenhalxbox);
            }
        });
    }
    void klikps2 (){
        btnps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalps2 = new Intent(PS.this, ps2.class);
                startActivity(intenhalps2);
            }
        });
    }
    void klikps3 (){
        btnps3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalps3 = new Intent(PS.this, ps3.class);
                startActivity(intenhalps3);
            }
        });
    }
    void klikps4 (){
        btnps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalps4 = new Intent(PS.this, ps4.class);
                startActivity(intenhalps4);
            }
        });
    }
    void klikps5 (){
        btnps5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalps5 = new Intent(PS.this, ps5.class);
                startActivity(intenhalps5);
            }
        });
    }
}