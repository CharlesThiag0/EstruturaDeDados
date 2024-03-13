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

        if(this.tamanho == 0) {
            return "[]";
        }

       // maneira 2
        StringBuilder stringBuilder = new StringBuilder("[");
        No<T> atual = this.inicio;

        for(int i = 0; i < tamanho-1 ; i++){
            stringBuilder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        stringBuilder.append(atual.getElemento()).append("]");

        // maneira 1
        /*stringBuilder.append(atual.getElemento()).append(",");
        while(atual.getProximo() != null) {

            atual = atual.getProximo();
            stringBuilder.append(atual.getElemento()).append(",");
        }*/
        return stringBuilder.toString();
    }
}
