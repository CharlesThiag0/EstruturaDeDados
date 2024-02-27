package com.estruturadados.fila.praticas;

public class FilaAtendimento implements Comparable<FilaAtendimento>{
    private String nome;

    private int senha;

    private Boolean priotaria;

    public FilaAtendimento(String nome, int senha, Boolean priotaria) {
        this.nome = nome;
        this.senha = senha;
        this.priotaria = priotaria;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "FilaAtendimento{" +
                "nome='" + nome + '\'' +
                ", senha=" + senha +
                '}';
    }

    @Override
    public int compareTo(FilaAtendimento o) {
        return 0;
    }
}
