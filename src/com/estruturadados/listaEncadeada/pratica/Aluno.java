package com.estruturadados.listaEncadeada.pratica;

public class Aluno {
    private String nome;
    private int idade;
    private Double notaMedia;

    public Aluno(String nome, int idade, Double notaMedia) {
        this.nome = nome;
        this.idade = idade;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
