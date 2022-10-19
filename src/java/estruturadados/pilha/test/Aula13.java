package estruturadados.pilha.test;

import estruturadados.pilha.Pilha;
import java.util.Stack;

public class Aula13 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        for (int i = 10; i < 20; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
