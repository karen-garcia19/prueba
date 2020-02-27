package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelCirculo extends AppCompatActivity {

    private EditText d1;
    private TextView r1;

    private  EditText b1;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_circulo);

        d1 = (EditText)findViewById(R.id.txt_d1);
        r1 = (TextView)findViewById(R.id.txt_resultado5);

        b1 = (EditText)findViewById(R.id.txt_r1);
        r2 = (TextView)findViewById(R.id.txt_resultado6);
    }
    //Este método realiza la perímetro
    public void perimetro(View view) {
        String valor1 = d1.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double perimetro = num1 * 3.1416;

        String result = String.valueOf(perimetro);
        r1.setText(result);
    }
    //Este método realiza la area
    public void area(View view) {
        String valor2 = b1.getText().toString();

        double num2 = Double.parseDouble(valor2);

        double area = 3.1416 * (num2 * num2);

        String result2 = String.valueOf(area);
        r2.setText(result2);
    }
}
