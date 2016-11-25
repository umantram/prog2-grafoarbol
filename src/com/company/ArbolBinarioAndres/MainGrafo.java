package com.company.ArbolBinarioAndres;

/**
 * Created by umantram on 25/11/16.
 */
public class MainGrafo {

    public static void main(String[] args) {


        NodoGrafo nodo1 = new NodoGrafo(1);
        NodoGrafo nodo2 = new NodoGrafo(2);
        NodoGrafo nodo3 = new NodoGrafo(3);
        NodoGrafo nodo4 = new NodoGrafo(4);
        NodoGrafo nodo5 = new NodoGrafo(5);
        NodoGrafo nodo6 = new NodoGrafo(6);
        NodoGrafo nodo7 = new NodoGrafo(7);
        NodoGrafo nodo8 = new NodoGrafo(8);
        NodoGrafo nodo9 = new NodoGrafo(9);

        Grafo gr = new Grafo(nodo1);

        gr.Agregar(nodo1);
        gr.Agregar(nodo2);
        gr.Agregar(nodo3);
        gr.Agregar(nodo4);
        gr.Agregar(nodo5);
        gr.Agregar(nodo6);
        gr.Agregar(nodo7);
        gr.Agregar(nodo8);
        gr.Agregar(nodo9);

        gr.Vecinos(nodo1, nodo2);
        gr.Vecinos(nodo1, nodo8);

        gr.Vecinos(nodo2, nodo3);
        gr.Vecinos(nodo2, nodo8);

        gr.Vecinos(nodo8, nodo9);
        gr.Vecinos(nodo8, nodo7);

        gr.Vecinos(nodo9, nodo3);
        gr.Vecinos(nodo9, nodo7);

        gr.Vecinos(nodo3,nodo4);
        gr.Vecinos(nodo3, nodo6);

        gr.Vecinos(nodo7,nodo6);

        gr.Vecinos(nodo4, nodo6);
        gr.Vecinos(nodo4, nodo5);

        gr.Vecinos(nodo6, nodo5);

        gr.asisDFS(nodo1);

        System.out.println("----------------------");

        int[][] matriz = new int[][]{

                new int[]{1,1,1},
                new int[]{1,0,1},
                new int[]{1,1,2}

        };

        Matriz mat = new Matriz(matriz);

        mat.DFS(0,0,"comienzo");

    }
}
