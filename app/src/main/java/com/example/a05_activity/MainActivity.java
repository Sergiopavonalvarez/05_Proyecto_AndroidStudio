package com.example.a05_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente (View vista){
        Intent intent = new Intent(this, MainActivity2.class);
        EditText n=findViewById(R.id.nombre);
        String nnn = n.getText().toString();

        intent.putExtra("nombreDato",nnn);

        startActivity(intent);


    }


}