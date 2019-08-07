package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
private View v;
    private TextView textView;
    private  TextView textView2;
    private  TextView textView3;
    private  TextView textView4;
    private  TextView textView8;

    String [] almuerzos1 ={"Sopa de lentejas","Seco de pollo","Crema de legunmbres","Carne apanada con ensalada"};
    String [] almuerzos2 ={"Sopa de pollo","Lomito saltado","Sopa de pescado","Cazuela"};
    String [] almuerzos3 ={"Sopa de legumbres","Enrollado de atun","Sopa de queso","Tallarin de pollo"};
    String [] almuerzos4 ={"Sancocho de carne","Guatita","Crema de zapallo","Estofado de pollo"};
    String [] almuerzos5 ={"Sopa de torreja","Guisado de carne","Caldo de bola","Seco de carne"};
    String [] almuerzos6 ={"Sopa de lentejas","Seco de pollo","Crema de legunmbres","Carne apanada con ensalada"};
    String [] almuerzos7 ={"Sopa de legumbres","Enrollado de atun","Sopa de queso","Tallarin de pollo"};
    String [] almuerzos8 ={"Sopa de torreja","Guisado de carne","Caldo de bola","Seco de carne"};
    String [] almuerzos9 ={"Sopa de pollo","Lomito saltado","Sopa de pescado","Cazuela"};
    String [] almuerzos10 ={"Sopa de torreja","Guisado de carne","Caldo de bola","Seco de carne"};
    String [] almuerzos11 ={"Sopa de legumbres","Enrollado de atun","Sopa de queso","Tallarin de pollo"};
    String [] almuerzos12 ={"Sopa de lentejas","Seco de pollo","Crema de legunmbres","Carne apanada con ensalada"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();

        String dia = bundle.getString("dia");
        String comedor =bundle.getString("comedor");
        textView8 = (TextView)  findViewById(R.id.textView8);
        textView8.setText(comedor);
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
//    public void consultapordescripcion(View v){
//        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
//        SQLiteDatabase bd = admin.getReadableDatabase();
//        Bundle bundle = getIntent().getExtras();
//        String dias = bundle.getString("dia");
//        String comedors =bundle.getString("comedor");
//        Cursor fila = bd.rawQuery(
//                "select descripcion from articulos where dia like '" + dias +"'", null);
//        if (fila.moveToFirst()) {
//            textView.setText(fila.getString(0));
//            textView2.setText(fila.getString(1));
//        } else
//            Toast.makeText(this, "No existe un artículo con dicha descripción",
//                    Toast.LENGTH_SHORT).show();
//        bd.close();
//    }
}
