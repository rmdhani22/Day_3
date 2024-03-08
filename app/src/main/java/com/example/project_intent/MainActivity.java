package com.example.project_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnlogohp, btnlogolaptop, btnlogops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogohp= findViewById(R.id.btnlogohp);
        btnlogolaptop= findViewById(R.id.btnlogolaptop);
        btnlogops= findViewById(R.id.btnllogops);
        klik1 ();
        klik2 ();
        klik3 ();
    }
    void klik1 (){
        btnlogohp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalhandphone = new Intent(MainActivity.this, handphone.class);
                startActivity(intenhalhandphone);
            }
        });
    }
    void  klik2 (){
        btnlogolaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenHallaptop = new Intent(MainActivity.this, laptop.class);
                startActivity(intenHallaptop);
            }
        });
    }
    void klik3 (){
        btnlogops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenHalPS = new Intent(MainActivity.this, PS.class);
                startActivity(intenHalPS);
            }
        });
    }
}