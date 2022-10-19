

package estruturadados.test;

import java.lang.reflect.Array;

public class VetorLista<T> {
    private T[] elementos;
    private int index = 0;

    public VetorLista(int capacidade) {
        this.elementos = (T[])new Object[capacidade];//Livro effect java
    }
    public VetorLista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse,capacidade);
    }
    /*public void adicionar(Object elemento) throws Exception {
        if (index < this.elementos.length) {
            this.elementos[index] = elemento;
            ++index;
        } else {
            throw new Exception("Vetor já está cheio");
        }
    }*/
    private void verificaPosicao(int posicao) {
        if (!(posicao < index && posicao >= 0)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
    }

    public boolean adicionar(T elemento) {
        this.aumentaCapacidade();
        if (index < this.elementos.length) {
            this.elementos[index] = elemento;
            index++;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, T elemento) {
        this.verificaPosicao(posicao);
        this.aumentaCapacidade();

        for (int i = index - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.index++;

        return true;
    }

    public void remover(int posicao) {
        verificaPosicao(posicao);
        for (int i = posicao; i < this.index - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.index--;
    }
    public void remover(T elemento) {
        int posicao = this.buscar(elemento);
        if(posicao > -1){
            for (int i = posicao; i < this.index - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.index--;
        }
    }

    private void aumentaCapacidade() {
        if (this.index == this.elementos.length) {
            T[] elementosNovos =(T[]) new Object[this.elementos.length * 2];
            /*
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            */
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }

    public T buscar(int posicao) {
        this.verificaPosicao(posicao);
        return this.elementos[posicao];
    }

    public int buscar(T elemento) {
        for (int i = 0; i < this.index; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T[] getElementos() {
        return this.elementos;
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.index - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.index > 0) {
            s.append(this.elementos[(this.index-1)]); // Apenas para não colocar a virgula no ultimo elemento
        }
        s.append("]");
        return s.toString();
    }
}
