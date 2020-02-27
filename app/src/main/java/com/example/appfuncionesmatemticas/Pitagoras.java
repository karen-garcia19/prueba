package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pitagoras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitagoras);
    }

    //metodo del boton atrás 2
    public void pitagoras1 (View view){
        Intent pitagoras1 = new Intent(this,Pitagoras1.class);
        startActivity(pitagoras1);
    }

    //metodo del boton atrás 2
    public void pitagoras2 (View view){
        Intent pitagoras2 = new Intent(this,Pitagoras2.class);
        startActivity(pitagoras2);
    }

    //metodo del boton atrás 2
    public void pitagoras3 (View view){
        Intent pitagoras3 = new Intent(this,Pitagoras3.class);
        startActivity(pitagoras3);
    }
}
