package estruturadados.pilha.test;

import estruturadados.pilha.Palindromo;
import estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Palindromo palindromo1 = new Palindromo("ABCCBA");
        Palindromo palindromo2 = new Palindromo("ABCDEFEDCBA");
        Palindromo palindromo3 = new Palindromo("AMA");
        Palindromo.teste(palindromo1);
        Palindromo.teste(palindromo2);
        Palindromo.teste(palindromo3);
    }
}

