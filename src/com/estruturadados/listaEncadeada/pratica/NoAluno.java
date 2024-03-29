package com.estruturadados.listaEncadeada.pratica;

public class NoAluno {
    private Aluno aluno;
    private NoAluno proximo;

    public NoAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NoAluno(Aluno aluno, NoAluno proximo) {
        this.aluno = aluno;
        this.proximo = proximo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NoAluno getProximo() {
        return proximo;
    }

    public void setProximo(NoAluno proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NoAluno{" +
                "aluno=" + aluno +
                ", proximo=" + proximo +
                '}';
    }
}
