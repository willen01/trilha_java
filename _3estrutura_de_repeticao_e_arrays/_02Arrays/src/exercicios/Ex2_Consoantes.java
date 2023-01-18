package exercicios;
/*
Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
imprima as consoantes
* */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        //entrada de dados via teclado
        Scanner scan = new Scanner(System.in);

        //array com 6 posições
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            //possibilidade para inserção de vogais
            //compara 'a' com letra, retornando um booleano
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))
            ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

//        forEach
//        joga os elementos do array consoantes para a variável consoante
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) //não exibe resultados null que são vogais.
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes " + quantidadeConsoantes);
    }
}
