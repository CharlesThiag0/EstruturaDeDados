package com.estruturadados.pilha;

public class Livro {
    private String titulo;
    private String autor;
    private int codigo;

    public Livro(String titulo, String autor, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
