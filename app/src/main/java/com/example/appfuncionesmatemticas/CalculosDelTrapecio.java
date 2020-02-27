package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelTrapecio extends AppCompatActivity {

    private EditText la;
    private EditText lb;
    private EditText lc;
    private EditText ld;
    private TextView r10;

    private EditText bma;
    private EditText bme;
    private EditText a5;
    private TextView r11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_trapecio);

        la = (EditText)findViewById(R.id.txt_lado6);
        lb = (EditText)findViewById(R.id.txt_lado7);
        lc = (EditText)findViewById(R.id.txt_lado8);
        ld = (EditText)findViewById(R.id.txt_lado9);
        r10 = (TextView)findViewById(R.id.txt_resultado11);

        bma = (EditText)findViewById(R.id.txt_BaseM1);
        bme = (EditText)findViewById(R.id.txt_Basem1);
        a5 = (EditText)findViewById(R.id.txt_altura2);
        r11 = (TextView)findViewById(R.id.txt_resultado12);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = la.getText().toString();
        String valor2 = lb.getText().toString();
        String valor3 = lc.getText().toString();
        String valor4 = ld.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        double perimetro = num1 + num2 + num3 + num4;

        String result6 = String.valueOf(perimetro);
        r10.setText(result6);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor5 = bma.getText().toString();
        String valor6 = bme.getText().toString();
        String valor7 = a5.getText().toString();

        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);
        double num7 = Double.parseDouble(valor7);

        double area = ((num5 + num6) * num7) / 2;

        String result7 = String.valueOf(area);
        r11.setText(result7);
    }
}
