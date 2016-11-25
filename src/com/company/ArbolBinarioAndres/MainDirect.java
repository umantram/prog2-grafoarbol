package com.company.ArbolBinarioAndres;

/**
 * Created by umantram on 25/11/16.
 */
public class MainDirect {

    public static void main(String[] args) {

        NodoDirect nodo0 = new NodoDirect("dicoC");
        NodoDirect nodo1 = new NodoDirect("apahce/ant");
        NodoDirect nodo3 = new NodoDirect("etc");
        NodoDirect nodo4 = new NodoDirect("check");
        NodoDirect nodo5 = new NodoDirect("lib");
        NodoDirect nodo6 = new NodoDirect("manual");
        NodoDirect nodo7 = new NodoDirect("apache/maven");

        ArbolDirect arbol = new ArbolDirect(nodo0);

        nodo0.setHojaIzq(nodo1);
        nodo0.setHojaDer(nodo7);
        nodo1.setHojaIzq(nodo3);
        nodo1.setHojaDer(nodo5);
        nodo3.setHojaIzq(nodo4);
        nodo5.setHojaIzq(nodo6);

        arbol.BFS(nodo0);

        System.out.println("-------------");

        arbol.DFSPreOrden(nodo0);
        System.out.println("-------------");

        arbol.DFSInOrden(nodo0);

        System.out.println("-------------");

        arbol.DFSPostOrden(nodo0);

    }
}
