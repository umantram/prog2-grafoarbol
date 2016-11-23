package com.company.Arboles;

/**
 * Created by umantram on 22/11/16.
 */
public class Main3 {

    public static void main(String[] args) {

        int[][] mat = new int[][] {

            new int[]{1, 1, 1},
            new int[]{1, 0, 1},
            new int[]{1, 1, 2},

        };

        Matriz matriz = new Matriz(mat);

        matriz.DFS(0,0, "comienzo");

    }
}
