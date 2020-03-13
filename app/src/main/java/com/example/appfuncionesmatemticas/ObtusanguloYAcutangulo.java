package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ObtusanguloYAcutangulo extends AppCompatActivity {

    private EditText ladoa, ladob, ladoc;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtusangulo_yacutangulo);

        ladoa = (EditText)findViewById(R.id.kar1);
        ladob = (EditText)findViewById(R.id.kar2);
        ladoc = (EditText)findViewById(R.id.kar3);
        res = (TextView)findViewById(R.id.karRes);

    }
    //Este metodo realiza la operacion
    public void comp(View view){
        String valor1 = ladoa.getText().toString();
        String valor2 = ladob.getText().toString();
        String valor3 = ladoc.getText().toString();

        double A = Double.parseDouble(valor1);
        double B = Double.parseDouble(valor2);
        double C = Double.parseDouble(valor3);

        double ladoA = A * A;
        double ladoB = B * B;
        double ladoC = C * C;

        double suma = ladoA + ladoB;

        if (ladoC < suma){
            res.setText("El triángulo es acutángulo, por qué " + ladoC + " < " + suma);
        }
        if (ladoC > suma){
            res.setText("El triángulo es obtusángulo, por qué " + ladoC + " > " + suma);
        }
    }
}
