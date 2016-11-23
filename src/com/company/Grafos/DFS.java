package com.company.Grafos;

/**
 * Created by francomoglia on 11/8/16.
 */
public class DFS {

    public static void main(String[] args) {

        Grafo g = new Grafo(); // the graph will have 4 nodes

        //Nodo node&1 = new Nodo("A");

/*        Nodo node0 = new Nodo("A");
        Nodo node1 = new Nodo("B");
        Nodo node2 = new Nodo("C");
        Nodo node3 = new Nodo("D");
        Nodo node4 = new Nodo("E");
        Nodo node5 = new Nodo("F");
        Nodo node6 = new Nodo("G");
        Nodo node7 = new Nodo("H");

        g.agregarNodoGrafo(node0);
        g.agregarNodoGrafo(node1);
        g.agregarNodoGrafo(node2);
        g.agregarNodoGrafo(node3);
        g.agregarNodoGrafo(node4);
        g.agregarNodoGrafo(node5);
        g.agregarNodoGrafo(node6);
        g.agregarNodoGrafo(node7);

        g.definirVecinos(node0, node1);
        g.definirVecinos(node0, node2);
        g.definirVecinos(node0, node3);
        g.definirVecinos(node1, node4);
        g.definirVecinos(node1, node5);
        g.definirVecinos(node2, node4);
        g.definirVecinos(node2, node5);
        g.definirVecinos(node3, node5);
        g.definirVecinos(node4, node6);
        g.definirVecinos(node4, node7);
        g.definirVecinos(node5, node6);
        g.definirVecinos(node5, node7);

        g.DFS(node0);
        g.BFS(node0);

        int [][] matriz = new int[8][8];

        //Matriz de Adyasencia

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (g.getNodeList().get(i).getVecinos().contains(g.getNodeList().get(j)) )
                    matriz[i][j] = 1;
                else matriz[i][j] = 0;

            }
        }

*/

        //g.getNodeList().get(i).getVecinos().add(g.getNodeList().get(j));

        Nodo node0 = new Nodo(1);
        Nodo node1 = new Nodo(2);
        Nodo node2 = new Nodo(3);
        Nodo node3 = new Nodo(4);
        Nodo node4 = new Nodo(5);

        g.agregarNodoGrafo(node0);
        g.agregarNodoGrafo(node1);
        g.agregarNodoGrafo(node2);
        g.agregarNodoGrafo(node3);
        g.agregarNodoGrafo(node4);

        //g.definirVecinos();
    }

}
