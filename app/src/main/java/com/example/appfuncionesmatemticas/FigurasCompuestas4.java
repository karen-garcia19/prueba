package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas4);
    }

    //metodo del boton operaciones de figuras compuestas
    public void Siguente2 (View view){
        Intent Siguiente2 = new Intent(this,FigurasCompuestas5.class);
        startActivity(Siguiente2);
    }

    //metodo del boton operaciones de figuras compuestas 7
    public void figura7 (View view){
        Intent figura7 = new Intent(this,Figura7.class);
        startActivity(figura7);
    }

    //metodo del boton operaciones de figuras compuestas 8
    public void figura8 (View view){
        Intent figura8 = new Intent(this,Figura8.class);
        startActivity(figura8);
    }
    //metodo del boton atrás 7
    public void atras7 (View view){
        Intent atras7 = new Intent(this,FigurasCompuestas3.class);
        startActivity(atras7);
    }

}
