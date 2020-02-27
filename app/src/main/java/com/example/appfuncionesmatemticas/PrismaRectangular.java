package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrismaRectangular extends AppCompatActivity {

    private EditText A1;
    private EditText B1;
    private TextView res1;
    private EditText A2;
    private EditText B2;
    private TextView res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma_rectangular);

        A1 = (EditText) findViewById(R.id.ezera);
        B1 = (EditText) findViewById(R.id.ezerb);
        res1 = (TextView) findViewById(R.id.ezer_resultado4);
        A2 = (EditText) findViewById(R.id.ezera1);
        B2 = (EditText) findViewById(R.id.ezerb2);
        res2 = (TextView) findViewById(R.id.ezer_resultado6);
    }

    //Este metodo realiza el volumen
    public void volumen(View view) {
        String valor1 = A1.getText().toString();
        String valor2 = B1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double volumen3 = (num2 * num2) * num1;

        String resultado1 = String.valueOf(volumen3);
        res1.setText(resultado1);
    }
    //Este metodo realiza el area
    public void area(View view) {
        String valor1 = A1.getText().toString();
        String valor2 = B1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double area3 = (2 * (num2 * num2)) + (num1 * num2);

        String resultado2 = String.valueOf(area3);
        res2.setText(resultado2);
    }
}
