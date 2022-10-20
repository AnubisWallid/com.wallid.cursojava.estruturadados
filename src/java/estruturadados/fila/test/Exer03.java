package estruturadados.fila.test;

import estruturadados.fila.Paciente;
import estruturadados.fila.ProntoSocorroNovos;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exer03 {
    public static void main(String[] args) {

        Paciente p1 = new Paciente("A");
        Paciente p2 = new Paciente("B");
        Paciente p3 = new Paciente("C");
        Paciente p4 = new Paciente("D");
        Paciente p5 = new Paciente("E");
        Paciente p6 = new Paciente("F");
        Paciente p7 = new Paciente("G");
        Paciente p8 = new Paciente("H");
        Paciente p9 = new Paciente("I");
        Paciente p10 = new Paciente("J");
        ArrayList<Paciente> pacientes = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
        PriorityQueue<Paciente> fila = new PriorityQueue<>(pacientes);
//        System.out.println(fila);
        ProntoSocorroAtendimento psAtendimento = new ProntoSocorroAtendimento(fila);
        ProntoSocorroNovos psNovos = new ProntoSocorroNovos(fila);
        Thread t1 = new Thread(psAtendimento);
        Thread t2 = new Thread(psNovos);
        t1.start();
        t2.start();
//        System.out.println(Character.toString(100));

    }
}
