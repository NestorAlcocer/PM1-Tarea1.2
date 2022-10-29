package com.example.pm1_tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class activity1 extends AppCompatActivity {
    EditText n,a ,e , c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        n = (EditText) findViewById(R.id.t1);
        a = (EditText) findViewById(R.id.t2);
        e = (EditText) findViewById(R.id.t3);
        c = (EditText) findViewById(R.id.t4);


        n.setText(getIntent().getExtras().getString("nombre"));
        a.setText(getIntent().getExtras().getString("apellido"));
        e.setText(getIntent().getExtras().getString("edad"));
        c.setText(getIntent().getExtras().getString("correo"));

    }
}