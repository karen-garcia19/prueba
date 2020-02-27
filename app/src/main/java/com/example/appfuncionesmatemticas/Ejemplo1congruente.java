package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejemplo1congruente extends AppCompatActivity {

    private EditText x1;
    private EditText y1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1congruente);

        x1 = (EditText)findViewById(R.id.holax1);
        y1 = (EditText)findViewById(R.id.holay1);
    }
    //Este metodo realiza la condicion
    public void correcto(View view){
        String valor1 = x1.getText().toString();
        String valor2 = y1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        if (num1 == 13 & num2 == 19.8){
            Toast.makeText(this,"Correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 13 & num2 != 19.8){
            Toast.makeText(this,"Solo y es incorrecto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 13 & num2 == 19.8){
            Toast.makeText(this,"Solo x es incorrecto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 13 & num2 != 19.8){
            Toast.makeText(this,"Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}
