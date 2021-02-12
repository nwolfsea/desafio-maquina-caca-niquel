package com.br.zup;

/**
 * Essa é a classe Sistema, onde criei o menuInicial.
 * @author Natália Moneda
 */

import java.util.Random;

import static com.br.zup.Simbolos.*;

public class Sistema {

    public void menuInicial() {
        IO.saidaDados("Digite: \n1 Executar\n2 Sair\n");
        String resposta = IO.entradaDados().nextLine();

        int contador = 0;
        int total = 0;
        while (contador <3) {
            if (resposta.equalsIgnoreCase("1")) {
                Random random = new Random();
                Simbolos[] todasAsOpcoesDoEnum = Simbolos.values();
                int quantidadeDeOpcoesDoEnum = todasAsOpcoesDoEnum.length;
                int numeroAleatorioDeAcordoComQuantidadeDeOpcoes = random.nextInt(quantidadeDeOpcoesDoEnum);
                total += todasAsOpcoesDoEnum[numeroAleatorioDeAcordoComQuantidadeDeOpcoes].pontos;
                System.out.println(todasAsOpcoesDoEnum[numeroAleatorioDeAcordoComQuantidadeDeOpcoes]);
            } else if (resposta.equalsIgnoreCase("2")) {
                System.exit(0);
            }
        contador++;
        }
        IO.saidaDados("Pontuação total = " + total );
    }

}
