package adt.ut2.model;

import adt.ut2.model.Fabricante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorBD gbd = new GestorBD();

        gbd.getInstancia().insertarFabricante(new Fabricante());

        List<Fabricante> fabricantes = List.of(
                new Fabricante("Conor"),
                new Fabricante("BH"),
                new Fabricante("Orbea"),
                new Fabricante("Canyon"),
                new Fabricante("Cannondale")
        );
        for(Fabricante fabricante:fabricantes){
            GestorBD.getInstancia().insertarFabricante(fabricante);
        }



        /*gbd.seleccionarFabricantes();
        try {
            gbd.seleccionarArticulos();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(gbd.getArticulosConFabricantes());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(GestorBD.getInstancia().buscarArticulosConPrecioMayorQue(5000));
        //GestorBD.getInstancia().insertarDatos(new Articulo(400,"nombre",3000));
        GestorBD.getInstancia().obtenerFabricantesOrdenadosNombre(false);
    */
    }

}
