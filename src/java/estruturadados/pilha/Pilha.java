package estruturadados.pilha;

import estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacitade) {
        super(capacitade);
    }
    public Pilha() {
        super();
    }
}
