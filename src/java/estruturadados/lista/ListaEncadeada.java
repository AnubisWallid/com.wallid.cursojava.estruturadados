package estruturadados.lista;

public class ListaEncadeada<T>{
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento){
            No<T> celula = new No<>(elemento);
            if (this.tamanho == 0){
            this.inicio = celula;
            }else {
                this.ultimo.setProximo(celula);
            }
            this.ultimo = celula;
            this.tamanho++;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0){
            return "[]";
        }
        No<T> atual = this.inicio;
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        s.append(atual.getElemento()).append("]");
       /* s.append(atual.getElemento()).append(", ");
        while(atual.getProximo() != null){
            atual = atual.getProximo();
            s.append(ultimo.getElemento()).append(", ");
        }
        s.delete(s.length()-2,s.length()).append("]");*/

        return s.toString();
    }
}
