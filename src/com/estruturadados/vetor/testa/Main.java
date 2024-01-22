package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionarElemento("elemento 01");
            vetor.adicionarElemento("elemento 02");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println(vetor.getTamanho());

        System.out.println(vetor);
        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca("ElemeNto 01"));




    }
}
