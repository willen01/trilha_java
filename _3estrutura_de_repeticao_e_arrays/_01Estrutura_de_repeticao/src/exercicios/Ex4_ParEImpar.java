package exercicios;

/*
Faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares
* */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImpares = 0;
        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        //Laço para para a quantidade de numeros a receber
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            //verificar se um número é impar ou par
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade impares: " + quantImpares);
    }
}
