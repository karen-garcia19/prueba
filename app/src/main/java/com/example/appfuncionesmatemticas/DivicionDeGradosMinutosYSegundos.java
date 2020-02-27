package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DivicionDeGradosMinutosYSegundos extends AppCompatActivity {

    private EditText grados1;
    private EditText valor;
    private EditText min1;
    private EditText seg1;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divicion_de_grados_minutos_ysegundos);

        grados1 = (EditText)findViewById(R.id.dgrado1);
        valor = (EditText)findViewById(R.id.valor2);
        min1 = (EditText)findViewById(R.id.dmin1);
        seg1 = (EditText)findViewById(R.id.dseg1);
        res = (TextView)findViewById(R.id.resulta4);
    }
    //Este metodo realiza la división
    public void division(View view){
        String valor1 = grados1.getText().toString();
        String valor2 = valor.getText().toString();
        String valor3 = min1.getText().toString();
        String valor4 = seg1.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);
        int num4 = Integer.parseInt(valor4);

        int divGrados = num1 / num2;
        int res1 = num1 % num2;
        int div1 = (res1 * 60) + num3;

        int divMinutos = div1 / num2;
        int res2 = div1 % num2;
        int div2 = (res2 * 60) + num4;

        int divSegundos = div2 / num2;

        String grados = String.valueOf(divGrados);
        String minutos = String.valueOf(divMinutos);
        String segundos = String.valueOf(divSegundos);
        res.setText(grados +"º" + minutos +"'" + segundos +"''");
    }
}
