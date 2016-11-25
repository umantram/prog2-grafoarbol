package com.company.ArbolBinarioAndres;

/**
 * Created by umantram on 25/11/16.
 */
public class NodoDirect {

    String nombre;

    NodoDirect padre;
    NodoDirect hojaIzq;
    NodoDirect HojaDer;

    public NodoDirect(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoDirect getPadre() {
        return padre;
    }

    public void setPadre(NodoDirect padre) {
        this.padre = padre;
    }

    public NodoDirect getHojaIzq() {
        return hojaIzq;
    }

    public void setHojaIzq(NodoDirect hojaIzq) {
        this.hojaIzq = hojaIzq;
    }

    public NodoDirect getHojaDer() {
        return HojaDer;
    }

    public void setHojaDer(NodoDirect hojaDer) {
        HojaDer = hojaDer;
    }

    @Override
    public String toString() {
        return "NodoDirect{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
