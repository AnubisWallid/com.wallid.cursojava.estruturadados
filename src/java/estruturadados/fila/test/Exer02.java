package estruturadados.fila.test;

import estruturadados.fila.Paciente;

import java.util.*;

public class Exer02 {
    public static void main(String[] args) {
        Queue<Paciente> filaNormal = new PriorityQueue<>();
        Queue<Paciente> filaPrioridade = new PriorityQueue<>();
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
        for (Paciente p : pacientes) {
            if (p.getPrioridade() == 0) {
                filaNormal.add(p);
            } else filaPrioridade.add(p);
        }
        System.out.println("Fila Normal:\n" + filaNormal);
        System.out.println();
        System.out.println("Fila Prioritaria:\n" + filaPrioridade);
        while (!filaNormal.isEmpty() || !filaPrioridade.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                if (filaPrioridade.isEmpty()) {
                    break;
                }
                System.out.println("Atendendo Prioritario: " + filaPrioridade.poll());
            }
            if (!filaNormal.isEmpty()) {
                System.out.println("Atendendo Normal: " + filaNormal.poll());
            }
        }
    }
}

