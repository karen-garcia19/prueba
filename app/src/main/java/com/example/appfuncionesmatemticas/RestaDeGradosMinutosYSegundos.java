package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RestaDeGradosMinutosYSegundos extends AppCompatActivity {

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
        setContentView(R.layout.activity_resta_de_grados_minutos_ysegundos);

        grados1 = (EditText)findViewById(R.id.gradosingre_1);
        grados2 = (EditText)findViewById(R.id.gradosingre_2);
        min1 = (EditText)findViewById(R.id.miningre_1);
        min2 = (EditText)findViewById(R.id.miningre_2);
        seg1 = (EditText)findViewById(R.id.segingre_1);
        seg2 = (EditText)findViewById(R.id.segingre_2);
        res = (TextView)findViewById(R.id.resulta3);
    }
    //Este metodo realiza la resta
    public void resta(View view){
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

        if (num5 < num6){
            num3 = num3 - 1;
            num5 = num5 + 60;
        }

        if (num3 < num4){
            num1 = num1 -1;
            num3 = num3 + 60;
        }
        int restaGrad = num1 - num2;
        int restaMin = num3 - num4;
        int restaSeg = num5 - num6;

        String grados = String.valueOf(restaGrad);
        String minutos = String.valueOf(restaMin);
        String segundos = String.valueOf(restaSeg);
        res.setText(grados +"º" + minutos +"'" + segundos +"''");
    }
}
