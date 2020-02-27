package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pitagoras1 extends AppCompatActivity {

    private EditText lado1;
    private EditText lado2;
    private TextView resultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitagoras1);

        lado1 = (EditText)findViewById(R.id.y_ingresaA);
        lado2 = (EditText)findViewById(R.id.y_ingresaB);
        resultado1 = (TextView)findViewById(R.id.txt_resultado30);
    }
        //Este metodo realiza el problema
    public void teorema(View view){

        String valor1 = lado1.getText().toString();
        String valor2 = lado2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double suma = (num1 * num1) + (num2 * num2);
        double raiz = (Math.sqrt(suma));

        String result1 = String.valueOf(raiz);
        resultado1.setText(result1);
    }

}