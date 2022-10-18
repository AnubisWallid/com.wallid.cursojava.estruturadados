

package estruturadados.test;

public class Vetor {
    private final String[] elementos;
    private static int index = 0;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        index = capacidade;
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
            ++index;
            return true;
        }
        return false;
    }

    public String[] getElementos() {
        return this.elementos;
    }
}
