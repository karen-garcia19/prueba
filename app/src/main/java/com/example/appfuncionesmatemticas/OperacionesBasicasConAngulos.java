package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OperacionesBasicasConAngulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_basicas_con_angulos);
    }

    //metodo del boton ejemplo1
    public void ejemplo1 (View view){
        Intent ejemplo1 = new Intent(this,ejemplo1.class);
        startActivity(ejemplo1);
    }

    //metodo del boton ejemplo2
    public void ejemplo2 (View view){
        Intent ejemplo2 = new Intent(this, ejemplo2.class);
        startActivity(ejemplo2);
    }

    //metodo del boton ejemplo3
    public void ejemplo3 (View view){
        Intent ejemplo3 = new Intent(this, ejemplo3.class);
        startActivity(ejemplo3);
    }
}
