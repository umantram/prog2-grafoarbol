package com.company.Arboles;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by umantram on 22/11/16.
 */
public class Arbol2 {

    Nodo2 raiz;

    public Arbol2(Nodo2 raiz) {
        this.raiz = raiz;
    }

    public Nodo2 getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo2 raiz) {
        this.raiz = raiz;
    }

    public void PreOrden(Nodo2 nodo){

        if (nodo == null){

            return;

        }

            System.out.println(nodo.getValor());
            PreOrden(nodo.getHojaIzquierda());
            PreOrden(nodo.getHojaDerecha());

    }

    public void InOrden(Nodo2 nodo){

        if (nodo == null){

            return;

        }

        InOrden(nodo.getHojaIzquierda());
        System.out.println(nodo.getValor());
        InOrden(nodo.getHojaDerecha());

    }

    public void PostOrden(Nodo2 nodo){

        if (nodo == null){

            return;

        }

        PostOrden(nodo.getHojaIzquierda());
        PostOrden(nodo.getHojaDerecha());
        System.out.println(nodo.getValor());


    }

    public void BFS(Nodo2 nodo){

        Queue<Nodo2> cola = new LinkedList<Nodo2>();

        //Nodo2 nodoaux;

        //if(nodo != null){

            cola.add(nodo);

            while(!cola.isEmpty()){

                //nodoaux = cola.peek();

                if(cola.peek().getHojaIzquierda() != null){

                    cola.add(cola.peek().getHojaIzquierda());

                }
                if(cola.peek().getHojaDerecha() != null){

                    cola.add(cola.peek().getHojaDerecha());
                }

                System.out.println(cola.poll());

            }

        //}
    }

    @Override
    public String toString() {
        return "Arbol2{" +
                "raiz=" + raiz +
                '}';
    }

}

