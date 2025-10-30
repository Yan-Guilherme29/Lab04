package org.model;

public class EstoqueLoja {

    private String nomeProduto;
    private int[][] quantidadesPorLotes;

    // Construtores

    public EstoqueLoja() {
        this.nomeProduto = "Produto Desconhecido";
        this.quantidadesPorLotes = new int[4][2];

    }

    public EstoqueLoja(String nomeProduto, int[][] quantidadesPorLotes) {
        this.nomeProduto = nomeProduto;
        this.quantidadesPorLotes = quantidadesPorLotes;
    }

    // Métodos

    public void imprimirEstoque() {

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Informações do Lote: ");

        for (int i = 0; i < quantidadesPorLotes.length; i++) {
            System.out.println("Lote: " + (i + 1) + ": ");
            System.out.println("Quantidade Disponível: ");
            System.out.println();
        }

    }

}
