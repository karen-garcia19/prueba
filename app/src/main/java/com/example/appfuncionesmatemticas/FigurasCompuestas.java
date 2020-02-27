package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas);
    }

    //metodo del boton siguiente
    public void Siguente(View view){
        Intent Siguiente = new Intent(this,FigurasCompuestas2.class);
        startActivity(Siguiente);
    }

    //metodo del boton operaciones de figuras compuestas 1
    public void figura1(View view){
        Intent figura1 = new Intent(this,Figura1.class);
        startActivity(figura1);
    }

    //metodo del boton operaciones de figuras compuestas 2
    public void figura2(View view){
        Intent figura2 = new Intent(this,Figura2.class);
        startActivity(figura2);
    }

    //metodo del boton atrás
    public void atras1 (View view){
        Intent atras1 = new Intent(this,MainActivity.class);
        startActivity(atras1);
    }

}
