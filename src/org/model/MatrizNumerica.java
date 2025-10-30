package org.model;

public class MatrizNumerica {
    private String nomeMatriz;
    private int[][] matrizNumeros;

    public MatrizNumerica() {
        this.nomeMatriz = "Nome Desconhecido";
        this.matrizNumeros = new int[3][3];
    }

    public MatrizNumerica(String nomeMatriz, int[][] matrizNumeros) {
        this.nomeMatriz = nomeMatriz;
        this.matrizNumeros = matrizNumeros;
    }

    public void imprimirMatriz() {
        System.out.println("Nome da Matriz: " + nomeMatriz);
        System.out.println("Valores da Matriz: ");

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros.length; j++) {
                System.out.println(matrizNumeros[i][j]);
            }
            System.out.println();
        }

    }

}
