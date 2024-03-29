package com.estruturadados.listaEncadeada.pratica;

import java.time.LocalDateTime;

public class Automovel {

    private  String veiculo;
    private  Long id;
    private  Double preco;
    private  LocalDateTime dateTime;
    private  String dono;
    private Automovel proximo;

    public Automovel(String veiculo, Long id, Double preco, LocalDateTime dateTime, String dono) {
        this.veiculo = veiculo;
        this.id = id;
        this.preco = preco;
        this.dateTime = dateTime;
        this.dono = dono;
    }

    public Automovel(Automovel automovel) {
    }

    public String getVeiculo() {
        return veiculo;
    }

    public Long getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDono() {
        return dono;
    }

    public Automovel getProximo() {
        return proximo;
    }

    public void setProximo(Automovel proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Automovel[" +
                "veiculo ='" + veiculo + '\'' +
                ", id =" + id +
                ", preco=" + preco +
                ", dateTime =" + dateTime +
                ", dono ='" + dono + '\'' +
                ']';
    }
}
