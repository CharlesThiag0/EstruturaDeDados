package com.estruturadados.vetor.testa;

import com.estruturadados.vetor.Vetor;
import com.estruturadados.vetor.testa.contato.Contato;

public class Aplicacao2 {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Charles", "859832256543", "charles1@icloud.com");
        Contato contato2 = new Contato("Thiago", "859932256543", "charles2@icloud.com");
        Contato contato3 = new Contato("Charles", "859992256543", "charles3@icloud.com");

        Contato contato4 = new Contato("Charles", "859832256543", "charles1@icloud.com");

        Vetor vetor = new Vetor(3);

        try {
            vetor.adicionarElemento(contato1);
            vetor.adicionarElemento(contato2);
            vetor.adicionarElemento(contato3);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(vetor);

        if(vetor.busca(contato4) >= 0) {
            System.out.println("Sim está");
        } else {
            System.out.println("Não está");
        }
    
    }
}
