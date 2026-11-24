import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 4599.90));
        produtos.add(new Produto("Mouse", 89.90));
        produtos.add(new Produto("Monitor", 1299.00));
        produtos.add(new Produto("Teclado", 249.50));
        produtos.add(new Produto("Cabo HDMI", 29.90));

        System.out.println("Produtos ordenados por preço (menor para maior):");
        ListaUtil.ordenarExibir(produtos);

        // O mesmo método genérico funciona com outros tipos
        System.out.println("\nStrings em ordem alfabética:");
        ListaUtil.ordenarExibir(new ArrayList<>(Arrays.asList("Maria", "João", "Ana", "Carlos")));

        System.out.println("\nInteiros em ordem crescente:");
        ListaUtil.ordenarExibir(new ArrayList<>(Arrays.asList(42, 7, 19, 3)));
    }
}