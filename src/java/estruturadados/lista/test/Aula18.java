package estruturadados.lista.test;

import estruturadados.lista.ListaEncadeada;

public class Aula18 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);
    }
}
