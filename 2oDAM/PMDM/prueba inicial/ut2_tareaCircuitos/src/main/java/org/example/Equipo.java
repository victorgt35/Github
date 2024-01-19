package org.example;

import java.util.*;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private int puntos;

    public Equipo(String nombre) {
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

    @Override
    public int compareTo(Equipo otroEquipo) {
        return Integer.compare(otroEquipo.puntos, this.puntos);
    }
}
