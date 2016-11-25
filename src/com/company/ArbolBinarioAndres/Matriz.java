package com.company.ArbolBinarioAndres;

import java.util.LinkedList;

/**
 * Created by umantram on 22/11/16.
 */
public class Matriz {

    int [][] matriz;
    LinkedList lista = new LinkedList();

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void DFS(int i, int j, String mov) {

        //if (this.matriz[i][j] != 2) {

            if (this.matriz[i][j] != 0 || this.matriz[i][j] == 2) {

                System.out.println(mov);

                if (this.matriz[i][j] == 2){

                    System.exit(0);
                }

                if (j + 1 < matriz[0].length) {

                    DFS(i, j + 1, "derecha");
                }

                if (i + 1 < matriz.length) {

                    DFS(i + 1, j, "abajo");
                }

                //System.out.println(lista.poll());

            }

    }

}
