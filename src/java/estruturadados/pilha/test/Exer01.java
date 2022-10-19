package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d) Digite um numero: ", i + 1);
            Integer numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pilha.empilha(numero);
                System.out.println("PAR: Empilhando o numero: " + numero);
            } else if (!pilha.estaVazia()) {
                System.out.println("IMPAR: Desempilhando o numero: " + pilha.desempilha());

            } else {
                System.out.println("Pilha vazia");
            }
        }
        System.out.println("Todos os numeros foram lidos");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando: " + pilha.desempilha());
        }
        System.out.println("Todos elementos foram retirados");
    }
}
