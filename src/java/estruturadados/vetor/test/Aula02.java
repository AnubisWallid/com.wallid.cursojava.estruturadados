

package estruturadados.vetor.test;

import estruturadados.vetor.Vetor;

public class Aula02 {
    public Aula02() {
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        /*try {*/
        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");
        vetor.adicionar("elemento 4");
        vetor.adicionar("elemento 5");
        /*} catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println(vetor.getIndex());
        System.out.println(vetor);
    }
}
