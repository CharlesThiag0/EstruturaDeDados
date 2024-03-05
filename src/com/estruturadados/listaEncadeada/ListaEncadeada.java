package com.estruturadados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adicionar(T elemento){
        No<T> celula = new No<>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
        return "ListaEncadeada[" +
                "inicio=" + inicio +
                ']';
    }
}
