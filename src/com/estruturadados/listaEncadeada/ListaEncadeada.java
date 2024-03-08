package com.estruturadados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adicionar(T elemento){
        No<T> celula = new No<T>(elemento); // criando o Nó

        if(this.tamanho ==  0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;

        tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    @Override
    public String toString() {
        return "ListaEncadeada[" +
                "inicio=" + inicio +
                ']';
    }
}
