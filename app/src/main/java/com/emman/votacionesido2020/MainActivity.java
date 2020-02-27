package com.emman.votacionesido2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button detalle = (Button) findViewById(R.id.btnVer);

    ListView lista;
    ArrayList<Datos> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listaObjetosItems);
        datos = new ArrayList<Datos>();

        datos.add(new Datos(1,"Juan Orlando",
                "Sujeto Ladron y narcotraficante",
                "ROBANDO Y ROBANDO",
                R.drawable.orlando, -10000));
        datos.add(new Datos(1,"Pastor Zuniga",
                "Sujeto Caballo y mal hablado",
                "TOPELA PRIMO",
                R.drawable.pastor, 1));
        datos.add(new Datos(1,"Salvita Nasralla",
                "Individuo medio joto que sabe de futbol",
                "Separate mierda! GOOOOOOL",
                R.drawable.salvador, -10000));
        datos.add(new Datos(1,"Perrito",
                "Wuauff",
                "Rrrrrrr Wuauff Wuauff",
                R.drawable.perro, -10000));

        Adaptador adaptador = new Adaptador(getApplicationContext(),datos);
        lista.setAdapter(adaptador);

        detalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, DetalleActivity.class);
                startActivity(intent2);
            }
        });
    }


}
