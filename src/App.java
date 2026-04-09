
/**
 * @author Joaquim João Nsaku Ventura
 * @version 1.0
 * @since 2024-06-01
 * Este código implementa os algoritmos de busca sequencial e busca binária em Java. A busca sequencial percorre a lista do início ao fim, comparando cada elemento com a chave de busca, enquanto a busca binária requer que a lista esteja ordenada e divide a lista em partes para encontrar a chave de forma mais eficiente. O código também inclui um exemplo de uso desses algoritmos, onde uma lista de inteiros é criada, a busca sequencial é realizada para encontrar um elemento específico, a lista é ordenada e a busca binária é realizada para encontrar o mesmo elemento.
 * A complexidade da busca sequencial é O(n) no pior caso, enquanto a complex
 */
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        //Cria uma lista com 8 elementos
        int[] lista = {24, -8, 5, 71, 59, 48, 97, 3};

        // Imprime a lista original
        System.out.println("Lista: " + Arrays.toString(lista));

        // Busca sequencial do elemento 3
        int temp = busca_sequecial(lista, 3);

        // Imprime o resultado da busca sequencial
        String texto = temp >= 0 ? "Elemento encontrado! na posição " + temp : "Não encontrado!";
        System.err.println(texto);

        // Ordena a lista usando o método de ordenação nativo do Java
        Arrays.sort(lista);
        // Imprime a lista ordenada
        System.out.println("Lista: " + Arrays.toString(lista));

        // Busca binária do elemento 3
        temp = busca_binario(lista, 3);
        texto = temp >= 0 ? "Elemento encontrado! na posição " + temp : "Não encontrado!";
        System.err.println(texto);
    }

    /**
     * Busca sequencial: percorre a lista do início ao fim, comparando cada
     * elemento com a chave de busca. Se encontrar a chave, retorna o índice do
     * elemento. Caso contrário, retorna -1. Busca binária: requer que a lista
     * esteja ordenada. Divide a lista em duas partes e compara a chave com o
     * elemento do meio. Se a chave for igual ao elemento do meio, retorna o
     * índice. Se a chave for menor, continua a busca na metade inferior da
     * lista; se for maior, continua na metade superior. Repete esse processo
     * até encontrar a chave ou determinar que ela não está presente.
     *
     * @lista: array de inteiros a ser pesquisado
     * @chave: valor a ser encontrado na lista
     * @return: índice do elemento encontrado ou -1 se não encontrado
     *
     */
    public static int busca_sequecial(int[] lista, int chave) {
        // Percorre a lista do início ao fim, comparando cada elemento com a chave de busca
        // Se encontrar a chave, retorna o índice do elemento. Caso contrário, retorna -1
        // Complexidade: O(n) - no pior caso, percorre toda a lista
        for (int i = 0; i <= lista.length - 1; i++) {
            // Compara o elemento atual com a chave de busca
            if (lista[i] == chave) {
                // Se encontrar a chave, retorna o índice do elemento
                return i;
            }
        }
        // Se a chave não for encontrada após percorrer toda a lista, retorna -1
        return -1;
    }

    /**
     * Busca binária: requer que a lista esteja ordenada. Divide a lista em duas
     * partes e compara a chave com o elemento do meio. Se a chave for igual ao
     * elemento do meio, retorna o índice. Se a chave for menor, continua a
     * busca na metade inferior da lista; se for maior, continua na metade
     * superior. Repete esse processo até encontrar a chave ou determinar que
     * ela não está presente.
     *
     * @lista: array de inteiros a ser pesquisado
     * @chave: valor a ser encontrado na lista
     * @return: índice do elemento encontrado ou -1 se não encontrado
     */
    public static int busca_binario(int[] lista, int chave) {
        // Inicializa os índices de início e fim da busca
        int inicio = 0;
        // O índice do último elemento da lista é o comprimento da lista menos um
        // Complexidade: O(log n) - a cada iteração, a busca é dividida pela metade
        int fim = lista.length - 1;

        // Enquanto o índice de início for menor ou igual ao índice de fim, continua a busca
        while (inicio <= fim) {
            // Calcula o índice do elemento do meio da lista
            int meio = (inicio + fim) / 2;
            // Compara a chave com o elemento do meio
            if (lista[meio] == chave) {
                // Se a chave for igual ao elemento do meio, retorna o índice
                return meio;
            } // Se a chave for menor que o elemento do meio, continua a busca na metade inferior da lista
            else if (lista[meio] < chave) {
                // Actualiza o índice de início para a posição imediatamente após o meio
                inicio = meio + 1;
            } else {
                // Se a chave for maior que o elemento do meio, continua a busca na metade superior da lista
                fim = meio - 1;
            }
        }

        // Se a chave não for encontrada após esgotar as possibilidades, retorna -1
        return -1;
    }
}
