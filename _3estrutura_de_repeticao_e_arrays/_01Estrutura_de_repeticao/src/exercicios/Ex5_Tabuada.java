package exercicios;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar um tabuada de qualquer numero inteiro entre 1 e 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo

Tabuada de 5:
5 X 1 = 5
5 X 1 = 10
...

* */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
