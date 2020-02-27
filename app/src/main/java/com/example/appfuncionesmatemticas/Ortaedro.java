package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ortaedro extends AppCompatActivity {

    private EditText A1;
    private EditText B1;
    private EditText C1;
    private TextView res1;
    private EditText A2;
    private EditText B2;
    private EditText C2;
    private TextView res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortaedro);

        A1 = (EditText)findViewById(R.id.ezer_a);
        B1 = (EditText)findViewById(R.id.ezer_b);
        C1 = (EditText)findViewById(R.id.ezer_c);
        res1 = (TextView)findViewById(R.id.ezer_resultado3);
        A2 = (EditText)findViewById(R.id.ezer_a1);
        B2 = (EditText)findViewById(R.id.ezer_b1);
        C2 = (EditText)findViewById(R.id.ezer_c1);
        res2 = (TextView) findViewById(R.id.ezer_resultado2);
    }
    //Este metodo realiza el volumen
    public void volumen(View view){
        String valor1 = A1.getText().toString();
        String valor2 = B1.getText().toString();
        String valor3 = C1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double volumen1 = num1 * num2 * num3;

        String resultado1 = String.valueOf(volumen1);
        res1.setText(resultado1);
    }
    public void area(View view){
        String valor4 = A2.getText().toString();
        String valor5 = B2.getText().toString();
        String valor6 = C2.getText().toString();

        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);

        double area1 = 2 * ((num4 * num5) + (num4 * num6) + (num5 * num6));

        String resultado2 = String.valueOf(area1);
        res2.setText(resultado2);
    }
}
