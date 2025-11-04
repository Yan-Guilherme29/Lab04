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




    }
}