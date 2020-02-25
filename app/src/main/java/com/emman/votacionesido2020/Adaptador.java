package com.emman.votacionesido2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> listaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        this.listaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return listaObjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflater = LayoutInflater.from(contexto);
        vista = inflater.inflate(R.layout.activity_item_list_view, null);

        ImageView imagenPlanilla = (ImageView) vista.findViewById(R.id.imagenPlanilla);
        TextView nombrePlanilla = (TextView) vista.findViewById(R.id.nombrePlanilla);

        nombrePlanilla.setText(listaObjetos.get(position).getPlanilla());
        imagenPlanilla.setImageResource(listaObjetos.get(position).getImagenPlanilla());

        return vista;

    }
}
