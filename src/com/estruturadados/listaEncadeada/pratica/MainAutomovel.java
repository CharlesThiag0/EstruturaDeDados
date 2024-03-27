package com.estruturadados.listaEncadeada.pratica;

import java.time.LocalDateTime;

public class MainAutomovel {
    public static void main(String[] args) {
        NoAutomovel teste1 = new NoAutomovel(
                new Automovel("Corolla", 4234132412L, 180.000, LocalDateTime.now(), "Charles"));
        teste1.novoProprietario("Thiago", 170.000);
        teste1.novoProprietario("Santos", 200.000);

        System.out.println(teste1);


    }
}
