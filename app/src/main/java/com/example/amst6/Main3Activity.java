package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView textView;
    private  TextView textView2;
    private  TextView textView3;
    private  TextView textView4;

    String [] almuerzos1 ={"Sopa de lentejas","Seco de pollo","Crema de legunmbres","Carne apanada con ensalada"};
    String [] almuerzos2 ={"Sopa de pollo","Lomito saltado","Sopa de pescado","Cazuela"};
    String [] almuerzos3 ={"Sopa de legumbres","Enrollado de atun","Sopa de queso","Tallarin de pollo"};
    String [] almuerzos4 ={"Sancocho de carne","Guatita","Crema de zapallo","Estofado de pollo"};
    String [] almuerzos5 ={"Sopa de torreja","Guisado de carne","Caldo de bola","Seco de carne"};
    String [] almuerzos6 ={"","","",""};
    String [] almuerzos7 ={"","","",""};
    String [] almuerzos8 ={"","","",""};
    String [] almuerzos9 ={"","","",""};
    String [] almuerzos10 ={"","","",""};
    String [] almuerzos11 ={"","","",""};
    String [] almuerzos12 ={"","","",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();

        String dia = bundle.getString("dia");
        String comedor =bundle.getString("comedor");
        textView = (TextView)  findViewById(R.id.textView);
        textView2 = (TextView)  findViewById(R.id.textView2);
        textView3 = (TextView)  findViewById(R.id.textView3);
        textView4 = (TextView)  findViewById(R.id.textView4);
        if(comedor.equals("Celex")){
            if (dia.equals("Lunes")) {
                textView.setText(almuerzos1[0]);
                textView2.setText(almuerzos1[1]);
                textView3.setText(almuerzos1[2]);
                textView4.setText(almuerzos1[3]);
            }
            else {
                textView.setText(almuerzos2[0]);
                textView2.setText(almuerzos2[1]);
                textView3.setText(almuerzos2[2]);
                textView4.setText(almuerzos2[3]);
            }
        }
        if(comedor.equals("Fadcom")){
            if(dia.equals("Lunes")){
                textView.setText(almuerzos3[0]);
                textView2.setText(almuerzos3[1]);
                textView3.setText(almuerzos3[2]);
                textView4.setText(almuerzos3[3]);
            }
            else {
                textView.setText(almuerzos4[0]);
                textView2.setText(almuerzos4[1]);
                textView3.setText(almuerzos4[2]);
                textView4.setText(almuerzos4[3]);
            }
        }
        if(comedor.equals("Piscina")){
            if(dia.equals("Lunes")){
                textView.setText(almuerzos5[0]);
                textView2.setText(almuerzos5[1]);
                textView3.setText(almuerzos5[2]);
                textView4.setText(almuerzos5[3]);
            }
            else {
                textView.setText(almuerzos6[0]);
                textView2.setText(almuerzos6[1]);
                textView3.setText(almuerzos6[2]);
                textView4.setText(almuerzos6[3]);
            }
        }
        if(comedor.equals("Fadcom")){
            if(dia.equals("Lunes")){
                textView.setText(almuerzos7[0]);
                textView2.setText(almuerzos7[1]);
                textView3.setText(almuerzos7[2]);
                textView4.setText(almuerzos7[3]);
            }
            else {
                textView.setText(almuerzos8[0]);
                textView2.setText(almuerzos8[1]);
                textView3.setText(almuerzos8[2]);
                textView4.setText(almuerzos8[3]);
            }
        }
        if(comedor.equals("FCSH")){
            if(dia.equals("Lunes")){
                textView.setText(almuerzos9[0]);
                textView2.setText(almuerzos9[1]);
                textView3.setText(almuerzos9[2]);
                textView4.setText(almuerzos9[3]);
            }
            else {
                textView.setText(almuerzos10[0]);
                textView2.setText(almuerzos10[1]);
                textView3.setText(almuerzos10[2]);
                textView4.setText(almuerzos10[3]);
            }
        }
        if(comedor.equals("Fresh Food")){
            if(dia.equals("Lunes")){
                textView.setText(almuerzos11[0]);
                textView2.setText(almuerzos11[1]);
                textView3.setText(almuerzos11[2]);
                textView4.setText(almuerzos11[3]);
            }
            else {
                textView.setText(almuerzos12[0]);
                textView2.setText(almuerzos12[1]);
                textView3.setText(almuerzos12[2]);
                textView4.setText(almuerzos12[3]);
            }
        }

}
}
