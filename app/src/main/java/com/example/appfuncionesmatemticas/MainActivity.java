package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para el boton unidad1

    public void unidad1 (View View){
        Intent unidad1 = new Intent(this, Unidad.class);
        startActivity(unidad1);
    }

    //Metodo para el boton unidad1

    public void unidad2 (View View){
        Intent unidad2 = new Intent(this, Unidad2.class);
        startActivity(unidad2);
    }

}
