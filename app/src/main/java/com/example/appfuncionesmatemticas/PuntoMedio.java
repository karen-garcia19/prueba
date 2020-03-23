package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PuntoMedio extends AppCompatActivity {

    private EditText x1, y1, x2, y2, x3, y3;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto_medio);

        x1 = (EditText)findViewById(R.id.huhu13);
        y1 = (EditText)findViewById(R.id.huhu14);
        x2 = (EditText)findViewById(R.id.huhu15);
        y2 = (EditText)findViewById(R.id.huhu16);
        x3 = (EditText)findViewById(R.id.huhu17);
        y3 = (EditText)findViewById(R.id.huhu18);
        res = (TextView)findViewById(R.id.huhu19);
    }
    //Este metodo realiza la operacion
    public void puntoMedio(View view){
        if (x1.length() != 0 & x2.length() != 0 & x3.length() != 0){
            String valor1 = x1.getText().toString();
            String valor2 = y1.getText().toString();
            String valor3 = x2.getText().toString();
            String valor4 = y2.getText().toString();
            String valor5 = x3.getText().toString();
            String valor6 = y3.getText().toString();

            //Punto A
            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            //Punto B
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);
            //Punto C
            double num5 = Double.parseDouble(valor5);
            double num6 = Double.parseDouble(valor6);

            //Punto AB
            double segx = (num1 + num3) / 2;
            double segy = (num2 + num4) / 2;
            //Punto BC
            double segx1 = (num3 + num5) / 2;
            double segy1 = (num4 + num6) / 2;
            //Punto AC
            double segx2 = (num1 + num5) / 2;
            double segy2 = (num2 + num6) / 2;

            String res1 = String.valueOf(segx);
            String res2 = String.valueOf(segy);
            String res3 = String.valueOf(segx1);
            String res4 = String.valueOf(segy1);
            String res5 = String.valueOf(segx2);
            String res6 = String.valueOf(segy2);
            res.setText("Punto Medio para AB (" + res1 + "," + res2 + "), BC (" + res3 + "," + res4 + "), AC (" + res5 + "," + res6 + ").");
        }

        if (x1.length() == 0){
            String valor3 = x2.getText().toString();
            String valor4 = y2.getText().toString();
            String valor5 = x3.getText().toString();
            String valor6 = y3.getText().toString();

            //Punto B
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);
            //Punto C
            double num5 = Double.parseDouble(valor5);
            double num6 = Double.parseDouble(valor6);

            //Punto BC
            double segx1 = (num3 + num5) / 2;
            double segy1 = (num4 + num6) / 2;

            String res3 = String.valueOf(segx1);
            String res4 = String.valueOf(segy1);
            res.setText("Punto Medio de BC (" + res3 + "," + res4 + ").");
        }
        if (x2.length() == 0){
            String valor1 = x1.getText().toString();
            String valor2 = y1.getText().toString();
            String valor5 = x3.getText().toString();
            String valor6 = y3.getText().toString();

            //Punto A
            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            //Punto C
            double num5 = Double.parseDouble(valor5);
            double num6 = Double.parseDouble(valor6);
            //Punto AC
            double segx2 = (num1 + num5) / 2;
            double segy2 = (num2 + num6) / 2;

            String res5 = String.valueOf(segx2);
            String res6 = String.valueOf(segy2);
            res.setText("Punto medio de AC (" + res5 + "," + res6 + ").");

        }
        if (x3.length() == 0){
            String valor1 = x1.getText().toString();
            String valor2 = y1.getText().toString();
            String valor3 = x2.getText().toString();
            String valor4 = y2.getText().toString();

            //Punto A
            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);
            //Punto B
            double num3 = Double.parseDouble(valor3);
            double num4 = Double.parseDouble(valor4);
            //Punto AB
            double segx1 = (num1 + num3) / 2;
            double segy1 = (num2 + num4) / 2;

            String res1 = String.valueOf(segx1);
            String res2 = String.valueOf(segy1);
            res.setText("Punto medio de AB (" + res1 + "," + res2 + ").");
        }
    }
}
