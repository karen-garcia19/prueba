package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura3 extends AppCompatActivity {

    private EditText la;
    private EditText lc;
    private EditText ld;
    private TextView r1;

    private EditText bma;
    private EditText bme;
    private EditText a1;
    private EditText ld1;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura3);

        la = (EditText)findViewById(R.id.txt_ingresaA1);
        lc = (EditText)findViewById(R.id.txt_ingresaC2);
        ld = (EditText)findViewById(R.id.IngresaD2);
        r1 = (TextView)findViewById(R.id.txt_resultado18);

        bma = (EditText)findViewById(R.id.ingresabasemayor);
        bme = (EditText)findViewById(R.id.ingresabasemenor);
        a1 = (EditText)findViewById(R.id.ingresaaltura1);
        ld1 = (EditText)findViewById(R.id.ingresaladod);
        r2 = (TextView)findViewById(R.id.txt_resutado19);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = la.getText().toString();
        String valor2 = lc.getText().toString();
        String valor3 = ld.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double perimetro = num1 + (num2 * 2) + (num3 * 3);

        String result1 = String.valueOf(perimetro);
        r1.setText(result1);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor4 = bma.getText().toString();
        String valor5 = bme.getText().toString();
        String valor6 = a1.getText().toString();
        String valor7 = ld1.getText().toString();

        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);
        double num7 = Double.parseDouble(valor7);

        double area = (((num4 + num5) * num6) / 2) + (num7 * num7);

        String result2 = String.valueOf(area);
        r2.setText(result2);
    }
}
