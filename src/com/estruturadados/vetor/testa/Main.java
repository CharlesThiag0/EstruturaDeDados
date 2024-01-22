package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adicionarElemento("A");
            vetor.adicionarElemento("B");
            vetor.adicionarElemento("C");
            vetor.adicionarElemento("D");
            vetor.adicionarElemento("E");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println(vetor.getTamanho());

        System.out.println(vetor);
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca("ElemeNto 01"));

        System.out.println(vetor);

        vetor.remover(2);
        System.out.println(vetor);
        vetor.remover("A");
        System.out.println(vetor);

    }
}
