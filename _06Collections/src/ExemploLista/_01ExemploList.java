package ExemploLista;

import java.util.*;

public class _01ExemploList {
    public static void main(String[] args) {
//        List notas = new ArrayList(); Antes do java 8
//        List<Double> notas = new ArrayList<>(); <> --> generics new ArrayList<> --> Diamont Operator
//        ArrayList<Double> notas = new ArrayList<>(); voltada para a implementação e não para a interface - forma não recomendada
//        List notas = new ArrayList<>(Arrays.asList(7d, 8.5m 5d, 7d)) Passando os elementos da lista
//        List<Double> notas = Arrays.asList(7d, 8.5m 5d, 7d) Forma sem o new. Nessa forma não é possivel adcionar ou remover elementos da lista
//        List<Double> notas = List.of(7d, 8.5m 5d, 7d); Lista imutável. Não cabe o uso dos métodos add e remove


        System.out.println("Crie uma lista e adcione as sete notas");

        List<Double> notas = new ArrayList<Double>();
        notas.add(3.0);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(5.0);
        notas.add(9.9);
        notas.add(7.5);
        notas.add(6.7);

//        adiciona o elemento 8.0 no indice 4 do array
        notas.add(4, 8.0);
//        Podemos passar notas.toString() que gera o mesmo resultado
        System.out.println(notas);
        System.out.println("A posição da nota 6.7 é : " + notas.indexOf(6.7));

//        substitui um elemento com base no indice
        System.out.println("Substitua a nota 5.0 pela 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

//        Verifica se um elemento está contido no array
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

//        exiba as notas na ordem informada
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//        for (Double nota: notas ) System.out.println(nota);

        System.out.println("Exiba a terceira nota adcionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

//        exibe a soma de valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) { // há um próximo elemento ? true or false
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista está vazia ? " + notas.isEmpty());
    }
}
