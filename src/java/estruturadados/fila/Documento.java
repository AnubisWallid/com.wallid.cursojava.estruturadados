package estruturadados.fila;

import java.util.Comparator;

public class Documento {
    private String nome;
    private int numFolhas;

    public Documento(String nome, int numFolhas) {
        this.nome = nome;
        this.numFolhas = numFolhas;
    }

    public Documento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }

    @Override
    public String toString() {
        return "Documento, Nome: " +nome +
                ", Numero de folhas=" + numFolhas +
                '}';
    }
}
