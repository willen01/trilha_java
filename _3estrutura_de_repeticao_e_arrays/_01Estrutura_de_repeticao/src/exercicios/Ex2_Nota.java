package exercicios;
/*
 Faça um programa que peça uma nota entre 0 e 10.
 mostre uma mensagem caso o valor seja inválido
 e continue pedindo até que o usuário informe um valor válido
* */

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        //Só entra no while se a condição que contém nele for atendida
        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente");
            nota = scan.nextInt();
        }
    }
}
