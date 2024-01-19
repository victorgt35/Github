package org.example;

import java.util.ArrayList;
import java.util.List;

public class Piloto implements Comparable<Piloto> {
    private String nombre;
    private int puntos;
    private String equipo;

    public Piloto(String nombre, String equipo) {
        this.nombre = nombre;
        this.puntos = 0;
        this.equipo = equipo;
    }

    public Piloto(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public String getEquipo() {
        return equipo;
    }

    @Override
    public int compareTo(Piloto o) {
        return Integer.compare(o.puntos, this.puntos);
    }
}