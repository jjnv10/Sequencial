
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] lista = {24, -8, 5, 71, 59, 48, 97, 3};
        
        System.out.println("Lista: " + Arrays.toString(lista));
        int temp = busca_sequecial(lista, 3);

        String texto = temp >= 0 ? "Elemento encontrado! na posição " + temp : "Não encontrado!";
        System.err.println(texto);
        
        
        Arrays.sort(lista);
        System.out.println("Lista: " + Arrays.toString(lista));
         temp = busca_binario(lista, 3);
        texto = temp >= 0 ? "Elemento encontrado! na posição " + temp : "Não encontrado!";
        System.err.println(texto);
    }
    

    public static int busca_sequecial(int[] lista, int chave) {
        for (int i = 0; i <= lista.length-1; i++) {
            if (lista[i] == chave) {
                return i;
            }
        }
        return -1;
    }

    public static int busca_binario(int[] lista, int chave) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (lista[meio] == chave) {
                return meio;
            }
            if (lista[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
