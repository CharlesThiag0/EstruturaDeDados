package com.estruturadados.fila.praticas;

import com.estruturadados.fila.Fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestaFilaAtendimento {
    public static void main(String[] args) {

        Fila<String> atendimentoQueue = new Fila<>();
        Queue<String> atendimentoQueueP = new PriorityQueue<>();
        int contador = 0;
        final int MAX_PRIORIDADE = 3;

        atendimentoQueue.enfileira("Pessoa1");
        atendimentoQueue.enfileira("Pessoa2");
        atendimentoQueue.enfileira("Pessoa3");
        atendimentoQueueP.add("Pessoa 1P");
        atendimentoQueueP.add("Pessoa 2P");
        atendimentoQueueP.add("Pessoa 3P");
        atendimentoQueueP.add("Pessoa 4P");
        atendimentoQueueP.add("Pessoa 5P");
        atendimentoQueue.enfileira("Pessoa4");
        atendimentoQueue.enfileira("Pessoa5");
        atendimentoQueue.enfileira("Pessoa6");
        atendimentoQueue.enfileira("Pessoa7");
        atendimentoQueue.enfileira("Pessoa8");
        atendimentoQueue.enfileira("Pessoa9");
        atendimentoQueue.enfileira("Pessoa10");

        while (!(atendimentoQueue.estaVazia()) || !(atendimentoQueueP.isEmpty())){

            while(!(atendimentoQueueP.isEmpty()) && (contador < MAX_PRIORIDADE)) {

                System.out.println("Atendendo: " + atendimentoQueueP.remove());
                contador++;
            }

            System.out.println("Atendendo: " + atendimentoQueue.remover());
            contador = 0;
        }
    }
}
