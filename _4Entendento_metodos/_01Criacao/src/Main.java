import exercicios.OperacoesMatematicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo numero");
         double num2 = scan.nextDouble();


         OperacoesMatematicas calcular = new OperacoesMatematicas();

         double result = calcular.soma(num1, num2);
        System.out.println("A soma dos valores inseridos é igual à: " + result);
    }
}