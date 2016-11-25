package com.company.ArbolBinarioAndres;

import java.util.LinkedList;

/**
 * Created by umantram on 25/11/16.
 */
public class NodoGrafo {

    int valor;
    LinkedList<NodoGrafo> listanodos = new LinkedList<>();

    public NodoGrafo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LinkedList<NodoGrafo> getListanodos() {
        return listanodos;
    }

    public void setListanodos(LinkedList<NodoGrafo> listanodos) {
        this.listanodos = listanodos;
    }

    @Override
    public String toString() {
        return "NodoGrafo{" +
                "valor=" + valor +
                '}';
    }
}
