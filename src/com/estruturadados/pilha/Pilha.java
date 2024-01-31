package com.estruturadados.pilha;

import com.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if(estaVazia()) {
            return null;
        }

        return elementos[tamanho -1];
    }

    public T desempilha() {
        if(estaVazia()) {
            return null;
        }

        return elementos[--tamanho];
    }

}
