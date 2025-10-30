package org.model;

public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;

    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5];
    }

    public Cinema(String nomeCinema, boolean[][] assentos) {
        this.nomeCinema = nomeCinema;
        this.assentos = assentos;
    }

    public void imprimirAssentos() {

        System.out.println("Nome do Cinema: " + nomeCinema);
        System.out.println("Disposição dos Assentos: ");

        for (int i = 0; i < assentos.length; i++) {
            System.out.println("Fileira: " + (i + 1) + ": ");

            for (int j = 0; j < assentos[i].length; j++) {
                if (assentos[i][j]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
}