package com.estruturadados.fila;

public class Paciente/* implements Comparable<Paciente>*/ {
    private String nome;
    private Integer prioridade;

    public Paciente(String nome, Integer prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente (){}

    public String getNome() {
        return nome;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }

   /* @Override
    public int compareTo(Paciente o) {

        if(this.prioridade > o.getPrioridade()){
            return 1;
        } else if(this.prioridade < o.getPrioridade()) {
            return  -1;
        }

        return 0;
    }*/
}
