package com.estruturadados.pilha.testa;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Stack<String> stack = new Stack<>();

        String palavra = scanner.next();
        System.out.println(palavra);

        StringBuilder palavraReverse = new StringBuilder(palavra);

        palavraReverse.reverse();
        System.out.println(palavraReverse);

        if(palavraReverse.toString().equals(palavra)) {
            stack.push(palavra);
        }

        System.out.println(stack);*/

        String palavra = scanner.nextLine().toLowerCase().replace(" ", "");

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }

        String palavraReverse = "";
        while(!(stack.empty())) {
            palavraReverse += stack.pop();
        }

        if(palavraReverse.equals(palavra)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não Palindromo");
        }

        scanner.close();
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean testaParenteses(String mensagem) {
        char simbolo;
        char topo;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < mensagem.length(); i++) {
            simbolo = mensagem.charAt(i);

            if(ABRE.indexOf(simbolo) > -1) {
                stack.push(simbolo);
            } else if(FECHA.indexOf(simbolo) > -1) {

                if(stack.empty()) {
                    return false;
                } else {
                    topo = stack.pop();

                    if(ABRE.indexOf(simbolo) != FECHA.indexOf(topo)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
