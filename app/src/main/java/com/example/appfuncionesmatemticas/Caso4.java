package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Caso4 extends AppCompatActivity {

    private EditText cateO, cateA, hip;
    private TextView res1, res2, res3, res4, res5, res6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caso4);

        cateO = (EditText)findViewById(R.id.lol7);
        cateA = (EditText)findViewById(R.id.lol8);
        hip = (EditText)findViewById(R.id.lol9);
        res1 = (TextView)findViewById(R.id.lolr13);
        res2 = (TextView)findViewById(R.id.lolr214);
        res3 = (TextView)findViewById(R.id.lolr14);
        res4 = (TextView)findViewById(R.id.lolr15);
        res5 = (TextView)findViewById(R.id.lolr16);
        res6 = (TextView)findViewById(R.id.lolr17);

    }
    //Este metodo realiza la operacion
    public void senoA(View view){
        String valor1 = cateO.getText().toString();
        String valor2 = cateA.getText().toString();
        String valor3 = hip.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        //Seno
        double resu = num1 / num3;
        String rest = String.valueOf(resu);
        res1.setText(rest);

        //Coseno
        double resu1 = num2 / num3;
        String rest1 = String.valueOf(resu1);
        res2.setText(" - " + rest1);

        //Tangente
        double resu2 = num1 / num2;
        String rest2 = String.valueOf(resu2);
        res3.setText(" - " + rest2);

        //Cotangente
        double resu3 = num2 / num1;
        String rest3 = String.valueOf(resu3);
        res4.setText(" - " + rest3);

        //Secante
        double resu4 = num3 / num2;
        String rest4 = String.valueOf(resu4);
        res5.setText(" - " + rest4);

        //Cosecante
        double resu5 = num3 / num1;
        String rest5 = String.valueOf(resu5);
        res6.setText(rest5);

        if (cateO.length() == 0){
            String valor5 = cateA.getText().toString();
            String valor6 = hip.getText().toString();

            double num5 = Double.parseDouble(valor5);
            double num6 = Double.parseDouble(valor6);

            double resta = (num6 * num6) - (num5 * num5);
            double cateo = Math.sqrt(resta);

            //Seno
            double resu6 = cateo / num6;
            String rest6 = String.valueOf(resu6);
            res1.setText(rest6);

            //Coseno
            double resu7 = num5 / num6;
            String rest7 = String.valueOf(resu7);
            res2.setText(" - " + rest7);

            //Tangente
            double resu8 = cateo / num5;
            String rest8 = String.valueOf(resu8);
            res3.setText(" - " + rest8);

            //Cotangente
            double resu9 = num5 / cateo;
            String rest9 = String.valueOf(resu9);
            res4.setText(" - " + rest9);

            //Secante
            double resu10 = num6 / num5;
            String rest10 = String.valueOf(resu10);
            res5.setText(" - " + rest10);

            //Cosecante
            double resu11 = num6 / cateo;
            String rest11 = String.valueOf(resu11);
            res6.setText(rest11);
        }
        if (cateA.length() == 0){
            String valor4 = cateO.getText().toString();
            String valor6 = hip.getText().toString();

            double num4 = Double.parseDouble(valor4);
            double num6 = Double.parseDouble(valor6);

            double resta1 = (num6 * num6) - (num4 * num4);
            double adya = Math.sqrt(resta1);

            //Seno
            double resu6 = num4 / num6;
            String rest6 = String.valueOf(resu6);
            res1.setText(rest6);

            //Coseno
            double resu7 = adya / num6;
            String rest7 = String.valueOf(resu7);
            res2.setText(" - " + rest7);

            //Tangente
            double resu8 = num4 / adya;
            String rest8 = String.valueOf(resu8);
            res3.setText(" - " + rest8);

            //Cotangente
            double resu9 = adya / num4;
            String rest9 = String.valueOf(resu9);
            res4.setText(" - " + rest9);

            //Secante
            double resu10 = num6 / adya;
            String rest10 = String.valueOf(resu10);
            res5.setText(" - " + rest10);

            //Cosecante
            double resu11 = num6 / num4;
            String rest11 = String.valueOf(resu11);
            res6.setText(rest11);
        }
        if (hip.length() == 0){
            String valor4 = cateO.getText().toString();
            String valor5 = cateA.getText().toString();

            double num4 = Double.parseDouble(valor4);
            double num5 = Double.parseDouble(valor5);

            double resta = (num4 * num4) + (num5 * num5);
            double hipo = Math.sqrt(resta);

            //Seno
            double resu6 = num4 / hipo;
            String rest6 = String.valueOf(resu6);
            res1.setText(rest6);

            //Coseno
            double resu7 = num5 / hipo;
            String rest7 = String.valueOf(resu7);
            res2.setText(" - " + rest7);

            //Tangente
            double resu8 = num4 / num5;
            String rest8 = String.valueOf(resu8);
            res3.setText(" - " + rest8);

            //Cotangente
            double resu9 = num5 / num4;
            String rest9 = String.valueOf(resu9);
            res4.setText(" - " + rest9);

            //Secante
            double resu10 = hipo / num5;
            String rest10 = String.valueOf(resu10);
            res5.setText(" - " + rest10);

            //Cosecante
            double resu11 = hipo / num4;
            String rest11 = String.valueOf(resu11);
            res6.setText(rest11);
        }
    }

}
