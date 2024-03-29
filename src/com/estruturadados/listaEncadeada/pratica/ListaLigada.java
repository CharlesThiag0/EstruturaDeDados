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

        // verificar se a lista esta vazia
        if (primeiro == null) {
            primeiro = novoNo;
            return;
        }

        // pegando atual para percorrer
        NoAluno atual = this.primeiro;

        // percorrer ate achar o atual.proximo sendo nulo
        while(atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        //para poder adiciona-la
        atual.setProximo(novoNo);
    }
    //imprimir
    public void imprimirListaLigada() {
        System.out.println("Elementos da lista ligada:");
        NoAluno atual = this.primeiro;
        while(atual != null) {
            System.out.println(atual.getAluno());
            atual = atual.getProximo();
        }
    }
    // buscar por nome
    public boolean buscaAluno(String nome) {
        NoAluno atual = this.primeiro;
        while (atual != null) {
            if(atual.getAluno().getNome().equals(nome)){
                System.out.println(atual.getAluno());
                return true;
            }

            atual = atual.getProximo();
        }

        return false;
    }

    @Override
    public String toString() {
        return "ListaLigada{" +
                "primeiro=" + primeiro +
                ", tamanho=" + tamanho +
                '}';
    }
}
