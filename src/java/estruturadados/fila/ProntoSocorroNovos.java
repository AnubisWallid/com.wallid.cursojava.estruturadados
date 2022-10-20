package estruturadados.fila;

import java.util.PriorityQueue;

public class ProntoSocorroNovos implements Runnable{
    private PriorityQueue<Paciente> fila;
    private int count;

    public ProntoSocorroNovos(PriorityQueue<Paciente> fila) {
        this.fila = fila;
        this.count = fila.size();
    }
/* 65 = 'A'
*/

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Paciente p =new Paciente(Character.toString(count + 65));
                fila.add(p);
                count++;
                System.out.println(p + ",na fila...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
