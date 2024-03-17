package com.estruturadados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

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

        //versão 2

        /*for (No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
            atual.setElemento(null);
            atual.setProximo(null);
        }

             this.inicio = null;
             this.ultimo = null;
             this.tamanho = 0;*/


        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // maneira que pensei
    /*public T busca(int posicao) {


        if(!(posicao <= this.tamanho && posicao > 0)){
            throw new IllegalArgumentException("Posicção inválida!");
        }

            int pos = 0;
            for(No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
                pos++;

                if(pos == posicao){
                    return atual.getElemento();
                }
            }

        return null;
    }*/

    // maneira correta
    private No<T> buscaPorPosicao(int posicao) {
        if(!(posicao <= this.tamanho && posicao > 0)){
            throw new IllegalArgumentException("Posicão inválida!");
        }

        No<T> noAtual = this.inicio;

        for (int i = 0; i < posicao ; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T busca(int posicao) {
        return buscaPorPosicao(posicao).getElemento();
    }

    public Integer busca(T elemento) {
        int tamanho = 0;

        for (No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
            tamanho ++;

            if(atual.getElemento().equals(elemento)) {
                return tamanho;
            }
        }

        return NAO_ENCONTRADO;
    }

    public void adicionarNoInicio(T elemento) {

        if(this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;

        } else {
             No<T> novoNo = new No<>(elemento, this.inicio);
             this.inicio = novoNo;
        }

        this.tamanho++;
    }

    public void adicionar(int posicao, T elemento){
        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        } else if (posicao == 0) {
            adicionarNoInicio(elemento);
        } else {

            No<T> anteriorNo = this.buscaPorPosicao(posicao); // armazenando o No anterior com a posição desejada
            No<T> proximoNo = anteriorNo.getProximo(); // armazenando o No seguinte para ñ perde os No ligados a ele

            No<T> novoNo = new No<>(elemento, proximoNo); // criando o novo No e assim encadeando com o proximoNo
            anteriorNo.setProximo(novoNo); // armazenando o novo no como seguinte sendo assim subscrevendo em cima
            // do antigo e assim adicionando na posição desejada sem perde os No ligados

            this.tamanho++;
        }
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
