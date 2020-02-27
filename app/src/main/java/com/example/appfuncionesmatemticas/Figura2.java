package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura2 extends AppCompatActivity {

    private EditText ia;
    private EditText ib;
    private EditText ic;
    private EditText id;
    private EditText ie;
    private EditText if1;
    private TextView r1;

    private EditText b1;
    private EditText a1;
    private EditText b2;
    private EditText a2;
    private TextView r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura2);

        ia = (EditText)findViewById(R.id.txt_ingreseA);
        ib = (EditText)findViewById(R.id.txt_ingreseB);
        ic = (EditText)findViewById(R.id.txt_ingreseC);
        id = (EditText)findViewById(R.id.txt_ingreseD);
        ie = (EditText)findViewById(R.id.txt_ingreseE);
        if1 = (EditText)findViewById(R.id.txt_ingreseF);
        r1 = (TextView)findViewById(R.id.txt_resultado16);

        b1 = (EditText)findViewById(R.id.txt_ingresaBase);
        a1 = (EditText)findViewById(R.id.txt_ingresaAltura);
        b2 = (EditText)findViewById(R.id.txt_ingresaBase1);
        a2 = (EditText)findViewById(R.id.txt_ingresaAltura1);
        r2 = (TextView)findViewById(R.id.txt_resultado17);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = ia.getText().toString();
        String valor2 = ib.getText().toString();
        String valor3 = ic.getText().toString();
        String valor4 = id.getText().toString();
        String valor5 = ie.getText().toString();
        String valor6 = if1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);

        double perimetro = num1 + num2 + num3 + num4 + num5 + num6;

        String result1 = String.valueOf(perimetro);
        r1.setText(result1);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor7 = b1.getText().toString();
        String valor8 = a1.getText().toString();
        String valor9 = b2.getText().toString();
        String valor10 = a2.getText().toString();

        double num7 = Double.parseDouble(valor7);
        double num8 = Double.parseDouble(valor8);
        double num9 = Double.parseDouble(valor9);
        double num10 = Double.parseDouble(valor10);

        double area = (num7 * num8) + (num9 * num10);

        String result2 = String.valueOf(area);
        r2.setText(result2);
    }
}
