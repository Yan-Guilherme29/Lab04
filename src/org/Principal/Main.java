package org.Principal;

import org.model.*;

public class Main {
    public static void main(String[] args) {

    // ----------------------------- Atividade 1 - Classe Sala de Aula -----------------------------

        System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-= Atividade 1 =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

            int[][] notas = {
                    {5,6,7},
                    {8,9,10}
            };

            SaladeAula sala1 = new SaladeAula("Sala 1",notas);


            sala1.imprimirInformacoes();

    boolean resultado = sala1.verificarNotasAcima(6);
        System.out.println("Todas as notas São maiores que o valor Mínimo? : " + resultado);
        System.out.println();

    // ----------------------------- Atividade 2 - Classe Estoque loja -----------------------------

        System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-= Atividade 2 =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        int[][] lotes = {
                {100, 20},   // Lote 1
                {80, 10},    // Lote 2
                {60, 30},    // Lote 3
                {50, 45}     // Lote 4
        };


        EstoqueLoja estoque = new EstoqueLoja("Notebook Gamer", lotes);


        estoque.imprimirEstoque();


        int limiteCritico = 40;
        boolean temLoteCritico = estoque.verificarLoteCritico(limiteCritico);

        System.out.println("\nHá algum lote com vendas acima de " + limiteCritico + "? " + temLoteCritico);


        EstoqueLoja estoquePadrao = new EstoqueLoja();
        System.out.println("\n--- Estoque com construtor padrão ---");
        estoquePadrao.imprimirEstoque();

        // ----------------------------- Atividade 3 - Classe Cinema  -----------------------------

        System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-= Atividade 3 =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        // Criando uma matriz 5x5 representando os assentos do cinema
        // true = assento ocupado, false = assento livre
        boolean[][] assentos = {
                {true, false, false, true, false},
                {false, false, false, false, false},
                {true, true, false, false, false},
                {false, false, true, true, true},
                {false, false, false, false, true}
        };

        // Criando um cinema com nome e disposição dos assentos
        Cinema cinema1 = new Cinema("CineStar Premium", assentos);

        // Exibindo os assentos ocupados e livres
        cinema1.imprimirAssentos();

        // Exemplo usando o construtor padrão
        Cinema cinemaPadrao = new Cinema();
        System.out.println("\n--- Cinema com construtor padrão ---");
        cinemaPadrao.imprimirAssentos();


        // ----------------------------- Atividade 4 - Classe Matriz Numerica  -----------------------------

        System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-= Atividade 4 =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");



        // Criando uma matriz 3x3 com valores numéricos
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Criando um objeto MatrizNumerica com nome e valores personalizados
        MatrizNumerica matriz1 = new MatrizNumerica("Matriz Principal", numeros);

        // Exibindo a matriz
        matriz1.imprimirMatriz();

        // Exemplo usando o construtor padrão
        MatrizNumerica matrizPadrao = new MatrizNumerica();
        System.out.println("\n--- Matriz criada com o construtor padrão ---");
        matrizPadrao.imprimirMatriz();
    }
}