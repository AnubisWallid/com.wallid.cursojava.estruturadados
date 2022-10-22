package estruturadados.fila.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exer04 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            fila.add(i);
        }
        Random ale = new Random();
        int num = 0;

        while (num == 0) {
            num = ale.nextInt(10);
        }

        System.out.println("Numero = " + num);

        while (fila.size() > 1) {
            for (int i = 0; i < num; i++) {
                Integer temp = fila.poll();
                fila.add(temp);
            }
            System.out.println("Eliminado = " + fila.poll());
        }
        System.out.println("Ganhador: "+fila.poll());
    }
}
