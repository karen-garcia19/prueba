package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelCuadrado extends AppCompatActivity {

    private EditText p1;
    private TextView r1;
    private EditText a1;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_cuadrado);

        p1 = (EditText)findViewById(R.id.txt_ladoA2);
        r1 = (TextView)findViewById(R.id.txt_resultado3);

        a1 = (EditText)findViewById(R.id.txt_base2);
        r2 = (TextView)findViewById(R.id.txt_resultado4);
    }
    //Este método realiza la suma
    public void suma(View view) {
        String valor5 = p1.getText().toString();

        double num5 = Double.parseDouble(valor5);

        double suma = num5 + num5 + num5 + num5;

         String result3 = String.valueOf(suma);
        r1.setText(result3);
    }
    //Este método realiza la multiplicación
    public void multiplicacion2(View view) {
        String valor6 = a1.getText().toString();

        double num6 = Double.parseDouble(valor6);

        double multiplicación = num6 * num6;

        String result4 = String.valueOf(multiplicación);
        r2.setText(result4);
    }
}
