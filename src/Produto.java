import java.util.Locale;

public class Produto implements Comparable<Produto> {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    /** Ordem natural: do menor para o maior preço. */
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return String.format(PT_BR, "Produto: %-18s | Preço: R$ %,10.2f", nome, preco);
    }
}