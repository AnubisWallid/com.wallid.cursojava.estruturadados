

package estruturadados.lista.test;

import estruturadados.lista.Vetor;

public class Aula04 {
    public Aula04() {
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);


        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.buscar("elemento 1"));
        System.out.println(vetor.buscar(vetor.buscar("elemento 1")));
    }
}
