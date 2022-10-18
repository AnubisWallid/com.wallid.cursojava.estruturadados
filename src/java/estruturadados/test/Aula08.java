package estruturadados.test;

public class Aula08 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(1);

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
