package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FuncionesTrigonometricas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funciones_trigonometricas);
    }

    //metodo del boton cofucion
    public void cofucion (View view){
        Intent cofucion = new Intent(this,Cofucion.class);
        startActivity(cofucion);
    }
}
