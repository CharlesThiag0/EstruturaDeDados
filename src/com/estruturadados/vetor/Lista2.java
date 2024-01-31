package com.estruturadados.vetor;

import com.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Lista2() {}

    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    @Override
    public int getTamanho() {
        return super.getTamanho();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
