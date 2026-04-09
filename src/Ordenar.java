public class Ordenar {
    
    public static void bubbleSort(int lista[]) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int lista[]) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = lista[minIndex];
            lista[minIndex] = lista[i];
            lista[i] = temp;
        }
    }

    

    public static void insertionSort(int lista[]) {
        int n = lista.length;
        for (int i = 1; i < n; i++) {
            int key = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = key;
        }
    }

   
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(arr, inicio, fim);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim]; // último elemento como pivot
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                trocar(arr, i, j);
            }
        }

        trocar(arr, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   

     public static void mergeSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            mergeSort(arr, esquerda, meio);
            mergeSort(arr, meio + 1, direita);

            merge(arr, esquerda, meio, direita);
        }
    }

    private static void merge(int[] arr, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[esquerda + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[meio + 1 + j];

        int i = 0, j = 0, k = esquerda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
