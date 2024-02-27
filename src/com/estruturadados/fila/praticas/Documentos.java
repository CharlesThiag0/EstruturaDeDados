package com.estruturadados.fila.praticas;

public class Documentos {
    private String docomento;

    private int folhas;

    public Documentos(String docomento, int folhas) {
        this.docomento = docomento;
        this.folhas = folhas;
    }

    public int getFolhas() {
        return folhas;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "docomento='" + docomento + '\'' +
                ", folhas=" + folhas +
                '}';
    }
}
