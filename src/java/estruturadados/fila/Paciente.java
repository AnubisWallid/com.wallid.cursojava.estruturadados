package estruturadados.fila;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Nome: " + nome +",  Prioridade: " + prioridade+"]";
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
        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        } else
            return this.nome.compareTo(o.getNome());
    }
}
