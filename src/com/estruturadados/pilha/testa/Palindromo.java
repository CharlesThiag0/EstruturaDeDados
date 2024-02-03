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
}
