package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelCuboOHexaedro extends AppCompatActivity {

    private EditText a1;
    private TextView res1;
    private EditText a2;
    private TextView res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_cubo_ohexaedro);

        a1 = (EditText) findViewById(R.id.volumen1);
        res1 = (TextView) findViewById(R.id.ezer_resultado7);
        a2 = (EditText) findViewById(R.id.area1);
        res2 = (TextView) findViewById(R.id.ezer_resultado8);
    }
    //Este metodo realiza el volumen
    public void volumen(View view){
        String valor1 = a1.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double volumen2 = num1 * num1 * num1;

        String resultado1 = String.valueOf(volumen2);
        res1.setText(resultado1);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor2 = a2.getText().toString();

        double num2 = Double.parseDouble(valor2);

        double area2 = 6 * (num2 * num2);

        String resultado2 = String.valueOf(area2);
        res2.setText(resultado2);
    }
}
