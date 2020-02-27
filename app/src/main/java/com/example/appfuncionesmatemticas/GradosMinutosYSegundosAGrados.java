package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GradosMinutosYSegundosAGrados extends AppCompatActivity {

    private EditText Grados;
    private EditText Minutos;
    private EditText Segundos;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grados_minutos_ysegundos_agrados);

        Grados = (EditText)findViewById(R.id.ligrados);
        Minutos = (EditText)findViewById(R.id.liminutos);
        Segundos = (EditText)findViewById(R.id.lisegundos);
        resultado = (TextView)findViewById(R.id.ezer_resultado9);
    }
    //Este metodo realiza la conversion
    public void grados(View view){
        String valor1 = Grados.getText().toString();
        String valor2 = Minutos.getText().toString();
        String valor3 = Segundos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double grados1 = num2 / 60;
        double grados2 = num3 / 3600;
        double sumaMin = num1 + grados1 + grados2;

        String res1 = String.valueOf(sumaMin);
        resultado.setText(res1 +"°");
    }
}
