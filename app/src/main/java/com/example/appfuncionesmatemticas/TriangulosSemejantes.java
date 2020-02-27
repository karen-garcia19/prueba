package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TriangulosSemejantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulos_semejantes);
    }

    //metodo del boton ejemplo1
    public void ejemplo1 (View view){
        Intent ejemplo1 = new Intent(this,Ejemplo1congruente.class);
        startActivity(ejemplo1);
    }

    //metodo del boton ejemplo2
    public void ejemplo2 (View view){
        Intent ejemplo2 = new Intent(this,Ejemplo2congruente.class);
        startActivity(ejemplo2);
    }
}
