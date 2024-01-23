package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.testa.lista.Lista;

public class AplicacaoLista {
    public static void main(String[] args) {

        Lista<Integer> vetorString = new Lista(2);

        try {
            vetorString.adicionarElemento(3);
            vetorString.adicionarElemento(2);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
