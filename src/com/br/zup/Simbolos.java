package com.br.zup;

/**
 * Esse é o ENUM e foi criado os símbolos que precisam ser retornadas quando o user escolhe a opção "Executar".
 * @author Natália Moneda
 */

public enum Simbolos {

    BANANA(10), MORANGO(20), ESTRELA(40);
    private int pontos;


    public int getPontos() {
        return pontos;
    }

    Simbolos(int i) {
     this.pontos = i;
    }
}
