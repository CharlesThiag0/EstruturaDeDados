package com.estruturadados.vetor.pratica;

import com.estruturadados.vetor.testa.lista.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> listaDeNum = new Lista<>(20);

       for(int i = 0; i < 30; i++) {
           listaDeNum.adicionarElemento(i * 2);
       }
        System.out.println(listaDeNum);

       listaDeNum.adicionarElemento(3,1);
        System.out.println(listaDeNum);

        listaDeNum.adicionarElemento(100);
        System.out.println(listaDeNum);

        System.out.printf("Elemento: %d\n",listaDeNum.busca(20));

        System.out.printf("Tamanho: %d\n",  listaDeNum.getTamanho());

        listaDeNum.adicionarElemento(20, 21);
        System.out.println(listaDeNum.ultimaPosicao(20));

        System.out.println(listaDeNum.contem(20));

        listaDeNum.remover(0);
        System.out.println(listaDeNum);

       listaDeNum.removerAll();
       listaDeNum.adicionarElemento(1);
       System.out.println(listaDeNum);

    }
}
