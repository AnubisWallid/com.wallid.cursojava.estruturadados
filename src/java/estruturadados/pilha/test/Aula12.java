package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

public class Aula12 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.empilha(12);
        pilha.empilha(2);
        pilha.empilha(82);
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.topo());
        System.out.println(pilha.toString());
    }
}

