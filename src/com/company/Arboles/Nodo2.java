package com.company.Arboles;

/**
 * Created by umantram on 22/11/16.
 */
public class Nodo2 {

    int valor;

    Nodo2 padre;
    Nodo2 hojaIzquierda;
    Nodo2 hojaDerecha;

    public Nodo2(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo2 getPadre() {
        return padre;
    }

    public void setPadre(Nodo2 padre) {
        this.padre = padre;
    }

    public Nodo2 getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo2 hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public Nodo2 getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo2 hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    @Override
    public String toString() {
        return "Nodo2{" +
                "valor=" + valor +
                '}';
    }
}
