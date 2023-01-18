package exercicios;

/*
Faça um exercicio que leia 5 numeros e informe
o maior numero e a média desses numeros
* */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int soma = 0;
        int maior = 0;


        // O programa entra no bloco 'do' e se repete enquando a condição (while) não for atendida
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;


            //coloca o maior numero digitado dentro da variável 'maior'.
            if(numero > maior) maior = numero;

            count++;
        } while (count < 5);

        System.out.println("A média é de: " + (soma / 5));
        System.out.println("O maior numero digitado foi: " + maior);
    }
}
