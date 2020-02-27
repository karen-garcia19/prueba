package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas3);
    }

    //metodo del boton operaciones de figuras compuestas 5
    public void figura5 (View view){
        Intent figura5 = new Intent(this,Figura5.class);
        startActivity(figura5);
    }

    //metodo del boton operaciones de figuras compuestas 6
    public void figura6 (View view){
        Intent figura6 = new Intent(this,Figura6_6.class);
        startActivity(figura6);
    }

    //metodo del boton siguiente
    public void Siguente5 (View view){
        Intent Siguiente5 = new Intent(this,FigurasCompuestas4.class);
        startActivity(Siguiente5);
    }

    //metodo del boton atrás 3
    public void atras3 (View view){
        Intent atras3 = new Intent(this,FigurasCompuestas2.class);
        startActivity(atras3);
    }
}
