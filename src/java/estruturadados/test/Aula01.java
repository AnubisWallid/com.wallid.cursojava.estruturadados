

package estruturadados.test;

public class Aula01 {
    public Aula01() {
    }

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        /*try {*/
        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");
        vetor.adicionar("elemento 4");
        /*} catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
