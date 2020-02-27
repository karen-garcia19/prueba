package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Grados_radianes extends AppCompatActivity {

    private EditText grado;
    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grados_radianes);

        grado = (EditText)findViewById(R.id.inserte_grados);
        r1 = (TextView)findViewById(R.id.txt_resultado37);
    }
    //Este metodo realiza la coversion
    public void grado(View view){
        String valor1 = grado.getText().toString();

        double num1 = Double.parseDouble(valor1);

        double angGrados = (Math.PI * num1) / 180;

        String result = String.valueOf(angGrados);
        r1.setText(result);
    }
}
