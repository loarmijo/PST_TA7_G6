package com.example.amst6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inicio(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        int id1 =1;
        int id2 =2;
        int id3 =3;


        String nombre1 = "Fresh Food";

        String descripcion = "Seco de pollo, sopa de legumbres y jugo de naranja";
        String dia = "lunes";

        String descripcion2 = "Seco de carne, sopa de legumbres y jugo de naranja";
        String dia2 = "martes";

        String descripcion3 = "Seco de chivo xd, sopa de legumbres y jugo de naranja";
        String dia3 = "miercoles";

        bd.execSQL("insert into articulos (idComedor,nombre,descripcion,dia) values ("+id1+",'"+nombre1+"','"+descripcion+"','"+dia+"')");
        bd.execSQL("insert into articulos (idComedor,nombre,descripcion,dia) values ("+id2+",'"+nombre1+"','"+descripcion2+"','"+dia2+"')");
        bd.execSQL("insert into articulos (idComedor,nombre,descripcion,dia) values ("+id3+",'"+nombre1+"','"+descripcion3+"','"+dia3+"')");



        bd.close();
        Intent i = new Intent(this, Main2Activity.class );

        startActivity(i);
    }

}
