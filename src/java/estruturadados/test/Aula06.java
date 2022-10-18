package estruturadados.test;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1);


        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("F");
        vetor.adicionar("G");
        vetor.adicionar("H");

        System.out.println(vetor);
        vetor.adicionar(0, "A");
        System.out.println(vetor);
        vetor.adicionar(4, "E");
        System.out.println(vetor);




    }
}
