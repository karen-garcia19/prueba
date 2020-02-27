package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Figura1 extends AppCompatActivity {

    private EditText l1;
    private TextView r1;

    private EditText c2;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura1);

        l1 = (EditText)findViewById(R.id.txt_cuadros);
        r1 = (TextView)findViewById(R.id.txt_resultado14);

        c2 = (EditText)findViewById(R.id.txt_cuadros1);
        r2 = (TextView)findViewById(R.id.txt_resultado15);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String num1 = l1.getText().toString();

        double valor1 = Double.parseDouble(num1);

        double perimetro = valor1;

        String result1 = String.valueOf(perimetro);
        r1.setText(result1);
    }
    //Este metodo realiza el are
    public void area(View view){
        String valor2 = c2.getText().toString();

        double num2 = Double.parseDouble(valor2);

        double area = num2;

        String result2 = String.valueOf(area);
        r2.setText(result2);
    }

}
