package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class CalculosDelRectangulo extends AppCompatActivity {

    private EditText a1;
    private EditText b1;
    private TextView r1;
    private EditText a2;
    private EditText b2;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_rectangulo);

        a1 = (EditText) findViewById(R.id.txt_altura4);
        b1 = (EditText) findViewById(R.id.txt_base1);
        r1 = (TextView) findViewById(R.id.txt_resultado1);

        a2 = (EditText) findViewById(R.id.txt_ladoA1);
        b2 = (EditText) findViewById(R.id.txt_ladoB1);
        r2 = (TextView) findViewById(R.id.txt_resultado2);
    }

    //Este método realiza la multiplicación
    public void multiplicación(View view) {
        String valor1 = a1.getText().toString();
        String valor2 = b1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double multi = num1 * num2;

        String result = String.valueOf(multi);
        r1.setText(result);
    }

    //Este método realiza la suma
    public void suma(View view){
        String valor3 = a2.getText().toString();
        String valor4 = b2.getText().toString();

        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        double suma = (2 * num3) + (2 * num4);

        String result2 = String.valueOf(suma);
        r2.setText(result2);
    }

    }

