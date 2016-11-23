package com.company.Arboles;

/**
 * Created by umantram on 22/11/16.
 */
public class Main2 {

    public static void main(String[] args) {

        Nodo2 nodo1 = new Nodo2(4);
        Nodo2 nodo2 = new Nodo2(2);
        Nodo2 nodo3 = new Nodo2(1);
        Nodo2 nodo4 = new Nodo2(3);
        Nodo2 nodo5 = new Nodo2(5);
        Nodo2 nodo6 = new Nodo2(6);

        Arbol2 arbol = new Arbol2(nodo1);

        nodo1.setHojaIzquierda(nodo2);
        nodo2.setHojaIzquierda(nodo3);
        nodo2.setHojaDerecha(nodo4);
        nodo1.setHojaDerecha(nodo5);
        nodo5.setHojaDerecha(nodo6);

        arbol.PreOrden(nodo1);
        System.out.println("----------");
        arbol.InOrden(nodo1);
        System.out.println("----------");
        arbol.PostOrden(nodo1);

        arbol.BFS(nodo1);

    }

}
