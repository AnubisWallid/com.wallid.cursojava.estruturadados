

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
    public boolean adicionar(String elemento) {
        if (index < this.elementos.length) {
            this.elementos[index] = elemento;
            index++;
            return true;
        }
        return false;
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
