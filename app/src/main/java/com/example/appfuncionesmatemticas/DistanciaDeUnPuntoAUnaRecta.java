package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DistanciaDeUnPuntoAUnaRecta extends AppCompatActivity {

    private EditText x1, y1, Ax, By, C1;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distancia_de_un_punto_auna_recta);

        x1 = (EditText)findViewById(R.id.huhu7);
        y1 = (EditText)findViewById(R.id.huhu8);
        Ax = (EditText)findViewById(R.id.huhu9);
        By = (EditText)findViewById(R.id.huhu10);
        C1 = (EditText)findViewById(R.id.huhu11);
        res = (TextView)findViewById(R.id.huhu12);
    }
    //Este metodo realiza la operación
    public void distancia(View view){
        String valor1 = x1.getText().toString();
        String valor2 = x1.getText().toString();
        String valor3 = x1.getText().toString();
        String valor4 = x1.getText().toString();
        String valor5 = x1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);

        double suma = (num3 * num1) + (num4 * num2) + num5;
        double suma2 = (num3 * num3) + (num4 * num4);
        double raiz = Math.sqrt(suma2);
        double respuesta = suma / raiz;

        String resa = String.valueOf(respuesta);
        res.setText("Distancia es " + resa);
    }
}
