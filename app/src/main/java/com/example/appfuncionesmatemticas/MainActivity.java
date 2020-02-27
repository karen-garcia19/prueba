package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo del boton Siguiente
    public void primerboton(View view){
        Intent primerboton = new Intent(this, PerimetroyArea.class);
        startActivity(primerboton);
    }

    //metodo del boton relación de conversión
    public void relaciondeconversion(View view){
        Intent relaciondeconversion = new Intent(this, RelacionDeConversiones.class);
        startActivity(relaciondeconversion);
    }

    //metodo del boton operaciones básicas con ángulos
    public void operacionesbasicasconangulos(View view){
        Intent operacionesbasicasconangulos = new Intent(this, OperacionesBasicasConAngulos.class);
        startActivity(operacionesbasicasconangulos);
    }

    //metodo del boton operaciones de figuras compuestas
    public void figurascompuestas(View view){
        Intent figurascompuestas = new Intent(this,FigurasCompuestas.class);
        startActivity(figurascompuestas);
    }

    //metodo del boton pitágoras
    public void pitagoras (View view){
        Intent pitagoras = new Intent(this,Pitagoras.class);
        startActivity(pitagoras);
    }

    //metodo del boton grados radianes
    public void grados1 (View view){
        Intent grados1 = new Intent(this,Grados_radianes.class);
        startActivity(grados1);
    }

    //metodo del boton triángulos congruentes
    public void triangulosseme (View view){
        Intent triangulosseme = new Intent(this,TriangulosSemejantes.class);
        startActivity(triangulosseme);
    }

}
