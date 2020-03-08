package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Caso3 extends AppCompatActivity {

    private EditText ladoa;
    private EditText ladoc;
    private EditText Sena;
    private EditText Senc;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caso3);

        ladoa = (EditText)findViewById(R.id.ladoa3);
        ladoc = (EditText)findViewById(R.id.ladoc3);
        Sena = (EditText)findViewById(R.id.sena3);
        Senc = (EditText)findViewById(R.id.senc3);
        res = (TextView)findViewById(R.id.res3);
    }
    //Este metodo realiza el seno
    public void seno(View view) {

        if (ladoa.length() == 0){
            String valor2 = ladoc.getText().toString();
            String valor3 = Sena.getText().toString();
            String valor4 = Senc.getText().toString();

            double num2 = Double.parseDouble(valor2);
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);

            num3 = Math.toRadians(num3);
            num4 = Math.toRadians(num4);
            double lado1 = ((Math.sin(num3)) * num2) / Math.sin(num4);
            String res1 = String.valueOf(lado1);
            res.setText(res1);
        }
        if (ladoc.length() == 0){
            String valor1 = ladoa.getText().toString();
            String valor3 = Sena.getText().toString();
            String valor4 = Senc.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);

            num3 = Math.toRadians(num3);
            num4 = Math.toRadians(num4);
            double lado2 = (Math.sin(num4) * num1) / (Math.sin(num3));
            String res2 = String.valueOf(lado2);
            res.setText(res2);
        }
        if (Sena.length() == 0){
            String valor1 = ladoa.getText().toString();
            String valor2 = ladoc.getText().toString();
            String valor4 = Senc.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            double num4 = Double.parseDouble(valor4);

            num4 = Math.toRadians(num4);
            double anguloradianes = (Math.asin((Math.sin(num4) * num1) / num2));
            double angulo1 = Math.toDegrees(anguloradianes);
            String res1 = String.valueOf(angulo1);
            res.setText(res1 + " ° ");
        }
        if (Senc.length() == 0){
            String valor1 = ladoa.getText().toString();
            String valor2 = ladoc.getText().toString();
            String valor3 = Sena.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            double num3 = Double.parseDouble(valor3);

            num3 = Math.toRadians(num3);
            double angulob = (Math.asin((Math.sin(num3) * num2) / num1));
            double angulo2 = Math.toDegrees(angulob);
            String res1 = String.valueOf(angulo2);
            res.setText(res1 + " ° ");
        }
    }
}
