package com.estruturadados.pilha.testa;

import java.util.Scanner;
import java.util.Stack;

public class Hanoi {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        hanoi(original.size(), original, destino, auxiliar);
    }

    public static void hanoi(int qtdDisco, Stack<Integer> original,Stack<Integer> destino,Stack<Integer> auxiliar) {
        if(qtdDisco > 0) {
            //                            B         A         C
            hanoi(qtdDisco -1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("22222222222222222222222222222222222");
            System.out.println("ORIGINAL:" + original);
            System.out.println("DESTINO:" + destino);
            System.out.println("AUXILIAR:" + auxiliar);


            hanoi(qtdDisco -1,auxiliar, destino, original);
        }
    }
}
