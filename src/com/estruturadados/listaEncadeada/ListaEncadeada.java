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

    public void limpar() {

        for (No<T> atual = this.inicio; atual != null;) { // for com criação da variavel de controle e condição com Nó
           // alterando a variavel de controle
            No<T> proximo = atual.getProximo(); // armazenando o proximo

            atual.setElemento(null);
            atual.setProximo(null);

            atual = proximo; // apontando o proximo para ser o atual
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
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
