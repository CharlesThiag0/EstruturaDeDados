package com.estruturadados.listaEncadeada.pratica;

public class MainAluno {
    public static void main(String[] args) {
        // Teste da implementação da lista ligada
        ListaLigada lista = new ListaLigada();

        // Inserir alunos
        lista.addFirst(new Aluno("João", 20, 7.5));
        System.out.println(lista);
        lista.addFirst(new Aluno("Maria", 19, 8.0));
        System.out.println(lista);
        lista.addFirst(new Aluno("Pedro", 21, 6.0));
        System.out.println(lista);

        lista.addEnd(new Aluno("J2", 10, 1.5));
        System.out.println(lista);




    }
}
