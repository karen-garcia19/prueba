package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Figura5 extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private EditText C;
    private EditText D;
    private EditText E;
    private EditText F;
    private EditText G;
    private EditText H;
    private EditText I;
    private TextView r1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura5);

        A = (EditText)findViewById(R.id.ide_a);
        B = (EditText)findViewById(R.id.ide_b);
        C = (EditText)findViewById(R.id.ide_c);
        D = (EditText)findViewById(R.id.ide_d);
        E = (EditText)findViewById(R.id.ide_e);
        F = (EditText)findViewById(R.id.ide_f);
        G = (EditText)findViewById(R.id.ide_g);
        H = (EditText)findViewById(R.id.ide_h);
        I = (EditText)findViewById(R.id.ide_i);
        r1 = (TextView) findViewById(R.id.txt_resultado23);

    }
    //este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = A.getText().toString();
        String valor2 = B.getText().toString();
        String valor3 = C.getText().toString();
        String valor4 = D.getText().toString();
        String valor5 = E.getText().toString();
        String valor6 = F.getText().toString();
        String valor7 = G.getText().toString();
        String valor8 = H.getText().toString();
        String valor9 = I.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);
        double num5 = Double.parseDouble(valor5);
        double num6 = Double.parseDouble(valor6);
        double num7 = Double.parseDouble(valor7);
        double num8 = Double.parseDouble(valor8);
        double num9 = Double.parseDouble(valor9);

        double suma = num1 + (num2 * 2) + num3 + (num4 * 2) + num5 + num6 + (num7 * 2) + num8 + num9;

        String result = String.valueOf(suma);
        r1.setText(result);
    }

    //metodo del boton calcular
    public void calcular (View view){
        Intent calcular = new Intent(this,Figura5_5.class);
        startActivity(calcular);
    }
}
