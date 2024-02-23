package com.estruturadados.fila.testa;

import com.estruturadados.fila.FilaComPrioridade;
import com.estruturadados.fila.Paciente;

public class TesteFilaPrioritaria {
    public static void main(String[] args) {

        FilaComPrioridade<Integer> testeFila = new FilaComPrioridade<>();

        testeFila.enfileira(1);
        testeFila.enfileira(3);
        testeFila.enfileira(2);

        System.out.println(testeFila);
    }
}
