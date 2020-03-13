package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Caso5 extends AppCompatActivity {

    private EditText num, x, y;
    private TextView res1, res2, res3, res4, res5, res6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caso5);

        num = (EditText)findViewById(R.id.lol1);
        x = (EditText)findViewById(R.id.lol2);
        y = (EditText)findViewById(R.id.lol3);
        res1 = (TextView)findViewById(R.id.lolr1);
        res2 = (TextView)findViewById(R.id.lolr2);
        res3 = (TextView)findViewById(R.id.lolr3);
        res4 = (TextView)findViewById(R.id.lolr4);
        res5 = (TextView)findViewById(R.id.lolr5);
        res6 = (TextView)findViewById(R.id.lolr6);
    }
    //Este metodo realiza la operacion
    public void caso5(View view){
        String valor1 = num.getText().toString();
        String valor2 = x.getText().toString();
        String valor3 = y.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        if (num1 == 1){
            double resta = (num3 * num3) - (num2 * num2);
            double adya = Math.sqrt(resta);

            //Seno
            double resu = num2 / num3;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = adya / num3;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = num2 / adya;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = adya / num2;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = num3 / adya;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = num3 / num2;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
        if (num1 == 2){
            double resta = (num3 * num3) - (num2 * num2);
            double opue = Math.sqrt(resta);

            //Seno
            double resu = opue / num3;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = num2 / num3;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = opue / num2;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = num2 / opue;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = num3 / num2;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = num3 / opue;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
        if (num1 == 3){
            double suma = (num2 * num2) + (num3 * num3);
            double hipo = Math.sqrt(suma);

            //Seno
            double resu = num2 / hipo;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = num3 / hipo;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = num2 / num3;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = num3 / num2;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = hipo / num3;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = hipo / num2;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
        if (num1 == 4){
            double suma = (num3 * num3) + (num2 * num2);
            double hipo = Math.sqrt(suma);

            //Seno
            double resu = num3 / hipo;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = num2 / hipo;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = num3 / num2;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = num2 / num3;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = hipo / num2;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = hipo / num3;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
        if (num1 == 5){
            double resta = (num2 * num2) - (num3 * num3);
            double opue = Math.sqrt(resta);

            //Seno
            double resu = opue / num2;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = num3 / num2;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = opue / num3;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = num3 / opue;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = num2 / num3;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = num2 / opue;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
        if (num1 == 6){
            double resta = (num2 * num2) - (num3 * num3);
            double adya = Math.sqrt(resta);

            //Seno
            double resu = num3 / num2;
            String rest = String.valueOf(resu);
            res1.setText(rest);

            //Coseno
            double resu1 = adya / num2;
            String rest1 = String.valueOf(resu1);
            res2.setText(rest1);

            //Tangente
            double resu2 = num3 / adya;
            String rest2 = String.valueOf(resu2);
            res3.setText(rest2);

            //Cotangente
            double resu3 = adya / num3;
            String rest3 = String.valueOf(resu3);
            res4.setText(rest3);

            //Secante
            double resu4 = num2 / adya;
            String rest4 = String.valueOf(resu4);
            res5.setText(rest4);

            //Cosecante
            double resu5 = num2 / num3;
            String rest5 = String.valueOf(resu5);
            res6.setText(rest5);
        }
    }
}
