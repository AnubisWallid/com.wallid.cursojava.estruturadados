package estruturadados.fila.test;

import estruturadados.fila.Fila;

public class Aula14 {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>(5);
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");

        System.out.println(fila.estaVazia());
        System.out.println(fila);

        fila.desenfileirar();
        System.out.println(fila);

    }
}
