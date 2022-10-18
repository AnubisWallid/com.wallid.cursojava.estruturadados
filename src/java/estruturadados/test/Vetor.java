

package estruturadados.test;

import java.util.Arrays;

public class Vetor {
    private final String[] elementos;
    private int index = 0;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    /*
    public void adicionar(String elemento) throws Exception {
        if (index < this.elementos.length) {
            this.elementos[index] = elemento;
            ++index;
        } else {
            throw new Exception("Vetor já está cheio");
        }
    }
    */
    private void verificaPosicao(int posicao){
        if (!(posicao < index && posicao >= 0)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
    }
    public boolean adicionar(String elemento) {
        if (index < this.elementos.length) {
            this.elementos[index] = elemento;
            index++;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, String elemento) {
        this.verificaPosicao(posicao);
        for (int i = index-1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.index ++;

        return true;
    }

    public String buscar(int posicao) {
        this.verificaPosicao(posicao);
        return this.elementos[posicao];
    }

    public int buscar(String elemento) {
        for (int i = 0; i < this.index; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public String[] getElementos() {
        return this.elementos;
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[ ");
        for (String elemento : this.elementos) {
            if (elemento != null) {
                s.append(elemento).append(", ");
            }
        }
        s.delete(s.length() - 2, s.length());
        s.append(" ]");
        return s.toString();
    }
}
