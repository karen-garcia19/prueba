package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura9 extends AppCompatActivity {

    private EditText base;
    private EditText altura;
    private EditText radio;
    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura9);

        base = (EditText)findViewById(R.id.R_base);
        altura = (EditText)findViewById(R.id.R_altura);
        radio = (EditText)findViewById(R.id.R_radio);
        r1 = (TextView)findViewById(R.id.txt_resultado29);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor1 = base.getText().toString();
        String valor2 = altura.getText().toString();
        String valor3 = radio.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double area = (num1 * num2) + (3.1416 * (num3 * num3));

        String result = String.valueOf(area);
        r1.setText(result);
    }
}
