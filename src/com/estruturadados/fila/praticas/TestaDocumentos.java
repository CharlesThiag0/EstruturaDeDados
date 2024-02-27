package com.estruturadados.fila.praticas;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestaDocumentos {
    public static void main(String[] args) {

        Queue<Documentos> documentosQueue = new PriorityQueue<>(new Comparator<Documentos>() {
            @Override
            public int compare(Documentos o1, Documentos o2) {
                return Integer.valueOf(o1.getFolhas()).compareTo(o2.getFolhas());
            }
        });

        documentosQueue.add(new Documentos("HarryPoter", 1000));
        documentosQueue.add(new Documentos("HarryPotter2",2000));
        documentosQueue.add(new Documentos("HarryPotter5", 9000));
        documentosQueue.add(new Documentos("HarryPotter4", 8000));
        documentosQueue.add(new Documentos("HarryPotter3", 5000));

        while (!(documentosQueue.isEmpty())) {
            System.out.println("Imprimindo " + documentosQueue.remove());
            try{
                Thread.sleep(1 * documentosQueue.peek().getFolhas());
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
