package com.estruturadados.listaEncadeada.pratica;

public class NoLista {
    private int elemento;
    private NoLista proximo;

    public NoLista(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NoLista getProximo() {
        return proximo;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NoLista{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
