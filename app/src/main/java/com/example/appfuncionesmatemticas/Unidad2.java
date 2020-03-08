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


    //metodo del boton oblicuangulos
    public void oblic (View view){
        Intent oblic = new Intent(this,TriangulosOblicuangulos.class);
        startActivity(oblic);
    }

    //metodo del boton Naturaleza del triángulo
    public void natu (View view){
        Intent natu = new Intent(this,ObtusanguloYAcutangulo.class);
        startActivity(natu);
    }

    //metodo del boton cofucion
    public void cofucion (View view){
        Intent cofucion = new Intent(this,Cofucion.class);
        startActivity(cofucion);
    }

    //metodo del boton funciones trigonométricas
    public void funcion (View view){
        Intent funcion = new Intent(this,ValoresDeLasFunciones.class);
        startActivity(funcion);
    }
}
