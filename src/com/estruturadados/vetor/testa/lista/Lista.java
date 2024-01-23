package com.estruturadados.vetor.testa.lista;

import java.lang.reflect.Array;

public class Lista <T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução mais elegante
    }

    /*
    public Lista(Class tipoClasse, int capacidade) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); // soluçãp 2
    }
    */

    public int getTamanho() {
        return tamanho;
    }

    public T getElemento(int posicao){
        return busca(posicao);
    }

    private void posicaoInvalida(int posicao) {
        if(!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }
    }

    public void adicionarElemento(T elemento) throws Exception {
        aumentarCapacidade();

        if(tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho ++;
        } else {
            throw new Exception("Ex: capacidade total do vetor preenchida!");
        }
    }

    public void adicionarElemento(T elemento, int posicao) {
        aumentarCapacidade();

        // mover elementos
        for(int i =tamanho -1; i >= posicao; i--) {
            elementos[i +1] = elementos[i];
        }

        elementos[posicao] = elemento;
        tamanho ++;
    }

    public void aumentarCapacidade() {
        if(this.elementos.length == tamanho) {
            T[] elementos = (T[]) new Object[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                elementos[i] = this.elementos[i];
            }

            this.elementos = elementos;
        }
    }

    public void remover(int posicao) {
        posicaoInvalida(posicao);

        for(int i = posicao; i < tamanho -1; i++) {
            elementos[i] = elementos[i +1];
        }

        tamanho --;
    }

    public void remover(T elemento) {
        remover(busca(elemento));
    }

    public void removerAll() {
        tamanho = 0;

        for(int i = 0; i < elementos.length; i ++) {
            elementos[i] = null;
        }
    }

    public T busca(int posicao) {
        posicaoInvalida(posicao);

        return elementos[posicao];
    }

    public int ultimaPosicao(Object elemento){
        for(int i = this.elementos.length -1 ; i >= 0; i--) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public int busca(T elemento) {
        for(int i = 0; i < tamanho; i++) {

            if(elementos[i].equals(elemento)){
                return i;
            }

        }

        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }



    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");

        for(int i = 0; i <tamanho -1; i++) {
            string.append(elementos[i]);
            string.append(", ");
        }

        if(elementos.length> 0) {
            string.append(elementos[tamanho -1]);
            string.append("]");
        }

        return string.toString() ;
    }
}
