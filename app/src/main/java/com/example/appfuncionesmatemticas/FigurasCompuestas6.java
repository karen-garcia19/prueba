package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FigurasCompuestas6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras_compuestas6);
    }

    //Metodo para el boton del prisma rectángular

    public void prisma (View View){
        Intent prisma = new Intent(this, PrismaRectangular.class);
        startActivity (prisma);
    }

    //Metodo para el boton del cubo

    public void ortaedro (View View){
        Intent ortaedro = new Intent(this, Ortaedro.class);
        startActivity (ortaedro);
    }

    //metodo del boton atrás 4
    public void atras4 (View view){
        Intent atras4 = new Intent(this,FigurasCompuestas5.class);
        startActivity(atras4);
    }
}
