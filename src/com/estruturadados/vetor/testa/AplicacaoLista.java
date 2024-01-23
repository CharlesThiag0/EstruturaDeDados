package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.testa.lista.Lista;

public class AplicacaoLista {
    public static void main(String[] args) {

        Lista<String> vetorString = new Lista(2);

        try {
            vetorString.adicionarElemento("a");
            vetorString.adicionarElemento("b");
            vetorString.adicionarElemento("c");
            vetorString.adicionarElemento("a");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(vetorString.contem("elemento 01"));

        System.out.println(vetorString.ultimaPosicao("a"));
    }
}
