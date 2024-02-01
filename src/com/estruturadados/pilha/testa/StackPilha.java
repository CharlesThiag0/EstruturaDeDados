package com.estruturadados.pilha.testa;

import com.estruturadados.pilha.Pilha;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackPilha {
    public static void main(String[] args) {
        /*Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        System.out.println(pilha.estaVazia());
        System.out.println(stack.isEmpty());

        System.out.println(stack.push(1));*/

        Scanner input = new Scanner(System.in);
        int num;

        //escreva um progama que leia 10 num
        Stack<Integer> stackPar = new Stack<>();
        Stack<Integer> stackImpar = new Stack<>();

        for(int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero:" + i);
            num = input.nextInt();

            if(num == 0){
                    // verifica pilha par
                    if(stackPar.isEmpty()) {
                        System.out.println("Pilha par esta vazia");
                    } else {
                        stackPar.pop();
                    }

                    // verifica pilha impar
                    if (stackImpar.isEmpty()) {
                        System.out.println("Pilha impar esta vazia");
                    } else {
                        stackImpar.pop();
                    }

            } else if(!(num % 2 == 0)) {
                System.out.println("Adicionando na pilha impar");
                stackImpar.push(num);

            } else {
                System.out.println("Adicionando na pilha par");
                stackPar.push(num);
            }
        }

        System.out.println("Par");
        while (!stackPar.isEmpty()) {
            System.out.println("Num: " + stackPar.pop());
        }

        System.out.println("Impar");
        while (!stackImpar.isEmpty()) {
            System.out.println("Num: " + stackImpar.pop());
        }
    }
}
