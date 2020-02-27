package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejemplo3 extends AppCompatActivity {

    private EditText x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);

        x1 = (EditText)findViewById(R.id.ingresax3);
    }
    //Este metodo realiza la condicion
    public void correcto(View view){
        String valor1 = x1.getText().toString();

        double num1 = Double.parseDouble(valor1);

        if (num1 == 20){
            Toast.makeText(this,"Correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 20){
            Toast.makeText(this,"Incorrecto", Toast.LENGTH_LONG).show();
        }
    }

    //metodo del boton comprobación3
    public void Siguente3 (View view){
        Intent Siguiente3 = new Intent(this,Comprobar3.class);
        startActivity(Siguiente3);
    }
}
