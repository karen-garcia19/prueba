package com.example.appfuncionesmatemticas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GradosAGradosMinutosYSegundos extends AppCompatActivity {

    private EditText grados1;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grados_agrados_minutos_ysegundos);

        grados1 = (EditText)findViewById(R.id.Grados);
        resultado = (TextView)findViewById(R.id.Resultado);

    }
    //Este metodo realiza la conversion
    public void gradminseg(View view){
        String valor1 = grados1.getText().toString();

        double num1 = Double.parseDouble(valor1);
        String grados1 = String.valueOf(num1);
        int gradosant = Integer.parseInt(grados1.substring(0, grados1.indexOf('.')));
        double residuo = Double.parseDouble(grados1.substring(grados1.indexOf('.')));

        double minutos = residuo * 60;
        String minutos1 = String.valueOf(minutos);
        int minutosant = Integer.parseInt(minutos1.substring(0, minutos1.indexOf('.')));
        double residuo2 = Double.parseDouble(minutos1.substring(minutos1.indexOf('.')));

        double segundos = residuo2 * 60;
        String segundos1 = String.valueOf(segundos);
        int segundosant = Integer.parseInt(segundos1.substring(0, segundos1.indexOf('.')));

        resultado.setText(gradosant +"°" + minutosant +"'" + segundosant +"''");

    }
}
