package com.estruturadados.fila.testa;

import com.estruturadados.fila.Fila;

public class TesteFila {
    public static void main(String[] args) {

        Fila<Character> fila = new Fila<>();

        fila.enfileira('A');
        fila.enfileira('B');
        fila.enfileira('C');

        System.out.println(fila);
        System.out.println(fila.getTamanho());

        fila.remover();
        System.out.println(fila.getTamanho());
        System.out.println(fila);

        fila.remover();
        System.out.println(fila.getTamanho());
        System.out.println(fila);

    }
}
