import exercicios.Calculadora;
import exercicios.Emprestimo;
import exercicios.Mensagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio de Calculadora");
        Calculadora.soma(2,3);
        Calculadora.subtracao(10,2);
        Calculadora.divisao(45,5);
        Calculadora.multiplicacao(5,10);

        System.out.println("---------------------");

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);


        System.out.println("---------------------");

        System.out.println("Exercicio emprestimo");

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}