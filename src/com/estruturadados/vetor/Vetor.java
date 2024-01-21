package com.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarElemento(String elemento) throws Exception {
        if(tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho ++;
        } else {
            throw new Exception("Ex: capacidade total do vetor preenchida!");
        }
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
