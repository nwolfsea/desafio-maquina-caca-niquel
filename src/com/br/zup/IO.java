package com.br.zup;
/**
 * nessa classe foi criado o método Input e Output.
 * @author Natália Moneda
 */

import java.util.Scanner;

public class IO {
    public IO() {
    }

    public static void saidaDados(String texto) {
        System.out.println(texto);
    }

    public static Scanner entradaDados() {
        return new Scanner(System.in);
    }
}
