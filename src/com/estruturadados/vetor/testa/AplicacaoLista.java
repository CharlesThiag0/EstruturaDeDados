package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.testa.lista.Lista;

public class AplicacaoLista {
    public static void main(String[] args) {

        Lista<Integer> vetorString = new Lista(2);

        try {
            vetorString.adicionarElemento(1);
            vetorString.adicionarElemento(2);
            vetorString.adicionarElemento(3);
            vetorString.adicionarElemento(1);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(vetorString.contem(22));

        System.out.println(vetorString.ultimaPosicao(1));


    }
}
