package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumaDeGradosMinutosYSegundos extends AppCompatActivity {

    private EditText grados1;
    private EditText grados2;
    private EditText min1;
    private EditText min2;
    private EditText seg1;
    private EditText seg2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_de_grados_minutos_ysegundos);

        grados1 = (EditText)findViewById(R.id.grado1);
        grados2 = (EditText)findViewById(R.id.grado2);
        min1 = (EditText)findViewById(R.id.min1);
        min2 = (EditText)findViewById(R.id.min2);
        seg1 = (EditText)findViewById(R.id.seg1);
        seg2 = (EditText)findViewById(R.id.seg2);
        res = (TextView)findViewById(R.id.resulta1);
    }
    //Este metodo realiza la suma
    public void suma(View view){
        String valor1 = grados1.getText().toString();
        String valor2 = grados2.getText().toString();
        String valor3 = min1.getText().toString();
        String valor4 = min2.getText().toString();
        String valor5 = seg1.getText().toString();
        String valor6 = seg2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);
        int num4 = Integer.parseInt(valor4);
        int num5 = Integer.parseInt(valor5);
        int num6 = Integer.parseInt(valor6);

        int sumaGrados = num1 + num2;
        int sumaMin = num3 + num4;
        int sumaSeg = num5 + num6;

        if (sumaSeg > 60){
            int seg = sumaSeg % 60;
            int res1 = sumaSeg / 60;
            sumaMin = sumaMin + res1;
            sumaSeg = seg;
        }
        if (sumaMin > 60){
            int min = sumaMin % 60;
            int res2 = sumaMin / 60;
            sumaGrados = sumaGrados + res2;
            sumaMin = min;
        }
        String grados = String.valueOf(sumaGrados);
        String minutos = String.valueOf(sumaMin);
        String segundos = String.valueOf(sumaSeg);
        res.setText(grados +"º" + minutos +"'" + segundos +"''");
    }
}
