package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelPentagono extends AppCompatActivity {

    private EditText l3;
    private TextView r6;

    private EditText p1;
    private EditText a2;
    private TextView r7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_pentagono);

        l3 = (EditText)findViewById(R.id.txt_lado5);
        r6 = (TextView)findViewById(R.id.txt_resultado9);

        p1 = (EditText)findViewById(R.id.txt_p1);
        a2 = (EditText)findViewById(R.id.txt_apotema1);
        r7 = (TextView)findViewById(R.id.txt_resultado10);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = l3.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double perimetro = 5 * num1;

        String result4 = String.valueOf(perimetro);
        r6.setText(result4);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor2 = p1.getText().toString();
        String valor3 = a2.getText().toString();

        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double area = (num2 * num3) / 2;

        String result5 = String.valueOf(area);
        r7.setText(result5);
    }
}
