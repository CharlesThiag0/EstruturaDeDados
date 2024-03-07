package com.estruturadados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho;

    public void adicionar(T elemento){
        No<T> celula = new No<>(elemento);
        this.inicio = celula;
        tamanho ++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada[" +
                "inicio=" + inicio +
                ']';
    }
}
