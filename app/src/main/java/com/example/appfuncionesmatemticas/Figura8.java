package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura8 extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private TextView r1;
    private EditText radio;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura8);

        A = (EditText)findViewById(R.id.w_ingreseA);
        B = (EditText)findViewById(R.id.w_ingreseD);
        r1 = (TextView)findViewById(R.id.txt_resultado27);
        radio = (EditText)findViewById(R.id.w_ingreseRadio);
        r2 = (TextView)findViewById(R.id.txt_resultado28);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = A.getText().toString();
        String valor2 = B.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double circulo = ((num2 * 3.1416) / 4) * 2;
        double suma = circulo + (num1 * 4);

        String result1 = String.valueOf(suma);
        r1.setText(result1);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor3 = radio.getText().toString();

        double num3 = Double.parseDouble(valor3);

        double area = ((3.1416 * (num3 * num3) / 4) * 2) + ((num3 * num3) * 2);

        String result2 = String.valueOf(area);
        r2.setText(result2);
    }
}
