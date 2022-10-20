package estruturadados.fila.test;

import estruturadados.fila.Paciente;
import java.util.PriorityQueue;

public class ProntoSocorroAtendimento implements Runnable{
    private PriorityQueue<Paciente> fila;

    public ProntoSocorroAtendimento(PriorityQueue<Paciente> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while(!fila.isEmpty()){
            try {
            System.out.println(fila.poll() + ", antendida.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluido.");
    }



}
