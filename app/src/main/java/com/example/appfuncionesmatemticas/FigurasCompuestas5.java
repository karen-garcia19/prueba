package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas5);
    }

    //metodo del boton operaciones de figuras compuestas 9
    public void figura9 (View view){
        Intent figura9 = new Intent(this,Figura9.class);
        startActivity(figura9);
    }

    //Metodo para el boton del cubo

    public void cubo1 (View View){
        Intent cubo1 = new Intent(this, CalculosDelCuboOHexaedro.class);
        startActivity (cubo1);
    }

    //metodo del boton operaciones de figuras compuestas
    public void Siguente3 (View view){
        Intent Siguiente3 = new Intent(this,FigurasCompuestas6.class);
        startActivity(Siguiente3);
    }

    //metodo del boton atrás
    public void atras (View view){
        Intent atras = new Intent(this,FigurasCompuestas4.class);
        startActivity(atras);
    }

}
