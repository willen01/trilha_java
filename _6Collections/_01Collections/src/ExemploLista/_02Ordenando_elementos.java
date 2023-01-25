package ExemploLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Dadas as seguintes informações, crie uma lista e ordene esta
    lista exibindo:
            (nome - idade - cor)
     Gato 1 = nome:Jhon, idade: 18, cor: preto
     gato 2 = nome: simba, idade: 6, cor: tigrado
     gato 3 = nome: jhon, genero: 12, cor: amarelo
*/
public class _02Ordenando_elementos {
    public static void main(String[] args) {
        List<Gato> meuGatos = new ArrayList<>() {{
            add(new Gato("jhon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("jhon", 12, "amarelo"));
            add(new Gato("bob", 15, "branco"));
            add(new Gato("Alberto", 20, "branco"));
        }};

        System.out.println("-- Ordem de inserção --");
        System.out.println(meuGatos);

        System.out.println("-- Ordem aleatória --");
        Collections.shuffle(meuGatos); //mistura os ordens
        System.out.println(meuGatos);


        System.out.println("-- Ordem natural --");
        Collections.sort(meuGatos);
        System.out.println(meuGatos);

    }
}

// para trabalhar com a ordem natural usamos a interface comparable
class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    //    construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    //    método da interface comparable
    @Override
    public int compareTo(Gato gato) {
//        O método compareToIgnoreCase() faz a comparação entre duas strings considerando a ordem alfabética e ignorando a diferença entre maiúsculas e minúsculas
//        -1 = se for menor que o item comparado
//        0 = se for igual ao item comparado
//        1 = se for maior que o item comparado
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}