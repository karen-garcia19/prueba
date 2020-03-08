package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LeyDeCosenos extends AppCompatActivity {

    private EditText ladoa;
    private EditText ladob;
    private EditText ladoc;
    private EditText angulo1;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ley_de_cosenos);

        ladoa = (EditText)findViewById(R.id.ingresaA1);
        ladob = (EditText)findViewById(R.id.ingresaB1);
        ladoc = (EditText)findViewById(R.id.ingresaC1);
        angulo1 = (EditText)findViewById(R.id.angulo1);
        res = (TextView)findViewById(R.id.Gar12);
    }
    //Este metodo realiza el calculo
    public void cosenos (View view){
        if (ladoa.length() == 0){
            String valor2 = ladob.getText().toString();
            String valor3 = ladoc.getText().toString();
            String valor4 = angulo1.getText().toString();

            double num2 = Double.parseDouble(valor2);
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);

            num4 = Math.toRadians(num4);
            double result = Math.cos(num4);
            double lado = (Math.sqrt(((num2 * num2) + (num3 * num3)) - ((2 * num2 * num3) * result)));
            String res1 = String.valueOf(lado);
            res.setText(res1 + " cm ");
        }
        if (ladob.length() == 0){
            String valor1 = ladoa.getText().toString();
            String valor3 = ladoc.getText().toString();
            String valor4 = angulo1.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);

            num4 = Math.toRadians(num4);
            double result = Math.cos(num4);
            double lado = Math.sqrt(((num1 * num1) + (num3 * num3)) - ((2 * num1 * num3) * result));
            String res2 = String.valueOf(lado);
            res.setText(res2 + " cm ");
        }
        if (ladoc.length() == 0){
            String valor1 = ladoa.getText().toString();
            String valor2 = ladob.getText().toString();
            String valor4 = angulo1.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            double num4 = Double.parseDouble(valor4);

            num4 = Math.toRadians(num4);
            double result = Math.cos(num4);
            double lado = Math.sqrt(((num1 * num1) + (num2 * num2)) - ((2 * num1 * num2) * result));
            String res1 = String.valueOf(lado);
            res.setText(res1 + " cm ");
        }
    }

    //Metodo para el boton del calcular ángulo

    public void angulo (View View){
        Intent angulo = new Intent(this, CalculosDelAnguloCos.class);
        startActivity(angulo);
    }
}
