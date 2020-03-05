package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LeyDeCosenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ley_de_cosenos);
    }

    //Metodo para el boton del calcular ángulo

    public void angulo (View View){
        Intent angulo = new Intent(this, CalculosDelAnguloCos.class);
        startActivity(angulo);
    }
}
