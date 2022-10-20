package estruturadados.fila;

public enum InterfacePrioridade {
    VERMELHO(3, "Vermelho"),
    AMARELO(2, "Amarelo"),
    VERDE(1, "Verde");
    private final int valor;
    private final String str;
    InterfacePrioridade(int valor, String str) {
        this.valor = valor;
        this.str = str;
    }
    public int getValor(){
        return valor;
    }
    public String getStr() {
        return str;
    }
}
