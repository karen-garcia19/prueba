package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DeGradosMinutosYSedundosASegundos extends AppCompatActivity {

    private EditText Grados;
    private EditText Minutos;
    private EditText Segundos;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_grados_minutos_ysedundos_asegundos);

        Grados = (EditText)findViewById(R.id.ezer_grados2);
        Minutos = (EditText)findViewById(R.id.ezer_min2);
        Segundos = (EditText)findViewById(R.id.ezer_seg2);
        resultado = (TextView)findViewById(R.id.ezer_resutado2);
    }
    //Este metodo realiza la conversion
    public void segundos(View view){
        String valor1 = Grados.getText().toString();
        String valor2 = Minutos.getText().toString();
        String valor3 = Segundos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double segundos1 = num1 * 3600;
        double segundos2 = num2 * 60;
        double sumaSeg = num3 + segundos1 + segundos2;

        String res1 = String.valueOf(sumaSeg);
        resultado.setText(res1 +"''");
    }
}
