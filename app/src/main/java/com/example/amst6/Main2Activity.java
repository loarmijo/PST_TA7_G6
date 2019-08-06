package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    private Spinner spinnerComedor;
    private Spinner spinnerDia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinnerComedor = (Spinner)findViewById(R.id.spinnerComedor);
        spinnerDia = (Spinner)findViewById(R.id.spinnerComedor);

        String [] comedores = {"","Celex","Fadcom","Piscina","FCSH","Fresh Food"};
        String [] dias = {"","Lunes","Martes","Miercoles","Jueves","Viernes"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,comedores);
        spinnerComedor.setAdapter(adapter);

        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dias);
        spinnerDia.setAdapter(adapter2);
    }

    public void iniciar(View view) {
        Intent i = new Intent(this, Main3Activity.class );
        startActivity(i);
    }

}
