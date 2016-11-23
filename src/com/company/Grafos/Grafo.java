package com.company.Grafos;

import java.util.*;

/**
 * Created by francomoglia on 11/10/16.
 */
public class Grafo {

    //      ATRIBUTO DEL GRAFO
    private LinkedList<Nodo> nodeList = new LinkedList<Nodo>();

    //      METODO PARA AGREGAR NODOS
    public void agregarNodoGrafo (Nodo n){
        nodeList.add(n);
    }

    public LinkedList<Nodo> getNodeList() {
        return nodeList;
    }

    //      METODO QUE AGREGUE O DEFINA LOS VECINOS
    public void definirVecinos (Nodo origen, Nodo destino){
        this.nodeList.get(nodeList.indexOf(origen)).getVecinos().add(destino);
    }

    //      METODO DFS
    public void DFS(Nodo comienzo){
        Set<Nodo> nodosVisitados = new HashSet<Nodo>();
        System.out.println("Comenzamos por el nodo -----> " + comienzo );
        recorridoDFS(comienzo, nodosVisitados);
    }

    //      METODO RECURSIVO PARA REALIZAR EL RECORRIDO
    public void recorridoDFS(Nodo nodo, Set<Nodo> visitados){

        System.out.println("Visitado= " + nodo);
        visitados.add(nodo);

        for (Nodo aux : nodo.getVecinos()){
            if (!visitados.contains(aux)){
                recorridoDFS(aux, visitados);
            }
        }

    }

    public void BFS(Nodo start) {

        //CREA LA TABLA DEL SET PARA LOS VISITADOS
        Set<Nodo> visitedSet = new HashSet<Nodo>();

        //CREA UNA COLA PARA AGREGAR NODOS
        Queue<Nodo> nodeQueue = new LinkedList<Nodo>();


        /*  LLAMA AL METODO ADD, DE LA INTERFACE QUEUE
            EL CUAL RECIBE COMO PARAMETRO EL NODO START, ES DECIR,
            EL NODO DESDE EL CUAL SE COMIENZA LA COLA
        */
        nodeQueue.add(start);


        //BUCLE ---> SI LA COLA ESTA VACIA,     NO SE HACE NADA
        while(!nodeQueue.isEmpty()) {

            /*  AGREGA EL NODO AL SET DE VISITADOS
                EL METODO PEEK LO QUE HACE ES RECUPERAR EL VALOR DEL NODO SIN BORRARLO
                PARA DE ESE MODO AGREGARLO AL SET
            */
            visitedSet.add(nodeQueue.peek());

            /*  CREA UNA LinkedList DE NODOS DE ALGUN TIPO (GENERIC) Y A ESA
                LinkedList LO QUE LE AGREGA ES...
                LLAMA A LA FUNCION Peek DE LA LISTA DE NODOS, Y DE ESE NODO QUE
                SACA LLAMA AL GETTER DE SU AdjList LA CUAL ES, OTRA LinkedList DE NODOS
            */
            LinkedList<Nodo> adjListOfNode = nodeQueue.peek().getVecinos();



            //MUESTRA EL NODO VISITADO Y LUEGO LO ELIMINA DE LA COLA
            System.out.println("Visited: " + nodeQueue.poll());


            /*
                RECORRE TODA LA LinkedList DEL NODO, SI ALGUN NODO NO ESTA
                EN LA LISTA DE VISITADOS Y NO ESTA EN LA COLA, SE LO AGREGA A LA COLA
            */
            for (Nodo n : adjListOfNode) {
                if (!visitedSet.contains(n) && !nodeQueue.contains(n)) {
                    nodeQueue.add(n);
                }
            }
        }



    }

}
