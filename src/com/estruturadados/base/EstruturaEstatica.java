package com.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    public EstruturaEstatica(){
        this(10);
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    protected boolean adiciona(T elemento) {
        aumentarCapacidade();

        if(tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }

        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentarCapacidade();

        for(int i =tamanho-1; i >= posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] =  elemento;
        tamanho++;

        return true;
    }

    private void aumentarCapacidade() {
        if(tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[tamanho * 2];

            for(int i = 0; i < tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    protected void remove(int posicao) {

        if(!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException("Posição inválida!");
        }

        for(int i=posicao; i < tamanho-1; i ++) {

            elementos[i] = elementos[i+1];
        }

        tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        for (int i = 0; i < tamanho -1; i++) {
            stringBuilder.append(elementos[i]);
            stringBuilder.append(", ");
        }

        if(tamanho > 0) {
            stringBuilder.append(elementos[tamanho -1]);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
