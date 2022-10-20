package estruturadados.fila.test;

import estruturadados.fila.Documento;
import estruturadados.fila.Fila;

public class Exer01 {
    public static void main(String[] args) {
        Fila<Documento> filaImpressao = new Fila<>();
        Documento doc1 = new Documento("A", 10);
        Documento doc2 = new Documento("B", 12);
        filaImpressao.enfileirar(doc1);
        filaImpressao.enfileirar(doc2);
        filaImpressao.enfileirar(new Documento("C", 14));
        System.out.println(filaImpressao);
        System.out.println("Imprimindo documentos..");
        while (!filaImpressao.estaVazia()) {
            Documento documento = filaImpressao.desenfileirar();
            System.out.println("Imprimindo documento: " + documento.getNome());
            try {
                Thread.sleep(200L * documento.getNumFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sem documentos na fila de impressão..."+filaImpressao.estaVazia());
        }

    }
}
