package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cofucion extends AppCompatActivity {

    private EditText funcion;
    private EditText angulo;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cofucion);

        funcion = (EditText)findViewById(R.id.funcion);
        angulo = (EditText)findViewById(R.id.angulo);
        res = (TextView)findViewById(R.id.hula1234);

    }
    //Este metodo realizara la operacion
    public void cofucion (View view){
        String valor1 = funcion.getText().toString();
        String valor2 = angulo.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        if (num1 == 1){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Cos " + res1 + " ° ");
        }
        if (num1 == 2){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Sen " + res1 + " ° ");
        }
        if (num1 == 3){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Cot " + res1 + " ° ");
        }
        if (num1 == 4){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Tan " + res1 + " ° ");
        }
        if (num1 == 5){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Csc " + res1 + " ° ");
        }
        if (num1 == 6){
            double sena = 90 - num2;
            String res1 = String.valueOf(sena);
            res.setText("Sec " + res1 + " ° ");
        }
    }
}
