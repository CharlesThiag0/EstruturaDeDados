package com.estruturadados.listaEncadeada.pratica;

public class FusaoDuasListasOrdenadas {

    public static void main(String[] args) {
        NoLista noLista1 = new NoLista(1);
        noLista1.setProximo(new NoLista(3));
        noLista1.getProximo().setProximo(new NoLista(5));
       // System.out.println(noLista1);

        NoLista noLista2 = new NoLista(2);
        noLista2.setProximo(new NoLista(4));
        noLista2.getProximo().setProximo(new NoLista(6));
       // System.out.println(noLista2);

        NoLista listaFundiada = fundir(noLista1, noLista2);
        System.out.println(listaFundiada.toString());
    }
    public static NoLista fundir(NoLista noLista1, NoLista noLista2) {
        // fazer a comparação baseado no elemento do tipo integer com os parametros puxando os No1 e No2

        NoLista dummy = new NoLista(0);
        NoLista noAtual = dummy;

        while(noLista1 != null && noLista2 != null){
            if(noLista1.getElemento() < noLista2.getElemento()){
                noAtual.setProximo(noLista1);
                noLista1 = noLista1.getProximo();
            } else {
                noAtual.setProximo(noLista2);
                noLista2 = noLista2.getProximo();
            }
            noAtual = noAtual.getProximo();
        }

       // Verificar se uma das listas ainda possui elementos e anexar o restante à lista fundida
        if (noLista1 != null) {
            noAtual.setProximo(noLista1);
        } else {
            noAtual.setProximo(noLista2);
        }

        return dummy.getProximo();
    }
}

