package exercicios;
/*
Gere e imprima uma matriz M4x4 com valores aleatórios entre 0-9
* */

import java.util.Random;

public class Ex3_array_multidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        //array com 4 linha e 4 colunas
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz:  ");
        for (int[] linha : M) {
            for (int elementoDaColuna: linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}