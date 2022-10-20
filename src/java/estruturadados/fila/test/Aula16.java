package estruturadados.fila.test;

import estruturadados.fila.FilaPrioridade;
import estruturadados.fila.Paciente;

public class Aula16 {
    public static void main(String[] args) {
        FilaPrioridade<Paciente> fila = new FilaPrioridade<>();
        Paciente p1 = new Paciente("A",3);
        Paciente p2 = new Paciente("B",1);
        Paciente p3 = new Paciente("C",2);
        Paciente p4 = new Paciente("D",3);

        fila.enfileira(p1);
        fila.enfileira(p2);
        fila.enfileira(p3);
        fila.enfileira(p4);

        System.out.println(fila);
    }
}
