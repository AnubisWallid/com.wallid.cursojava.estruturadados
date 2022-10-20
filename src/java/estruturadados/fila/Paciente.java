package estruturadados.fila;

import java.util.Random;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int prioridade;
    private InterfacePrioridade priori;

    private void geraPrioridade() {
        Random ale = new Random();
        this.setPrioridade(ale.nextInt(1, 4));
        switch (this.prioridade) {
            case 1:
                priori = InterfacePrioridade.VERDE;
                break;
            case 2:
                priori = InterfacePrioridade.AMARELO;
                break;
            case 3:
                priori = InterfacePrioridade.VERMELHO;
                break;
            default:
                break;
        }
    }

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente(String nome) {
        this.nome = nome;
        geraPrioridade();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pacitente [Nome: '" + nome + "',  Prioridade: '" + priori.getStr() + "']";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Paciente o) {
        if (this.prioridade < o.getPrioridade()) {
            return 1;
        } else if (this.prioridade > o.getPrioridade()) {
            return -1;
        } else
//            return this.nome.compareTo(o.getNome());//Comentado para o ex.: Pronto Atendimento
            return 0;
    }
}
