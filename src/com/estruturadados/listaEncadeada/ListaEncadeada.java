package com.estruturadados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe";

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


    private boolean posicaoNaoExiste(int posicao ) {
        return (posicao > tamanho || posicao < 0);
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
        if(posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(NAO_EXISTE);
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
        if(posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(NAO_EXISTE);
        } else if (posicao == 0) {
            this.adicionarNoInicio(elemento);
        } else {

            No<T> anteriorNo = this.buscaPorPosicao(posicao -1); // armazenando o No anterior com a posição desejada
            No<T> proximoNo = anteriorNo.getProximo(); // armazenando o No seguinte para ñ perde os No ligados a ele

            No<T> novoNo = new No<>(elemento, proximoNo); // criando o novo No e assim encadeando com o proximoNo
            anteriorNo.setProximo(novoNo);
            // armazenando o novo no como seguinte sendo assim subscrevendo em cima
            // do antigo e assim adicionando na posição desejada sem perde os No ligados
            this.tamanho++;
        }
    }

    public T removerInicio() {
        if(tamanho == 0)  {
            throw new RuntimeException("Nada adicionado a lista");
        }

        T removido = inicio.getElemento();
        this.inicio = inicio.getProximo();
        tamanho--;

        if(tamanho == 0) {
            // ñ necessario inicio ser nulo pq se o inicio.getProximo ja podera ser null
            ultimo = null;
        }

        return removido;
    }

    public T removerFinal() {
        if(tamanho == 0)  {
            throw new RuntimeException("Nada adicionado a lista");
        }

        if(tamanho == 1)  {
           return this.removerInicio();
        }

        No<T> penultimoNo = this.buscaPorPosicao(tamanho -2); // menos 2 porque queremos o penultimo
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        ultimo = penultimoNo;
        tamanho--;

        return removido;
    }

    public T removerPosicao(int posicao) {
        if(posicaoNaoExiste(posicao)){
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            return removerInicio();
        }

        if(posicao == this.tamanho-1){
            return removerFinal();
        }

        No<T> anteriorNo = this.buscaPorPosicao(posicao - 1);
        No<T> removidoNo = anteriorNo.getProximo();
        anteriorNo.setProximo(removidoNo.getProximo());
        this.tamanho--;

        return removidoNo.getElemento();
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
