package com.estruturadados.listaEncadeada.teste;

import com.estruturadados.listaEncadeada.ListaEncadeada;

public class TesteListaEncadeadas {
    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adicionar(1);

        System.out.println(listaEncadeada);
        System.out.println("Tamanho é " + listaEncadeada.getTamanho());

        listaEncadeada.adicionar(4);

        System.out.println(listaEncadeada);
        listaEncadeada.adicionar(5);

        System.out.println(listaEncadeada);
        System.out.println("Tamanho é " + listaEncadeada.getTamanho());

      /*  System.out.println("limpar");
        listaEncadeada.limpar();
        System.out.println(listaEncadeada);
*/
        try {
            System.out.println(listaEncadeada.busca(-1));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(listaEncadeada.busca(1));
        System.out.println(listaEncadeada.busca(2));


    }
}
