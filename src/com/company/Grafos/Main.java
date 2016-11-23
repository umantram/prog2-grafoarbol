package com.company.Grafos;

/**
 * Created by umantram on 11/11/16.
 */
public class Main {

    public static void main(String[] args ){

        Grafo gr = new Grafo();

        Nodo nodoA = new Nodo("A") ;
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoF = new Nodo("F");
        Nodo nodoG = new Nodo("G");
        Nodo nodoH = new Nodo("H");
        Nodo nodoI = new Nodo("I");
        Nodo nodoJ = new Nodo("J");

        gr.agregarNodoGrafo(nodoA);
        gr.agregarNodoGrafo(nodoB);
        gr.agregarNodoGrafo(nodoC);
        gr.agregarNodoGrafo(nodoD);
        gr.agregarNodoGrafo(nodoE);
        gr.agregarNodoGrafo(nodoF);
        gr.agregarNodoGrafo(nodoG);
        gr.agregarNodoGrafo(nodoH);
        gr.agregarNodoGrafo(nodoI);
        gr.agregarNodoGrafo(nodoJ);

        gr.definirVecinos(nodoA, nodoB);
        gr.definirVecinos(nodoA, nodoC);
        gr.definirVecinos(nodoA, nodoD);
        gr.definirVecinos(nodoB, nodoE);
        gr.definirVecinos(nodoB, nodoF);
        gr.definirVecinos(nodoB, nodoG);
        gr.definirVecinos(nodoC, nodoE);
        gr.definirVecinos(nodoC, nodoF);
        gr.definirVecinos(nodoC, nodoG);
        gr.definirVecinos(nodoD, nodoE);
        gr.definirVecinos(nodoD, nodoF);
        gr.definirVecinos(nodoD, nodoG);
        gr.definirVecinos(nodoE, nodoH);
        gr.definirVecinos(nodoE, nodoI);
        gr.definirVecinos(nodoF, nodoH);
        gr.definirVecinos(nodoF, nodoI);
        gr.definirVecinos(nodoG, nodoH);
        gr.definirVecinos(nodoG, nodoI);
        gr.definirVecinos(nodoH, nodoJ);
        gr.definirVecinos(nodoI, nodoJ);


        gr.DFS(nodoA);

        System.out.println("---");

        gr.BFS(nodoA);


        int[][] matriz = new int[10][10];

        for (int i = 0; i < gr.getNodeList().size(); i++) {
            for (int j = 0; j < gr.getNodeList().size(); j++) {

                //System.out.println(gr.getNodeList().get(i).getVecinos());

                if(gr.getNodeList().get(i).getVecinos().contains(gr.getNodeList().get(j))){

                    matriz[i][j] = 1;

                }else{
                    matriz[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < gr.getNodeList().size(); i++) {

            for (int j = 0; j < gr.getNodeList().size(); j++) {

                System.out.print(matriz[i][j]);

            }

            System.out.println();

        }
    }


}
