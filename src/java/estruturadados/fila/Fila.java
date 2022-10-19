package estruturadados.fila;

import estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }
    public Fila() {
        super();
    }
    public void enfileirar(T elemento) {
        this.adicionar(elemento);
        //this.elementos[this.tamanho++] = elemento;
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POSICAO = 0;
        if (this.estaVazia()) {
            return null;
        }
        T elementoSeraRemovido = this.elementos[POSICAO];
        this.remove(POSICAO);
        return elementoSeraRemovido;
    }
}