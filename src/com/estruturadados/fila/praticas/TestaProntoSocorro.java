package com.estruturadados.fila.praticas;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestaProntoSocorro {
    public static void main(String[] args) {

        Queue<String> fitaVermelha = new PriorityQueue<>();
        Queue<String> fitaAmarela = new PriorityQueue<>();
        Queue<String> fitaVerde = new PriorityQueue<>();

        fitaAmarela.add("Thiago");
        fitaVerde.add("Santos");
        fitaVermelha.add("Charles");
        fitaVermelha.add("Charles");
        fitaVermelha.add("Charles");
        fitaVermelha.add("Charles");

        while(!fitaVermelha.isEmpty() || !fitaAmarela.isEmpty() || !fitaVerde.isEmpty()) {

            if(!fitaVermelha.isEmpty()) {
                callNextPatient(fitaVermelha);
            } else if(!fitaAmarela.isEmpty()) {
                callNextPatient(fitaAmarela);
            }else {
                callNextPatient(fitaVerde);
            }
        }

        System.out.println("Fim dos pacientes");
    }

    public static void callNextPatient(Queue<String> queue) {
        System.out.printf("Chamando o paciete %s\n", queue.remove());
    }
}
