package estruturadados.lista.test;

import estruturadados.lista.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);


        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println(vetor);
        vetor.adicionar(0, "A");
        System.out.println(vetor);




    }
}
