package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerimetroyArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetroy_area);
    }

    //Metodo para el boton anterior

    public void botonanterior (View View){
        Intent botonanterior = new Intent(this, MainActivity.class);
        startActivity(botonanterior);
    }
    //Metodo para el boton del triángulo

    public void triángulo (View View){
        Intent triángulo = new Intent(this, CalculosDelTriangulo.class);
        startActivity(triángulo);
    }


    //Metodo para el boton del rombo

    public void rombo (View View){
        Intent rombo = new Intent(this, CalculosDelRombo.class);
        startActivity(rombo);
    }

    //Metodo para el boton del trapecio

    public void trapecio (View View){
        Intent trapecio = new Intent(this, CalculosDelTrapecio.class);
        startActivity(trapecio);
    }

    //Metodo para el boton del cuadrado

    public void cuadrado (View View){
        Intent cuadrado = new Intent(this, CalculosDelCuadrado.class);
        startActivity(cuadrado);
    }
    //Metodo para el boton del círculo

    public void círculo (View View){
        Intent círculo = new Intent(this, CalculosDelCirculo.class);
        startActivity(círculo);
    }

    //Metodo para el boton del pentágono

    public void pentágono (View View){
        Intent pentágono = new Intent(this, CalculosDelPentagono.class);
        startActivity(pentágono);
    }
    //Metodo para el boton del paralelogramo

    public void paralelogramo (View View){
        Intent paralelogramo = new Intent(this, CalculosDelParalelogramo.class);
        startActivity(paralelogramo);
    }

    //Metodo para el boton del rectángulo

    public void rectángulo (View View){
        Intent rectángulo = new Intent(this, CalculosDelRectangulo.class);
        startActivity(rectángulo);
    }
}
