package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ValoresDeLasFunciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_de_las_funciones);
    }

    //Metodo para el boton opc4

    public void opc4 (View View){
        Intent opc4 = new Intent(this, Caso4.class);
        startActivity(opc4);
    }

    //Metodo para el boton opc5

    public void opc5 (View View){
        Intent opc5 = new Intent(this, Caso5.class);
        startActivity(opc5);
    }

    //Metodo para el boton opc6

    public void opc6(View View){
        Intent opc6 = new Intent(this, Caso6.class);
        startActivity(opc6);
    }
}
