package com.company.Arboles;

import java.util.Random;

/**
 * Created by umantram on 22/11/16.
 */
public class Laberinto {
       
        public char[][] laberinto;

        public char[] diccionario={'C',' '};

        public int n=5;

        public static void main(String... args){
            Laberinto lab=new Laberinto();
            lab.inicializar();
            imprimir (lab.getLaberinto());
            boolean hay=lab.hayCamino(lab.getLaberinto());
            imprimir (lab.getLaberinto());
            System.out.println(" Hay camino ?" +hay);
        }

        public void inicializar(){
            this.laberinto=new char[n][n];
            Random rnd=new Random();
            for(int i=0;i<n;++i){
                for(int j=0;j<n;j++){
                    laberinto[i][j]=diccionario[rnd.nextInt(diccionario.length)];
                }
            }
            laberinto[0][0] = 'C';
            laberinto[n-1][n-1] = 'C';
        }


        public static boolean hayCamino (char[][] laberinto) {
            int[] incrX = new int[] {1, 0, -1,  0};
            int[] incrY = new int[] {0, 1,  0, -1};

            boolean exito = buscar (laberinto.length-1, 0, 0, laberinto, incrX, incrY);

            return exito;
        }

        private static boolean buscar(int n_1, int x, int y, char[][] laberinto,int[] incrX, int[] incrY) {
            boolean exito = false;
            for (int k = 0; k < 4 && !exito; k++) {
                int coordX = x + incrX[k];
                int coordY = y + incrY[k];
                if (coordX >= 0 && coordX <= n_1 && coordY >= 0 && coordY <= n_1)
                    if (laberinto[coordX][coordY] == 'C') {
                        laberinto[coordX][coordY] = 'D';
                        if (coordX == n_1 && coordY == n_1)
                            exito = true;
                        else {
                            exito = buscar(n_1, coordX, coordY, laberinto, incrX,incrY);
                            if (!exito)
                                laberinto[coordX][coordY] = ' ';
                        }
                    }
            }
            return exito;
        }

        private static void imprimir (char[][] laberinto) {
            for (int i=0; i<laberinto.length; i++) {
                for (int j=0; j<laberinto.length; j++)
                    System.out.print ("["+laberinto[i][j]+"]");
                System.out.println();
            }
            System.out.println();
        }

    public char[][] getLaberinto() {
        return laberinto;
    }
}
