package com.progra2.tarea2.tarea_01_progra_3;

/**
 *
 * @author ASUS
 */
public class Matrices {

    public static void main(String[] args) {
        
        int[][] a = {{3, 2, 3}, {5, 9, 8}};
        int[][] b = {{4, 7}, {9, 3}, {8, 1}};

        int fa = a.length;
        int ca = a[0].length;
        int fb = b.length;
        int cb = b[0].length;
        int[][] mR = new int[fa][cb];
        if (ca == fb) {

            for (int i = 0; i < fa; i++) {
                for (int j = 0; j < cb; j++) {
                    for (int k = 0; k < ca; k++) {
                        mR[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            for (int[] fila : mR) {
                for (int columna : fila) {
                    System.out.print(columna + " ");
                }
                System.out.println("");
            }
        }
    }
}
