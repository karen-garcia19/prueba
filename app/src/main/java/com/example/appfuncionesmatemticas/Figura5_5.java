package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura5_5 extends AppCompatActivity {

    private EditText base1;
    private EditText altura1;
    private EditText base2;
    private EditText altura2;
    private EditText base3;
    private EditText altura3;
    private EditText base4;
    private EditText altura4;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura5_5);

        base1 = (EditText)findViewById(R.id.base1);
        altura1 = (EditText)findViewById(R.id.altura1);
        base2 = (EditText)findViewById(R.id.base2);
        altura2 = (EditText)findViewById(R.id.altura2);
        base3 = (EditText)findViewById(R.id.base3);
        altura3 = (EditText)findViewById(R.id.altura3);
        base4 = (EditText)findViewById(R.id.base4);
        altura4 = (EditText)findViewById(R.id.altura4);
        r2 = (TextView) findViewById(R.id.xt_resultado24);

    }
    //este metodo realiza el perimetro
    public void area(View view){
        String valor1 = base1.getText().toString();
        String valor2 = altura1.getText().toString();
        String valor3 = base2.getText().toString();
        String valor4 = altura2.getText().toString();
        String valor5 = base3.getText().toString();
        String valor6 = altura3.getText().toString();
        String valor7 = base4.getText().toString();
        String valor8 = altura4.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);
        double num7 = Double.parseDouble(valor7);
        double num8 = Double.parseDouble(valor8);

        double suma1 = (num1 * num2) + (num3 * num4);
        double t1 = (num5 * num6) - (num7 * num8);
        double area = suma1 + t1;

        String result = String.valueOf(area);
        r2.setText(result);
    }
}
