package com.estruturadados.listaEncadeada;

public class No<T> {

    private T elemento;

    // precisa guarda a referencia pro proximo no, e assim deixando interligada
    private No<T> proximo;

    public No(){
        this.elemento = null;
        this.proximo = null;}

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null; // especificando que o proximo será nulo
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo)  {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No[" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                ']';
    }
}
