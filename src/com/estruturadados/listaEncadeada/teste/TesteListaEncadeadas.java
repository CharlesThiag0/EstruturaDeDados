package com.estruturadados.listaEncadeada.teste;

import com.estruturadados.listaEncadeada.ListaEncadeada;

import java.util.LinkedList;

public class TesteListaEncadeadas {
    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        /*listaEncadeada.adicionar(1);

        System.out.println(listaEncadeada);
        System.out.println("Tamanho é " + listaEncadeada.getTamanho());

        listaEncadeada.adicionar(2);

        System.out.println(listaEncadeada);
        listaEncadeada.adicionar(4);

        System.out.println(listaEncadeada);*/
       /* System.out.println("Tamanho é " + listaEncadeada.getTamanho());

      *//*  System.out.println("limpar");
        listaEncadeada.limpar();
        System.out.println(listaEncadeada);
*//*
        try {
            System.out.println(listaEncadeada.busca(-1));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(listaEncadeada.busca(1));
        System.out.println(listaEncadeada.busca(2));*/


        System.out.println("teste de recolocação");
        listaEncadeada.adicionar(1);
        listaEncadeada.adicionar(2);
        listaEncadeada.adicionar(4);


        listaEncadeada.adicionar(2, 3);
        listaEncadeada.adicionar(0, 0);
        listaEncadeada.adicionar(5, 5);

        listaEncadeada.removerInicio();

        System.out.println(listaEncadeada);
        /*listaEncadeada.adicionar(3);
        listaEncadeada.adicionar(4);
        listaEncadeada.adicionar(5);

        System.out.println(listaEncadeada);
     //   listaEncadeada.adicionarNoInicio( 1);
        try {
            listaEncadeada.adicionar( 1,2);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(listaEncadeada);*/


    }
}
