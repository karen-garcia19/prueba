package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura4 extends AppCompatActivity {

    private EditText l1;
    private TextView r1;

    private EditText l2;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura4);

        l1 = (EditText)findViewById(R.id.tx_ingresaa);
        r1 = (TextView)findViewById(R.id.txt_resultado36);

        l2 = (EditText)findViewById(R.id.tx_ingresaa12);
        r2 = (TextView)findViewById(R.id.txt_resultado21);
    }
    //Este metodo realiza el perimetro del circulo
    public void perimetro(View view){
        String valor1 = l1.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double circulo = (((num1 + num1) * 3.1416) / 4) * 3;
        double perimetro = circulo + (num1 + num1);

        String result1 = String.valueOf(perimetro);
        r1.setText(result1);
    }
    //Este metodo realiza el area del circulo
    public void area(View view){
        String valor2 = l2.getText().toString();

        double num2 = Double.parseDouble(valor2);

        double circulo = ((3.1416 * (num2 * num2)) / 4) * 3;
        double perimetro = circulo + (num2 * num2);

        String result2 = String.valueOf(perimetro);
        r2.setText(result2);
    }
}
