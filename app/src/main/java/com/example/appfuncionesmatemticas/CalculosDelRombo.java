package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculosDelRombo extends AppCompatActivity {

    private EditText a3;
    private TextView r8;

    private EditText dma;
    private EditText dme;
    private TextView r9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_rombo);

        a3 = (EditText)findViewById(R.id.txt_lado3);
        r8 = (TextView)findViewById(R.id.txt_resultado7);

        dma = (EditText)findViewById(R.id.txt_Dm1);
        dme = (EditText)findViewById(R.id.txt_dm1);
        r9 = (TextView)findViewById(R.id.txt_resultado8);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = a3.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double perimetro = 4 * num1;

        String result5 = String.valueOf(perimetro);
        r8.setText(result5);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor2 = dma.getText().toString();
        String valor3 = dme.getText().toString();

        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double area = (num2 * num3) / 2;

        String result6 = String.valueOf(area);
        r9.setText(result6);
    }
}
