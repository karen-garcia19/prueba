package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RelacionDeConversiones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relacion_de_conversiones);
    }

    //metodo del boton aplicar
    public void calcular (View view){
        Intent calcular = new Intent(this,GradosAGradosMinutosYSegundos.class);
        startActivity(calcular);
    }

    //metodo del boton aplicar1
    public void calcular1 (View view){
        Intent calcular1 = new Intent(this,SumaDeGradosMinutosYSegundos.class);
        startActivity(calcular1);
    }

    //metodo del boton aplicar2
    public void calcular2 (View view){
        Intent calcular2 = new Intent(this,RestaDeGradosMinutosYSegundos.class);
        startActivity(calcular2);
    }

    //metodo del boton aplicar3
    public void calcular3 (View view){
        Intent calcular3 = new Intent(this,MultiplicacionDeGradosMinutosYSegundos.class);
        startActivity(calcular3);
    }

    //metodo del boton aplicar4
    public void calcular4 (View view){
        Intent calcular4 = new Intent(this,DivicionDeGradosMinutosYSegundos.class);
        startActivity(calcular4);
    }

    //metodo del boton aplicar5
    public void calcular5 (View view){
        Intent calcular5 = new Intent(this,GradosMinutosYSegubdosAMinutos.class);
        startActivity(calcular5);
    }

    //metodo del boton aplicar6
    public void calcular6 (View view){
        Intent calcular6 = new Intent(this,DeGradosMinutosYSedundosASegundos.class);
        startActivity(calcular6);
    }

    //metodo del boton aplicar7
    public void calcular7 (View view){
        Intent calcular7 = new Intent(this,GradosMinutosYSegundosAGrados.class);
        startActivity(calcular7);
    }
}
