package estruturadados.test;

public class Aula09 {
    public static void main(String[] args) {
        VetorLista<String> vetor = new VetorLista(2);

        vetor.adicionar("Abacaxi");
        //vetor.adicionar(12.2); Agora não é mais possivel
        vetor.adicionar("Pera");
        vetor.adicionar("Banana");

        System.out.println(vetor);







    }
}
