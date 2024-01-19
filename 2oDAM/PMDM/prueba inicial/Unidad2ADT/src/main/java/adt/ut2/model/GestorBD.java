package adt.ut2.model;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GestorBD {
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";
    private static final String URL_BD = "jdbc:mysql://127.0.0.1:3306/bicicletas";
    static List<Fabricante> fabricantes = new ArrayList<>();

    private GestorBD instancia;

    GestorBD() {


    }

    public static GestorBD getInstancia() {
        GestorBD instancia = null;
        if (instancia == null) {
            instancia = new GestorBD();
        }
        return instancia;

    }

    public void seleccionarFabricantes() {
        String sqlSelectAllPersons = "SELECT * FROM fabricantes";
        String connectionUrl = URL_BD;
        try (Connection conn =
                     DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
             PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                Fabricante fabricante = new Fabricante(codigo, nombre);
                fabricantes.add(fabricante);
            }
        } catch (SQLException e) {
            // handle the exception
        }
        System.out.println(fabricantes);
    }

    public void seleccionarArticulos() throws Exception {
        List<Articulo> articulos = new ArrayList<>();
        String sqlSelectAllPersons = "SELECT * FROM articulos";
        String connectionUrl = URL_BD;
        Connection conn = DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int codigo = rs.getInt("codigo");
            String nombre = rs.getString("nombre");
            int precio = rs.getInt("precio");
            int fabricante = rs.getInt("fabricante");


            Articulo articulo = new Articulo(codigo, nombre, precio, fabricante);
            articulos.add(articulo);
        }


        System.out.println(articulos);


    }

    public Collection<Articulo> getArticulosConFabricantes() throws SQLException {
        List<Articulo> articulos = new ArrayList<>();
        String sqlSelectAllPersons = "select *\n" +
                "from bicicletas.articulos a JOIN bicicletas.fabricantes f on f.codigo = a.fabricante";
        String connectionUrl = URL_BD;
        Connection conn = DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
        PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int codigo = rs.getInt("a.codigo");
            String nombre = rs.getString("a.nombre");
            int precio = rs.getInt("precio");
            int fabricante = rs.getInt("a.fabricante");
            int fabricanteObjeto = rs.getInt("f.codigo");
            String fabricanteNombre = rs.getString("f.nombre");

            //Hay que pasarle el objeto fabricante directamente a articulo no hacer con atributos de fabricante

            Articulo articulo = new Articulo(codigo, nombre, precio, fabricante, fabricanteObjeto, fabricanteNombre);
            articulos.add(articulo);
        }


        return articulos;


    }


    public List<Articulo> buscarArticulosConPrecioMayorQue(int precio) {
        List<Articulo> articulos = new ArrayList<>();
        String consultaSql = """
                select * from articulos where precio >(select avg(precio) from articulos);
                """;
        try (
                Connection conn = DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
                Statement ps = conn.createStatement();
                ResultSet rs = ps.executeQuery(consultaSql)) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int precioArticulo = rs.getInt("precio");
                articulos.add(new Articulo(codigo, nombre, precioArticulo));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articulos;
    }

    public boolean insertarDatos(Articulo articulo) {
        int resultado = 0;
        String consultaSql = """
                INSERT INTO articulos (codigo, nombre, precio)
                VALUES (?,?,?)
                """;
        try (
                Connection conn = DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
                PreparedStatement ps = conn.prepareStatement(consultaSql);
        ) {
            ps.setInt(1, articulo.getCodigo());
            ps.setString(2, articulo.getNombre());
            ps.setDouble(3, articulo.getPrecio());
            resultado = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return resultado > 0;
    }


    public List<Fabricante> obtenerFabricantesOrdenadosNombre(boolean ascendente) {
        List<Articulo> articulos = new ArrayList<>();
        String consultaSql = """
                    select * from fabricantes order by nombre
                """;
        if(!ascendente){
            consultaSql +=" DESC;";
        }
        try (
                Connection conn = DriverManager.getConnection(URL_BD, USUARIO, CONTRASENA);
                Statement ps = conn.createStatement();
                ResultSet rs = ps.executeQuery(consultaSql)) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int precioArticulo = rs.getInt("precio");
                fabricantes.add(new Fabricante(codigo, nombre));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fabricantes;

    }
    public boolean insertarFabricante(Fabricante merida){

        List<Fabricante> fabricantes=new ArrayList<>();


        return false;
    }
    private int getMaxCodigo(){
        int codigo=0;



        return codigo;
    }

}






