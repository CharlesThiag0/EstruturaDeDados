package com.estruturadados.fila;

import com.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public T visu() {

        if (this.estaVazia()) {
            return null;
        }

        return elementos[0];
    }

    public T remover() {

        final int POSICAO = 0;

        if (super.estaVazia()) {
            return null;
        }

        T numRemovido = elementos[POSICAO];

        super.remove(POSICAO);

        return numRemovido;
    }

}
