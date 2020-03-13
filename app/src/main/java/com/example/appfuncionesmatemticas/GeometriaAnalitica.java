package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GeometriaAnalitica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometria_analitica);
    }

    //metodo del boton distancia entre dos puntos
    public void punto (View view){
        Intent punto = new Intent(this,DistanciaEntreDosPuntos.class);
        startActivity(punto);
    }

    //metodo del boton punto medio de un segmento de la recta
    public void medio (View view){
        Intent medio = new Intent(this,PuntoMedio.class);
        startActivity(medio);
    }

    //metodo del boton división de un segmento de la recta dada
    public void divis (View view){
        Intent divis = new Intent(this,DivisionDeUnSegmentoDeLaRectaDada.class);
        startActivity(divis);
    }

    //metodo del boton distancia de un punto a una recta
    public void distancia (View view){
        Intent distancia = new Intent(this,DistanciaDeUnPuntoAUnaRecta.class);
        startActivity(distancia);
    }

    //metodo del boton ángulo entre dos rectas
    public void recta (View view){
        Intent recta = new Intent(this,AnguloEntreDosRectas.class);
        startActivity(recta);
    }
}
