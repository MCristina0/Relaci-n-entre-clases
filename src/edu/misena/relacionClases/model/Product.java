package edu.misena.relacionClases.model;

public class Product {
    private String codigo;
    private String nombre;
    private double precio;
    private static int CodigoFinal = 0;

    public Product(String codigo, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = generarCodigo();
    }

    private String generarCodigo() {
        CodigoFinal++;
        return "P" + String.format("%04d", CodigoFinal);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t" + precio;
    }
}
