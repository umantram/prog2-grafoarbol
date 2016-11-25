package com.company.ArbolBinarioAndres;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by umantram on 25/11/16.
 */
public class Grafo {

    NodoGrafo raiz;

    LinkedList<NodoGrafo> lista = new LinkedList<>();

    public Grafo(NodoGrafo raiz) {
        this.raiz = raiz;
    }

    public LinkedList<NodoGrafo> getLista() {
        return lista;
    }

    public void Agregar (NodoGrafo nodo){

        lista.add(nodo);
    }

    public void Vecinos(NodoGrafo origen, NodoGrafo destino){

        lista.get(lista.indexOf(origen)).getListanodos().add(destino);

    }

    public void asisDFS(NodoGrafo raiz){

        Set<NodoGrafo> lista = new HashSet<>();
        DFS(raiz, lista);

    }
    public void DFS(NodoGrafo nodo, Set<NodoGrafo> listanodos){

        System.out.println(nodo);

        listanodos.add(nodo);

        for(NodoGrafo a : nodo.getListanodos()){

            if (!listanodos.contains(a)){

                DFS(a, listanodos);
            }
        }
    }

}
