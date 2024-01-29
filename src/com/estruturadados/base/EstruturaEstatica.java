package com.estruturadados.base;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    public EstruturaEstatica(){
        this(10);
    }

    private boolean adiciona(T elemento) {
        // aumentar capacidade
        if(tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }

        return false;
    }

    private boolean adicona(int posicao, T elemento) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // aumentar capacidade

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

        if(elementos.length > 0) {
            stringBuilder.append(elementos[tamanho -1]);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
