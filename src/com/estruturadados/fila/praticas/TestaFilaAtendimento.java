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

        atendimentoQueue.enfileira("Charles1");
        atendimentoQueue.enfileira("thia2");
        atendimentoQueue.enfileira("san3");
        atendimentoQueueP.add("Teste 1P");
        atendimentoQueueP.add("Teste 2P");
        atendimentoQueueP.add("Teste 3P");
        atendimentoQueueP.add("Teste 4P");
        atendimentoQueueP.add("Teste  5P");
        atendimentoQueue.enfileira("mue4");
        atendimentoQueue.enfileira("tai5");
        atendimentoQueue.enfileira("santiag6");
        atendimentoQueue.enfileira("kevin7");
        atendimentoQueue.enfileira("gales8");
        atendimentoQueue.enfileira("ric9");
        atendimentoQueue.enfileira("fla10");

        while (!(atendimentoQueue.estaVazia()) || !(atendimentoQueueP.isEmpty())){
            System.out.println("chamando.>> .> ");
            if(contador < MAX_PRIORIDADE && (!atendimentoQueueP.isEmpty())){
                System.out.println(atendimentoQueueP.remove());
                contador ++;
            } else {
                System.out.println(atendimentoQueue.remover());
                contador = 0;
            }

            System.out.println("Proximo");
        }
    }
}
