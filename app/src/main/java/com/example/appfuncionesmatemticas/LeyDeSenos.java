package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LeyDeSenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ley_de_senos);
    }

    //Metodo para el boton opc1

    public void opc1 (View View){
        Intent opc1 = new Intent(this, Caso1.class);
        startActivity(opc1);
    }

    //Metodo para el boton opc2

    public void opc2 (View View){
        Intent opc2 = new Intent(this, Caso2.class);
        startActivity(opc2);
    }

    //Metodo para el boton opc3

    public void opc3(View View){
        Intent opc3 = new Intent(this, Caso3.class);
        startActivity(opc3);
    }
}
