package com.estruturadados.listaEncadeada.pratica;

public class ListaLigada {
    // definir o primeiro No(inicio)
    private NoAluno primeiro;
    private int tamanho;

    public ListaLigada() {}

    //o metudo inserir no inicio da lista
    public void addFirst(Aluno aluno) {
            // criar um No e setar o proximo com o no atual
            NoAluno novoPrimeiro;
            novoPrimeiro = new NoAluno(aluno, this.primeiro);
            // fazer apontar para o No criado
            this.primeiro = novoPrimeiro;
            tamanho++;
        }
    //o metudo inserir no fim
    public void addEnd(Aluno aluno) {
        NoAluno novoNo = new NoAluno(aluno);

        if (primeiro == null) {
            primeiro = novoNo;
            return;
        }

        NoAluno atual = this.primeiro;
        while(atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        atual.setProximo(novoNo);
    }
    //imprimir

    // buscar por nome


    @Override
    public String toString() {
        return "ListaLigada{" +
                "primeiro=" + primeiro +
                ", tamanho=" + tamanho +
                '}';
    }
}
