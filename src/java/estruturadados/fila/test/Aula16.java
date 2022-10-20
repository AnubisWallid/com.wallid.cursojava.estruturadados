package estruturadados.fila.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula16 {
    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new PriorityQueue<>(
               /* new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                       return Integer.compare(o1,o2);
                    }
                }*/
        );

        filaComPrioridade.add(5);
        filaComPrioridade.add(1);
        filaComPrioridade.add(0);

        System.out.println(filaComPrioridade);
        System.out.println(filaComPrioridade.peek());

    }
}
