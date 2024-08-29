package edu.misena.relacionClases.model;

public class Client {
    private String nombre;
    private String nif; // Número de Identificación Fiscal
public Client (String nombre, String nif) {
    this.nombre=nombre;
    this.nif=nif;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getnif(){
    return nif;
    }
    public void setnif (String nif) {
    this.nif = nif;
    }
}
