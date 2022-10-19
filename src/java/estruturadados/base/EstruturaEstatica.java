package estruturadados.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho = 0;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];//Livro effect java
    }

    public EstruturaEstatica() {
        this(10);
    }

    private void verificaPosicao(int posicao) {
        if (!(posicao < tamanho && posicao >= 0)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
    }

    protected boolean adicionar(T elemento) {
        this.aumentaCapacidade();
        if (tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adicionar(int posicao, T elemento) {
        this.verificaPosicao(posicao);
        this.aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
    public boolean estaVazia(){
        return this.tamanho == 0;
    }
    protected void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i=posicao; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }


    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            /*for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }*/
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[(this.tamanho - 1)]); // Apenas para não colocar a virgula no ultimo elemento
        }
        s.append("]");
        return s.toString();
    }

}
