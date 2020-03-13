package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Caso6 extends AppCompatActivity {

    private EditText funcion, cuadrante, lado;
    private TextView res1, res2, res3, res4, res5, res6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caso6);

        funcion = (EditText)findViewById(R.id.lol4);
        cuadrante = (EditText)findViewById(R.id.editText9lol5);
        lado = (EditText)findViewById(R.id.lol6);
        res1 = (TextView)findViewById(R.id.lolr7);
        res2 = (TextView)findViewById(R.id.lolr8);
        res3 = (TextView)findViewById(R.id.lolr9);
        res4 = (TextView)findViewById(R.id.lolr10);
        res5 = (TextView)findViewById(R.id.lolr11);
        res6 = (TextView)findViewById(R.id.lolr12);
    }
    //Este metodo realiza la operacion
    public void caso6(View view){
        String valor1 = funcion.getText().toString();
        String valor2 = cuadrante.getText().toString();
        String valor3 = lado.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        if (num1 == 1 & num2 == 1){

        }
        if (num1 == 1 & num2 == 2){

        }
        if (num1 == 1 & num2 == 3){

        }
        if (num1 == 1 & num2 == 4){

        }
        if (num1 == 1 & num2 == 5){

        }
        if (num1 == 1 & num2 == 6){

        }
    }
}
