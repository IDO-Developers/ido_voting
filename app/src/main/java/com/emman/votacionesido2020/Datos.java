package com.emman.votacionesido2020;

import java.io.Serializable;

public class Datos implements Serializable {
    private int id;
    private String titulo;
    private String detalle;
    private String planilla;
    private int imagenPlanilla;
    private int votos;

    public Datos(int id, String titulo, String detalle, String planilla, int imagenPlanilla, int votos) {
        this.id = id;
        this.titulo = titulo;
        this.detalle = detalle;
        this.planilla = planilla;
        this.imagenPlanilla = imagenPlanilla;
        this.votos = votos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getPlanilla() {
        return planilla;
    }

    public void setPlanilla(String planilla) {
        this.planilla = planilla;
    }

    public int getImagenPlanilla() {
        return imagenPlanilla;
    }

    public void setImagenPlanilla(int imagenPlanilla) {
        this.imagenPlanilla = imagenPlanilla;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}
