package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Unidad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidad2);
    }

    //metodo del boton pitágoras
    public void pitagoras (View view){
        Intent pitagoras = new Intent(this,Pitagoras.class);
        startActivity(pitagoras);
    }

    //metodo del boton funcionestri
    public void trigono (View view){
        Intent trigono = new Intent(this,FuncionesTrigonometricas.class);
        startActivity(trigono);
    }

    //metodo del boton oblicu´´angulos
    public void oblic (View view){
        Intent oblic = new Intent(this,TriangulosOblicuangulos.class);
        startActivity(oblic);
    }
}
