package estruturadados.fila.test;

import estruturadados.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Aula15 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("D");

        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);

    }
}
