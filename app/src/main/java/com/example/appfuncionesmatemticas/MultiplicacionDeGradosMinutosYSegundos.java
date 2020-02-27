package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicacionDeGradosMinutosYSegundos extends AppCompatActivity {

    private EditText grados1;
    private EditText valor;
    private EditText min1;
    private EditText seg1;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion_de_grados_minutos_ysegundos);

        grados1 = (EditText)findViewById(R.id.grado_1);
        valor = (EditText)findViewById(R.id.valor1);
        min1 = (EditText)findViewById(R.id.min_1);
        seg1 = (EditText)findViewById(R.id.seg_1);
        res = (TextView)findViewById(R.id.resulta2);
    }
    //Este metodo realiza la multiplicación
    public void multiplicacion(View view){
        String valor1 = grados1.getText().toString();
        String valor2 = valor.getText().toString();
        String valor3 = min1.getText().toString();
        String valor4 = seg1.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);
        int num4 = Integer.parseInt(valor4);

        int multiGrados = num1 * num2;
        int multiMin = num3 * num2;
        int multiSeg = num4 * num2;

        if (multiSeg > 60){
            int seg = multiSeg % 60;
            int res1 = multiSeg / 60;
            multiMin = multiMin + res1;
            multiSeg = seg;
        }
        if (multiMin > 60){
            int min = multiMin % 60;
            int res2 = multiMin / 60;
            multiGrados = multiGrados + res2;
            multiMin = min;
        }
        String grados = String.valueOf(multiGrados);
        String minutos = String.valueOf(multiMin);
        String segundos = String.valueOf(multiSeg);
        res.setText(grados +"º" + minutos +"'" + segundos +"''");
    }
}
