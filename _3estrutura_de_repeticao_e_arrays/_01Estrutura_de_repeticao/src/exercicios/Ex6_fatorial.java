package exercicios;

import java.util.Scanner;

//quando precisar de contador ==> for
//quando precisar de laços infinitos ==> while
//executar o bloco pelo menos uma vez antes de executar o loop ==> do while

/*
Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuário.
* */
public class Ex6_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--){
            multiplicacao *= i; //ele mesmo vezes o i.
        }

        System.out.println(multiplicacao);
    }
}
