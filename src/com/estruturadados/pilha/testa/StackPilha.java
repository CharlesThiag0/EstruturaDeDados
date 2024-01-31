package com.estruturadados.pilha.testa;

import com.estruturadados.pilha.Pilha;

import java.util.Stack;

public class StackPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        System.out.println(pilha.estaVazia());
        System.out.println(stack.isEmpty());

        System.out.println(stack.push(1));


    }
}
