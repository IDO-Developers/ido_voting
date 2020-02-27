package com.emman.votacionesido2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    ImageView fotoPlanilla;
    TextView nombrePlanilla;
    TextView detallePlanilla;
    TextView votosPlanilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        fotoPlanilla = (ImageView) findViewById(R.id.imagenPlanilla);
        nombrePlanilla = (TextView) findViewById(R.id.nombreAlumno);
        detallePlanilla = (TextView) findViewById(R.id.detallePlanilla);
        votosPlanilla = (TextView) findViewById(R.id.numeroVotos);

        Datos objeto = (Datos) getIntent().getExtras().getSerializable("objeto");
        fotoPlanilla.setImageResource(objeto.getImagenPlanilla());
        nombrePlanilla.setText(objeto.getTitulo());
        detallePlanilla.setText(objeto.getDetalle());
        votosPlanilla.setText(objeto.getVotos());


    }
}
