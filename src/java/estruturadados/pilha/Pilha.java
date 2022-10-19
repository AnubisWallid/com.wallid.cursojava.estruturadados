package estruturadados.pilha;

import estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
       public Pilha(int capacitade) {
        super(capacitade);
    }
    public Pilha() {
        super();
    }
    public void empilha(T elemento) {
        super.adicionar(elemento);
    }
    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }
    public T desempilha(){
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[--tamanho];
    }
}
