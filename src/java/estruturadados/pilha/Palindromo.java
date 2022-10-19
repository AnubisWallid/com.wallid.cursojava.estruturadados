package estruturadados.pilha;

public class Palindromo {
    private String sequencia;
    private int tamanho;

    public Palindromo(String sequencia) {
        this.sequencia = sequencia;
        this.tamanho = this.sequencia.length();
    }

    public Palindromo() {
    }
    // A B C D E D C B A
    // 0 1 2 3 4 5 6 7 8 = 9

    // A B C C B A
    // 0 1 2 3 4 5 = 6
    public static boolean teste(Palindromo p) {
        int meio = p.tamanho % 2 == 0 ? p.tamanho / 2 : (p.tamanho - 1) / 2;
        System.out.println("Testando "+p);
        for (int i = 0; i < meio; i++) {
            System.out.printf("Comaparando: '%s' + '%s'%n", p.sequencia.charAt(i), p.sequencia.charAt(p.tamanho - (i + 1)));
            if (p.sequencia.charAt(i) == p.sequencia.charAt(p.tamanho - (i + 1))) continue;
            else {
                System.out.println("Nao eh um Palindromo...");
                return false;
            }
        }
        System.out.println("Eh um Palindromo !");
        return true;
    }

    @Override
    public String toString() {
        return "'"+this.sequencia+"'";
    }
}
