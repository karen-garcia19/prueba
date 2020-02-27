package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura7 extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private EditText C;
    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura7);

        A = (EditText)findViewById(R.id.ingresa_A);
        B = (EditText)findViewById(R.id.ingresa_B);
        C = (EditText)findViewById(R.id.ingresa_C);
        r1 = (TextView)findViewById(R.id.txt_resultado22);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor1 = A.getText().toString();
        String valor2 = B.getText().toString();
        String valor3 = C.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double area = (num1 * num2) - (3.1416 * (num3 * num3));

        String result = String.valueOf(area);
        r1.setText(result);
    }
}
