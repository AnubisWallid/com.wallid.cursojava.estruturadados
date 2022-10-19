package estruturadados.lista.test;

import estruturadados.lista.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1);

        System.out.println(vetor.getIndex());
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("F");
        vetor.adicionar("G");
        vetor.adicionar("H");
        System.out.println(vetor.getIndex());

        System.out.println(vetor);
        vetor.remover(1);
        System.out.println(vetor);
        vetor.remover("D");
        vetor.remover("F");
        System.out.println(vetor);

        System.out.println(vetor.getIndex());





    }
}
