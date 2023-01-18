package exercicios;

public class Ex1_Ordem_inversa {
    public static void main(String[] args) {
//        exemplo de vetor
        int[] vetor = {-5, -6, 15, 50, 8, 4};

//        posicionamento do array na memória
//        System.out.print(vetor);

        int count = 0;
        System.out.println("Vetor na ordem original: ");
        while (count <= (vetor.length - 1)) {
            System.out.print(vetor[count] + " ");
            count++;
        } // -1 pela diferença de tamanho e posição de uma array

        //pegando o array pela ordem inversa
        System.out.println("\n Vetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
