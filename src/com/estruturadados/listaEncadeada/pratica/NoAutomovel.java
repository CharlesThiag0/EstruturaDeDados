package com.estruturadados.listaEncadeada.pratica;

import java.time.LocalDateTime;

public class NoAutomovel {
    private Automovel inicio;
    private NoAutomovel proximo;
    private int totalDonos;

    public NoAutomovel(Automovel inicio) {
        this.inicio = inicio;
        this.totalDonos++;
    }

    public Automovel getInicio() {
        return inicio;
    }

    public NoAutomovel getProximo() {
        return proximo;
    }

    public int getTotalDonos() {
        return totalDonos;
    }

    public void setProximo(NoAutomovel proximo) {
        this.proximo = proximo;
    }

    public void novoProprietario(String comprador, Double preco){
        NoAutomovel atual = this;

        // Percorre até o último nó na lista
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        // Cria um novo automóvel com o comprador e preço atualizados
        Automovel novoAutomovel = new Automovel(
                this.inicio.getVeiculo(),
                this.inicio.getId(),
                preco,
                LocalDateTime.now(),
                comprador);

        // Adiciona o novo automóvel ao final da lista
        atual.setProximo(new NoAutomovel(novoAutomovel));
        this.totalDonos++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoAutomovel atual = this;

        while (atual != null) {
            sb.append("NoAutomovel{Comprador=").append(atual.getInicio()).append("}\n");
            atual = atual.getProximo();
        }
        sb.append("Total de donos: " + this.totalDonos);

        return sb.toString();
    }
}
