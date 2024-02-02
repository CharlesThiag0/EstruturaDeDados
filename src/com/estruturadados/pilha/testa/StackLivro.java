package com.estruturadados.pilha.testa;

import com.estruturadados.pilha.Livro;

import java.util.Scanner;
import java.util.Stack;

public class StackLivro {
    public static void main(String[] args) {
        Stack<Livro> livroStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int codigo;
        System.out.println("Esta vazia ?" + livroStack.empty());
        for(int i = 0; i < 6; i++) {
            titulo = "TituloTeste" + i;

            autor = "AutorTeste" + i;

            codigo = i + 999;

            livroStack.push(new Livro(titulo, autor, codigo));
        }


        System.out.println(livroStack);

        System.out.println("Topo: " + livroStack.peek());

        System.out.println("Removendo: " + livroStack.pop());
        System.out.println(livroStack);

        System.out.println("adicionando: " + livroStack.push(new Livro("teste adc","teste autor", 11)));

        System.out.println("Esta vazia ?" + livroStack.empty());

        System.out.println("Tamanho: " + livroStack.size());
    }
}
