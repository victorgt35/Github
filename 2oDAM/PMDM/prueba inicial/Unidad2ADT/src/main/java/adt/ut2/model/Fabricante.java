package adt.ut2.model;

public class Fabricante {
    private int codigo;
    private String nombre;

    public Fabricante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Fabricante(String nombre){
        this.nombre = nombre;
    }

    public Fabricante() {

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fabricante{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
