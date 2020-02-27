package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GradosMinutosYSegubdosAMinutos extends AppCompatActivity {

    private EditText Grados;
    private EditText Minutos;
    private EditText Segundos;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grados_minutos_ysegubdos_aminutos);

        Grados = (EditText)findViewById(R.id.ezer_grado1);
        Minutos = (EditText)findViewById(R.id.ezer_min1);
        Segundos = (EditText)findViewById(R.id.ezer_seg1);
        resultado = (TextView)findViewById(R.id.ezer_resultado1);
    }
    //Este metodo realiza la conversion
    public void minutos(View view){
        String valor1 = Grados.getText().toString();
        String valor2 = Minutos.getText().toString();
        String valor3 = Segundos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double minutos1 = num1 * 60;
        double minutos2 = num3 / 60;
        double sumaMin = num2 + minutos1 + minutos2;

        String res1 = String.valueOf(sumaMin);
        resultado.setText(res1 +"'");
    }
}
