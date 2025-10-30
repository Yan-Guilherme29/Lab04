package org.model;

public class SaladeAula {

    private String nomeTurma;
    private int[][] notasAlunos;

    // Construtores

    public SaladeAula() {
        this.nomeTurma = "Desconhecida";
        this.notasAlunos = new int[5][3];
    }

    public SaladeAula(String nomeTurma, int[][] notasAlunos) {
        this.nomeTurma = nomeTurma;
        this.notasAlunos = notasAlunos;
    }

    // Métodos

    public void imprimirInformacoes() {

        System.out.println("Nome da Turma" + nomeTurma);
        System.out.println("Nota dos alunos: ");

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno: " + (i + 1) + ": ");

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarNotasAcima(int valorMinimo) {

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (notasAlunos[i][j] < valorMinimo) {
                    return false;
                }
            }
        }
        return true;
    }
}

