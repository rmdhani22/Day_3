package com.example.project_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class laptop extends AppCompatActivity {

    ImageButton btnasus, btnlenovo, btnmacbook, btnacer, btnmsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        btnasus = findViewById(R.id.btnasus);
        btnlenovo = findViewById(R.id.btnlenovo);
        btnmacbook = findViewById(R.id.btnmacbook);
        btnacer = findViewById(R.id.btnacer);
        btnmsi = findViewById(R.id.btnmsi);

        kliklaptop1 ();
        kliklaptop2 ();
        kliklaptop3 ();
        kliklaptop4 ();
        kliklaptop5 ();
    }
    void kliklaptop1 (){
        btnasus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalasus = new Intent(laptop.this, asus.class);
                startActivity(intenhalasus);
            }
        });
    }
    void kliklaptop2 (){
        btnlenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhallenovo = new Intent(laptop.this, lenovo.class);
                startActivity(intenhallenovo);
            }
        });
    }
    void kliklaptop3 (){
        btnmacbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalmacbook = new Intent(laptop.this, macbook.class);
                startActivity(intenhalmacbook);
            }
        });
    }
    void kliklaptop4 (){
        btnacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalacer = new Intent(laptop.this, acer.class);
                startActivity(intenhalacer);
            }
        });
    }
    void kliklaptop5 (){
        btnmsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenhalmsi = new Intent(laptop.this, msi.class);
                startActivity(intenhalmsi);
            }
        });
    }
}