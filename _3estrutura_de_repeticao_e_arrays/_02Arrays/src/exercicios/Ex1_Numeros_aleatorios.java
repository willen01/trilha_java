package exercicios;

import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100), armazene-os um vetor.
ao final mostre os numeros e seus sucessores
* */
public class Ex1_Numeros_aleatorios {
    public static void main(String[] args) {
        //gera numeros aleatórios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); // gera numros aleatórios até 100
            numerosAleatorios[i] = numero;
        }

        //forEach
        System.out.print("Numeros aleatórios: "); //numeros aleatórios
        for (int numero :
                numerosAleatorios) {
            System.out.print(numero + " ");
        }

        //sucessor de cada elemento
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero :
                numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        //sucessor de cada elemento
        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero :
                numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
