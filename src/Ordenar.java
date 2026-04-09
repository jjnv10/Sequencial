/**
 * @author Joaquim João Nsaku Ventura
 * @version 1.0
 * @since 2024-06-01
 * Este código implementa os algoritmos de ordenação Bubble Sort, Selection Sort, Insertion Sort, Quick Sort e Merge Sort em Java. Cada algoritmo é explicado em termos de sua lógica e complexidade. O código inclui um exemplo de uso desses algoritmos, onde uma lista de inteiros é criada e ordenada usando cada um dos métodos de ordenação, com a lista original e as listas ordenadas sendo impressas no console.
 * A complexidade do Bubble Sort, Selection Sort e Insertion Sort é O(n^2) no pior caso, enquanto a complexidade do Quick Sort é O(n log n) no melhor caso e O(n^2) no pior caso, e a complexidade do Merge Sort é O(n log n) no melhor, pior e caso médio.
 */

import java.util.Arrays;

public class Ordenar {

    public static void main(String[] args) {
        // Cria uma lista com 8 elementos
        int[] lista = {24, -8, 5, 71, 59, 48, 97, 3};

        // Imprime a lista original
        System.out.println("Lista: " + Arrays.toString(lista));

        // Ordena a lista usando o método de ordenação Bubble Sort
        bubbleSort(lista);
        System.out.println("Bubble Sort: " + Arrays.toString(lista));

        int[] lista1 = {24, -8, 5, 71, 59, 48, 97, 3};
        System.out.println("Lista Não ordenada: " + Arrays.toString(lista1));
        // Ordena a lista usando o método de ordenação Selection Sort
        selectionSort(lista1);
        System.out.println("Selection Sort: " + Arrays.toString(lista1));

        int[] lista2 = {24, -8, 5, 71, 59, 48, 97, 3};
        System.out.println("Lista Não ordenada: " + Arrays.toString(lista2));
        // Ordena a lista usando o método de ordenação Insertion Sort
        insertionSort(lista2);
        System.out.println("Insertion Sort: " + Arrays.toString(lista2));

        int[] lista4 = {24, -8, 5, 71, 59, 48, 97, 3};
        System.out.println("Lista Não ordenada: " + Arrays.toString(lista4));
        // Ordena a lista usando o método de ordenação Quick Sort
        quickSort(lista4, 0, lista4.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(lista4));

        // Ordena a lista usando o método de ordenação Merge Sort
        int[] lista3 = {24, -8, 5, 71, 59, 48, 97, 3};
        System.out.println("Lista Não ordenada: " + Arrays.toString(lista3));
        mergeSort(lista3, 0, lista3.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(lista3));
    }

