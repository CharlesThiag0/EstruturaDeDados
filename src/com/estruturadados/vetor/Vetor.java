package com.estruturadados.vetor;

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
        aumentarCapacidade();

        if(tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            tamanho ++;
        } else {
            throw new Exception("Ex: capacidade total do vetor preenchida!");
        }
    }

    public void adicionarElemento(String elemento, int posicao) {
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
            String[] elementos = new String[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                elementos[i] = this.elementos[i];
            }

            this.elementos = elementos;
        }
    }

    public void remover(int posicao) {
        if(!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }

        for(int i = posicao; i < tamanho -1; i++) {
            elementos[i] = elementos[i +1];
        }

        tamanho --;
    }

    public void remover(String elemento) {
        remover(busca(elemento));
    }

   public String busca(int posicao) {
        if(!(posicao > 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição Inválida!");
        }

        return elementos[posicao];
   }

    public int busca(String elemento) {
        for(int i = 0; i < tamanho; i++) {

            if(elementos[i].equalsIgnoreCase(elemento)){ // n importa se é ou ñ letra maiuscula
                return i;
            }
        }

        return -1;
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
