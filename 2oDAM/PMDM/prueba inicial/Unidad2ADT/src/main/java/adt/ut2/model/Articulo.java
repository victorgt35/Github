package adt.ut2.model;

public class Articulo {
    private int codigo;
    private String nombre;
    private int precio;
    private int fabricante;

    Fabricante fabricanteObjeto = new Fabricante();
    int codigoFabricante = fabricanteObjeto.getCodigo();
    String fabricanteNombre = fabricanteObjeto.getNombre();
    public Articulo(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }

    public Articulo(int codigo, String nombre, int precio, int fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public Articulo(int codigo, String nombre, int precio, int fabricante, int codigoFabricante,String fabricanteNombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
        this.codigoFabricante = codigoFabricante;
        this.fabricanteNombre=fabricanteNombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Articulo{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", fabricante=").append(fabricante);
        sb.append('}');
        return sb.toString();
    }
}
