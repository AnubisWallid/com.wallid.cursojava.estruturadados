package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d) Digite um numero: ", i + 1);
            Integer numero = scanner.nextInt();
            if (numero == 0) {
                System.out.printf("Zero. Desempilhando o numero %d, da pilha PAR%n", pilhaPar.desempilha());
                System.out.printf("Zero. Desempilhando o numero %d, da pilha IMPAR%n", pilhaImpar.desempilha());
            } else if (numero % 2 == 0) {
                pilhaPar.empilha(numero);
                System.out.println("PAR: Empilhando o numero: " + numero);
            } else {
                pilhaImpar.empilha(numero);
                System.out.println("IMPAR: Empilhando o numero: " + numero);
            }
        }
        System.out.println("Todos os numeros foram lidos");
        System.out.println("Desempilhando pilhas");
        while (!(pilhaPar.estaVazia() && pilhaPar.estaVazia())) {
            System.out.println("Pilha Par: " + pilhaPar.desempilha());
        }
        while (!(pilhaPar.estaVazia() && pilhaPar.estaVazia())) {
            System.out.println("Pilha Impar: %" + pilhaImpar.desempilha());
        }
        System.out.println("Todos elementos foram retirados");
    }
}
