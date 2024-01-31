package com.estruturadados.pilha.testa;

import com.estruturadados.pilha.Pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 11 ; i++) {
            pilha.empilha(i  +1);
        }

        System.out.println(pilha.estaVazia());

        System.out.println(pilha);
        System.out.println(pilha.getTamanho());

        System.out.println(pilha.topo());

        System.out.println("Desempilhar");
        System.out.println(pilha.desempilha());

        System.out.println(pilha);
    }
}
