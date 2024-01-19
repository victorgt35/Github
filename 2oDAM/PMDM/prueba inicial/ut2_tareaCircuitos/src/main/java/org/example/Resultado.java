package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Resultado {
    private String circuito;
    private String posicion;
    private int numero;
    private String piloto;
    private String equipo;

    public Resultado(String circuito, String posicion, int numero, String piloto, String equipo) {
        this.circuito = circuito;
        this.posicion = posicion;
        this.numero = numero;
        this.piloto = piloto;
        this.equipo = equipo;
    }

    public String getCircuito() {
        return circuito;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiloto() {
        return piloto;
    }

    public String getEquipo() {
        return equipo;
    }
}