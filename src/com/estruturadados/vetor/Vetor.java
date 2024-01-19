package com.estruturadados.vetor;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public void adicionarElemento(String elemento) {
        for(int i = 0; i < this.elementos.length; i ++) {

            if(elementos[i] == null) {
                elementos[i] = elemento;
                break; // Parar a aplicação quando encontrar uma posição nula
            } else {
                throw new IllegalArgumentException("Vetor preenchido");
            }
        }
    }

}
