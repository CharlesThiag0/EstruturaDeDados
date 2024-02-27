package com.estruturadados.fila.testa;

import com.estruturadados.fila.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestaFilaPrioritaria1 {
    public static void main(String[] args) {
        // (A ORDEM QUE FICA APOS A ORDENAÇÃO NÃO IMPORTA PORQUE SEMPRE SERÁ CHAMADA O PROXIMO DA FILA E APENAS ISTO IMPORTA)
        Queue<Paciente> filaPrioritaria = new PriorityQueue<>();


        filaPrioritaria.add(new Paciente("teste1", 2));
        filaPrioritaria.add(new Paciente("teste2", 1));
        filaPrioritaria.add(new Paciente("teste3", 3));
        filaPrioritaria.remove();
        System.out.println("01");
        System.out.println(filaPrioritaria);


    }
}
