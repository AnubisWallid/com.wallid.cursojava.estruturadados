package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

public class Aula11 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.empilha(12);
        System.out.println(pilha.toString());
    }
}