    public static void bubbleSort(int lista[]) {
        // O Bubble Sort é um algoritmo de ordenação simples que percorre a lista repetidamente, comparando elementos adjacentes e trocando-os se estiverem na ordem errada. O processo é repetido até que a lista esteja ordenada. A complexidade do Bubble Sort é O(n^2) no pior caso, o que o torna ineficiente para listas grandes.
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            // Percorre a lista do início ao fim, comparando elementos adjacentes e trocando-os se estiverem na ordem errada
            for (int j = 0; j < n - i - 1; j++) {
                // Compara o elemento actual com o próximo elemento
                if (lista[j] > lista[j + 1]) {
                    // Se o elemento actual for maior que o próximo elemento, troca-os
                    int temp = lista[j];
                    // Move o próximo elemento para a posição actual
                    lista[j] = lista[j + 1];
                    // Move o elemento actual para a posição do próximo elemento
                    lista[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Ordena uma lista usando o método de ordenação Selection Sort
     *
     * @param lista a lista a ser ordenada
     */
    public static void selectionSort(int lista[]) {
        // O Selection Sort é um algoritmo de ordenação que divide a lista em duas partes: a parte ordenada e a parte não ordenada. Ele repetidamente seleciona o menor elemento da parte não ordenada e o move para a parte ordenada. A complexidade do Selection Sort é O(n^2) no pior caso, o que o torna ineficiente para listas grandes.   

        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento na parte não ordenada da lista
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Compara o elemento actual com o menor elemento encontrado até agora  
                if (lista[j] < lista[minIndex]) {
                    // Se o elemento actual for menor que o menor elemento encontrado até agora, atualiza o índice do menor elemento    
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento da parte não ordenada da lista 
            int temp = lista[minIndex];
            // Move o menor elemento encontrado para a posição do primeiro elemento da parte não ordenada da lista  
            lista[minIndex] = lista[i];
            // Move o primeiro elemento da parte não ordenada da lista para a posição do menor elemento encontrado
            lista[i] = temp;
        }
    }

    /**
     * Ordena uma lista usando o método de ordenação Insertion Sort
     *
     * @param lista a lista a ser ordenada
     */
    public static void insertionSort(int lista[]) {
        int n = lista.length;
        for (int i = 1; i < n; i++) {
            // O Insertion Sort é um algoritmo de ordenação que constrói a lista ordenada um elemento de cada vez, inserindo cada novo elemento na posição correta em relação aos elementos já ordenados. A complexidade do Insertion Sort é O(n^2) no pior caso, o que o torna ineficiente para listas grandes, mas é eficiente para listas pequenas ou quase ordenadas.   
            int key = lista[i];
            // Compara o elemento actual (key) com os elementos anteriores da lista e move os elementos maiores que a key para uma posição à frente de sua posição actual   
            int j = i - 1;
            while (j >= 0 && lista[j] > key) {
                // Move o elemento maior que a key para uma posição à frente de sua posição actual
                lista[j + 1] = lista[j];
                // Move o índice j para a posição anterior
                j--;
            }
            // Insere a key na posição correta em relação aos elementos já ordenados    
            lista[j + 1] = key;
        }
    }

    /**
     * Ordena uma lista usando o método de ordenação Quick Sort
     *
     * @param lista a lista a ser ordenada
     * @param inicio o índice do primeiro elemento da lista
     * @param fim o índice do último elemento da lista
     */
    public static void quickSort(int[] lista, int inicio, int fim) {
        // O Quick Sort é um algoritmo de ordenação eficiente que utiliza a técnica de divisão e conquista. Ele escolhe um elemento como pivô e particiona a lista em duas partes: os elementos menores que o pivô e os elementos maiores que o pivô. Em seguida, ele recursivamente ordena as duas partes. A complexidade do Quick Sort é O(n log n) no melhor caso e O(n^2) no pior caso, mas geralmente é muito eficiente para listas grandes.   
        if (inicio < fim) {
            // Particiona a lista e obtém o índice do pivot
            int p = particionar(lista, inicio, fim);
            // Recursivamente ordena os elementos antes e depois da partição
            quickSort(lista, inicio, p - 1);
            // Recursivamente ordena os elementos antes e depois da partição
            quickSort(lista, p + 1, fim);
        }
    }

    /**
     * Particiona a lista em duas partes com base no pivot
     *
     * @param lista a lista a ser particionada
     * @param inicio o índice do primeiro elemento da lista
     * @param fim o índice do último elemento da lista
     * @return o índice do pivot após a partição
     */
    private static int particionar(int[] lista, int inicio, int fim) {
        int pivot = lista[fim]; // último elemento como pivot
        int i = inicio - 1; // índice do menor elemento

        for (int j = inicio; j < fim; j++) { // percorre a lista do início ao fim, comparando cada elemento com o pivot
            if (lista[j] <= pivot) { // se o elemento atual for menor ou igual ao pivot, incrementa o índice do menor elemento e troca os elementos
                i++;
                trocar(lista, i, j); // troca o elemento atual com o elemento na posição do índice do menor elemento
            }
        }

        trocar(lista, i + 1, fim); // troca o elemento na posição do índice do menor elemento + 1 com o pivot
        return i + 1; // retorna o índice do pivot após a partição
    }

    /**
     * Troca dois elementos da lista
     *
     * @param lista a lista contendo os elementos
     * @param i o índice do primeiro elemento
     * @param j o índice do segundo elemento
     */
    private static void trocar(int[] lista, int i, int j) { // troca os elementos na posição i e j da lista
        int temp = lista[i]; // armazena o elemento na posição i em uma variável temporária
        lista[i] = lista[j]; // move o elemento na posição j para a posição i
        lista[j] = temp; // move o elemento armazenado na variável temporária para a posição j
    }

    /**
     * O Merge Sort é um algoritmo de ordenação eficiente que utiliza a técnica
     * de divisão e conquista. Ele divide a lista em duas metades, ordena cada
     * metade recursivamente e depois as mescla para produzir uma lista
     * ordenada. A complexidade do Merge Sort é O(n log n) no melhor, pior e
     * caso médio, o que o torna eficiente para listas grandes.
     *
     * Ordena uma lista usando o método de ordenação Merge Sort
     *
     * @param lista a lista a ser ordenada
     * @param esquerda o índice do primeiro elemento da lista
     * @param direita o índice do último elemento da lista
     */
    public static void mergeSort(int[] lista, int esquerda, int direita) {
        if (esquerda < direita) { // Se a lista tiver mais de um elemento, divide a lista em duas metades
            int meio = (esquerda + direita) / 2; // Calcula o índice do meio da lista

            mergeSort(lista, esquerda, meio); // Ordena a primeira metade da lista recursivamente
            mergeSort(lista, meio + 1, direita); // Ordena a segunda metade da lista recursivamente

            merge(lista, esquerda, meio, direita); // Mescla as duas metades ordenadas para produzir uma lista ordenada
        }
    }

    private static void merge(int[] lista, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = lista[esquerda + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = lista[meio + 1 + j];
        }

        int i = 0, j = 0, k = esquerda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                lista[k] = L[i];
                i++;
            } else {
                lista[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            lista[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            lista[k] = R[j];
            j++;
            k++;
        }
    }
}
