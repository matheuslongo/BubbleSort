package br.com.bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {1001, 520, 900, 700, 1000};
        int aux = 0;
        int i = 0;

        //Imprime o vetor original (desordenado).
        System.out.println("Vetor desordenado: ");
        for(i = 0; i < vetor.length;i++){
            System.out.print(" "+ vetor[i]);
            if (i != (vetor.length - 1)) System.out.print(", ");
        }

        //Percorre o vetor fazendo a ordenação aplicando o método de ordenação  BubbleSort.
        System.out.println(" ");
        for(i = 0; i < (vetor.length); i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        //Imprime o vetor ordenado pelo método BubbleSort.
        System.out.println(" Vetor Organizado: ");
        for (i =0; i < (vetor.length); i++){
            System.out.print(" " + vetor[i]);
            if (i != (vetor.length-1)) System.out.print(", ");
        }
        System.out.print(" ");
    }

}
