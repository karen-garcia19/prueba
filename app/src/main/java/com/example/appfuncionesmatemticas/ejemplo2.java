package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejemplo2 extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private EditText C;
    private EditText D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);

        A = (EditText)findViewById(R.id.ingresarx2a);
        B = (EditText)findViewById(R.id.ingresarx2b);
        C = (EditText)findViewById(R.id.ingresarx2c);
        D = (EditText)findViewById(R.id.ingresarx2d);
    }
    //Este metodo realiza la condicion
    public void correcto(View view){
        String valor1 = A.getText().toString();
        String valor2 = B.getText().toString();
        String valor3 = C.getText().toString();
        String valor4 = D.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        if (num1 == 127 & num2 == 45 & num3 == 82 & num4 == 98){
            Toast.makeText(this,"Correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 != 45 & num3 != 82 & num4 != 98){
            Toast.makeText(this,"Solo A es correcta", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 == 45 & num3 != 82 & num4 != 98){
            Toast.makeText(this,"Solo A y B son correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 == 45 & num3 == 82 & num4 != 98){
            Toast.makeText(this,"Solo A, B y C es incorrecto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 == 45 & num3 != 82 & num4 != 98){
            Toast.makeText(this,"Solo B es correcta", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 != 45 & num3 == 82 & num4 != 98){
            Toast.makeText(this,"Solo C es correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 != 45 & num3 != 82 & num4 == 98){
            Toast.makeText(this,"Solo D es correcta", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 != 45 & num3 == 82 & num4 == 98){
            Toast.makeText(this,"Solo C y D son correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 == 45 & num3 == 82 & num4 != 98){
            Toast.makeText(this,"Solo B y C es correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 == 45 & num3 == 82 & num4 == 98){
            Toast.makeText(this,"Solo B, C y D son correctos", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 != 45 & num3 != 82 & num4 != 98){
            Toast.makeText(this,"Incorrecto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 != 45 & num3 != 82 & num4 == 98){
            Toast.makeText(this,"Solo A y D es correcta", Toast.LENGTH_LONG).show();
        }
        if (num1 != 127 & num2 == 45 & num3 != 82 & num4 == 98){
            Toast.makeText(this,"Solo B y D son correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 != 45 & num3 == 82 & num4 != 98){
            Toast.makeText(this,"Solo A y C es correcto", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 == 45 & num3 != 82 & num4 == 98){
            Toast.makeText(this,"Solo A, B y D son correctos", Toast.LENGTH_LONG).show();
        }
        if (num1 == 127 & num2 != 45 & num3 == 82 & num4 == 98){
            Toast.makeText(this,"Solo A, C y D son correctos", Toast.LENGTH_LONG).show();
        }
    }

    //metodo del boton comprobación2
    public void Siguente2 (View view){
        Intent Siguiente2 = new Intent(this,comprobar2.class);
        startActivity(Siguiente2);
    }
}
