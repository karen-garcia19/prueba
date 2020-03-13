package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelAnguloCos extends AppCompatActivity {

    private EditText ladoa, ladob, ladoc, num;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_angulo_cos);

        ladoa = (EditText)findViewById(R.id.ingA);
        ladob = (EditText)findViewById(R.id.ingB);
        ladoc = (EditText)findViewById(R.id.ingC);
        num = (EditText)findViewById(R.id.editText4);
        res = (TextView)findViewById(R.id.resultado);

    }
    //Este metodo realizara la operacion
    public void cos(View view) {
        String valor1 = ladoa.getText().toString();
        String valor2 = ladob.getText().toString();
        String valor3 = ladoc.getText().toString();
        String valor4 = num.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        if (num4 == 1){
            double result = (((num2 * num2) + (num3 * num3)) - (num1 * num1)) / (2 * num2 * num3);
            double oper = Math.acos(result);
            double anguloa = Math.toDegrees(oper);
            String res1 = String.valueOf(anguloa);
            res.setText("El ángulo A = " + res1 + " ° ");
        }
        if (num4 == 2){
            double result = (((num1 * num1) + (num3 * num3)) - (num2 * num2)) / (2 * num1 * num3);
            double oper = Math.acos(result);
            double angulob = Math.toDegrees(oper);
            String res1 = String.valueOf(angulob);
            res.setText("El ánuglo B = " + res1 + " ° ");
        }
        if (num4 == 3){
            double result = (((num1 * num1) + (num2 * num2)) - (num3 * num3)) / (2 * num1 * num2);
            double oper = Math.acos(result);
            double anguloc = Math.toDegrees(oper);
            String res1 = String.valueOf(anguloc);
            res.setText("El ángulo C = " + res1 + " ° ");
        }
    }
}
