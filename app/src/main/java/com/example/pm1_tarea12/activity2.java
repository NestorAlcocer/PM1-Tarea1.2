package com.example.pm1_tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    EditText tnombre, tapellido, tedad, tcorreo;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tnombre = (EditText) findViewById(R.id.tr1);
        tapellido = (EditText) findViewById(R.id.tr2);
        tedad = (EditText) findViewById(R.id.tr3);
        tcorreo = (EditText) findViewById(R.id.tr4);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Informacion Guardada Exitosamente",Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activity1.class);
                intent.putExtra("nombre", tnombre.getText().toString());
                intent.putExtra("apellido", tapellido.getText().toString());
                intent.putExtra("edad", tedad.getText().toString());
                intent.putExtra("correo", tcorreo.getText().toString());

                startActivity(intent);
            }
        });


    }
}