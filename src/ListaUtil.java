import java.util.Collections;
import java.util.List;

public class ListaUtil {

    private ListaUtil() {
    }

    /**
     * Ordena a lista pela ordem natural dos elementos (Comparable) e imprime cada item.
     * Funciona com qualquer tipo T que saiba se comparar: Produto, String, Integer etc.
     *
     * Atenção: a lista recebida é ordenada no lugar, ou seja, é modificada.
     */
    public static <T extends Comparable<? super T>> void ordenarExibir(List<T> lista) {
        Collections.sort(lista);
        for (T item : lista) {
            System.out.println(item);
        }
    }
}