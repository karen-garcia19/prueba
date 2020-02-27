package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculosDelTriangulo extends AppCompatActivity {

    private EditText la;
    private EditText lb;
    private EditText lc;
    private TextView r3;

    private EditText b3;
    private EditText a4;
    private TextView r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_triangulo);

        la = (EditText)findViewById(R.id.txt_lado);
        lb = (EditText)findViewById(R.id.txt_lado11);
        lc = (EditText)findViewById(R.id.txt_lado12);
        r3 = (TextView)findViewById(R.id.txt_resultado3);

        b3 = (EditText)findViewById(R.id.txt_base10);
        a4 = (EditText)findViewById(R.id.txt_base11);
        r4 = (TextView)findViewById(R.id.txt_resultado4);
    }
    //Este método realiza la suma
    public void suma(View view) {
        String valor1 = la.getText().toString();
        String valor2 = lb.getText().toString();
        String valor3 = lc.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double suma = num1 + num2 + num3;

        String result4 = String.valueOf(suma);
        r3.setText(result4);
    }
    //Este método realiza la multiplicación
    public void multiplicación(View view) {
        String valor4 = b3.getText().toString();
        String valor5 = a4.getText().toString();

        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);

        double multiplicacion = (num4 * num5) / 2;

        String result5 = String.valueOf(multiplicacion);
        r4.setText(result5);
    }
}
