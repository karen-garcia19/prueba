package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculosDelParalelogramo extends AppCompatActivity {

    private EditText l1;
    private EditText l2;
    private TextView r4;

    private EditText b1;
    private EditText a1;
    private TextView r5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_del_paralelogramo);

        l1 = (EditText)findViewById(R.id.txt_ladoA7);
        l2 = (EditText)findViewById(R.id.txt_ladoB7);
        r4 = (TextView)findViewById(R.id.txt_resultado13);

        b1 = (EditText)findViewById(R.id.txt_lado4);
        a1 = (EditText)findViewById(R.id.txt_altura4);
        r5 = (TextView)findViewById(R.id.txt_resultado14);
    }
    //Este metodo realiza el perimetro
    public void perimetro(View view){
        String valor1 = l1.getText().toString();
        String valor2 = l2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double perimetro = (2 * num1) + (2 * num2);

        String result3 = String.valueOf(perimetro);
        r4.setText(result3);
    }
    //Este metodo realiza el area
    public void area(View view){
        String valor3 = b1.getText().toString();
        String valor4 = a1.getText().toString();

        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        double area = num3 * num4;

        String result4 = String.valueOf(area);
        r5.setText(result4);
    }
}
