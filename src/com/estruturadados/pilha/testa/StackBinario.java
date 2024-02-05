package com.estruturadados.pilha.testa;

import java.util.Scanner;
import java.util.Stack;

public class StackBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // lógica bynaria
        /*int num = sc.nextInt();
        int resultado;

        while(num > 0) {
           resultado = num % 2;
           num /= 2;
           stack.push(resultado);
        }

        while(!(stack.empty())){
            System.out.print(stack.pop());
        }*/


        // hexadecimal
        int numero = sc.nextInt();
        int base = sc.nextInt();
        String bases = "0123456789ABCDEF";


        String numBase = "";

        while (numero > 0) {
            stack.push(numero % base);
            numero /= base;
        }


        while (!stack.isEmpty()) {
                numBase += bases.charAt(stack.pop());
            }

        System.out.println(numBase);

        sc.close();
    }
}
