package com.example.a05_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String nuevo = getIntent().getStringExtra("nombreDato");
        Toast.makeText(getApplicationContext(), "hola " +nuevo, Toast.LENGTH_LONG).show();
    }

    public void siguiente (View vista){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }
}