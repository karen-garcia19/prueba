package com.example.appfuncionesmatemticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TriangulosOblicuangulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulos_oblicuangulos);
    }

    //Metodo para el boton ley de sen
    public void sen (View View){
        Intent sen = new Intent(this, LeyDeSenos.class);
        startActivity(sen);
    }

    //Metodo para el boton ley de cos
    public void cos (View View){
        Intent cos = new Intent(this, LeyDeCosenos.class);
        startActivity(cos);
    }
}
