package exercicios;

import java.util.Scanner;

/*
Faça um programa que leia um conjunto de dois valores,
O primeiro representando o nome do aluno e o segundo representando sua idade
(pare o programa inserindo o valor 0 no campo nome)
* */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //recebe valores de entrada do teclado.

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
}
