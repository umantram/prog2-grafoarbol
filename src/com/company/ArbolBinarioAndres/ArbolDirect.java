package com.company.ArbolBinarioAndres;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by umantram on 25/11/16.
 */
public class ArbolDirect {

    NodoDirect raiz;

    public ArbolDirect(NodoDirect raiz) {
        this.raiz = raiz;
    }

    public NodoDirect getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDirect raiz) {
        this.raiz = raiz;
    }

    public void BFS(NodoDirect raiz){

        Queue<NodoDirect> lista = new LinkedList<>();

        lista.add(raiz);

        while (!lista.isEmpty()){

            if (lista.peek().getHojaIzq() != null){

                lista.add(lista.peek().getHojaIzq());
            }

            if (lista.peek().getHojaDer() != null){

                lista.add(lista.peek().getHojaDer());
            }

            System.out.println(lista.poll().getNombre());

        }
    }

    public void DFSPreOrden (NodoDirect nodo){

        if (nodo == null){

            return;
        }

        System.out.println(nodo.getNombre());
        DFSPreOrden(nodo.getHojaIzq());
        DFSPreOrden(nodo.getHojaDer());

    }

    public void DFSInOrden (NodoDirect nodo){

        if (nodo == null){

            return;
        }

        DFSPreOrden(nodo.getHojaIzq());
        System.out.println(nodo);
        DFSPreOrden(nodo.getHojaDer());

    }

    public void DFSPostOrden (NodoDirect nodo){

        if (nodo == null){

            return;
        }

        DFSPreOrden(nodo.getHojaIzq());
        DFSPreOrden(nodo.getHojaDer());
        System.out.println(nodo);

    }

}
