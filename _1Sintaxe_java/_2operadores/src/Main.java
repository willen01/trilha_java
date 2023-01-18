public class Main {
    public static void main(String[] args) {
        //tipos de operadores:
            //aritiméticos, unários, relacionais, lógicos, ternário

        //aritiméticos: + - * /
        double soma = 5.72 + 15.18;
        int modulo = 18 % 5; // 3

        //unários + ++ - -- !
        int numero = 5;
        System.out.print(- numero); // -5
        System.out.print(numero); // 5: O operador unário não altera o valor da variárel numero.

        numero++; //6

        //as regras de incremento são as mesmas para decremento
        System.out.println(++ numero); // incrementa o numero depois exibe o numero original
        System.out.println(numero ++); //exibe o numero original depois realiza o incremento

        boolean variavel = true;
        System.out.println(!variavel); //false

        System.out.println(modulo);
        System.out.println("Hello world!");

        //ternário <expressão condicional> ? <condição verdadeira> : <condição falsa>

        int a, b;
        a = 5;
        b = 3;
        String result = a == b ? "verdadeiro" : "falso";

        //relacionais == != > < >= <=

        //lógicos && - E, || - OU
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println(result);
    }
}