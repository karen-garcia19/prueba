package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura6_6 extends AppCompatActivity {

    private EditText base1;
    private EditText altura1;
    private EditText base2;
    private EditText altura2;
    private EditText ladoD;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura6_6);

        base1 = (EditText)findViewById(R.id.e_base1);
        altura1 = (EditText)findViewById(R.id.e_altura1);
        base2 = (EditText)findViewById(R.id.e_base2);
        altura2 = (EditText)findViewById(R.id.e_altura2);
        ladoD = (EditText)findViewById(R.id.e_ladoD);
        resultado = (TextView)findViewById(R.id.txt_resultado26);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor1 = base1.getText().toString();
        String valor2 = altura1.getText().toString();
        String valor3 = base2.getText().toString();
        String valor4 = altura2.getText().toString();
        String valor5 = ladoD.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);

        double area = (num1 * num2) + ((num3 * num4) / 2) + (num5 * 4);

        String result = String.valueOf(area);
        resultado.setText(result);
    }
}
