

package estruturadados.vetor.test;

import estruturadados.vetor.Vetor;

public class Aula03 {
    public Aula03() {
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);


        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.buscar(0));
        System.out.println(vetor.buscar(1));
        System.out.println(vetor.buscar(2));
        System.out.println(vetor.buscar(3));//lança a exception
    }
}
