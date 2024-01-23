package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.testa.lista.Lista;

public class AplicacaoLista {
    public static void main(String[] args) {

        Lista<String> vetorString = new Lista(2);

        try {
            vetorString.adicionarElemento("elemento 01");
            vetorString.adicionarElemento("elemento 02");
            vetorString.adicionarElemento("elemento 03");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(vetorString.contem("elemento 01"));
    }
}
