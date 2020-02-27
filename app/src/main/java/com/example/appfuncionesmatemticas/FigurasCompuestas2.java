package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas2);
    }

    //metodo del boton operaciones de figuras compuestas 3
    public void figura3 (View view){
        Intent figura3 = new Intent(this,Figura3.class);
        startActivity(figura3);
    }

    //metodo del boton operaciones de figuras compuestas 4
    public void figura4 (View view){
        Intent figura4 = new Intent(this,Figura4.class);
        startActivity(figura4);
    }

    //metodo del boton siguiente
    public void Siguente3 (View view){
        Intent Siguiente3 = new Intent(this,FigurasCompuestas3.class);
        startActivity(Siguiente3);
    }

    //metodo del boton atrás 2
    public void atras2 (View view){
        Intent atras2 = new Intent(this,FigurasCompuestas.class);
        startActivity(atras2);
    }
}
