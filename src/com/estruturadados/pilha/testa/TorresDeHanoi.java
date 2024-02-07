package com.estruturadados.pilha.testa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TorresDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de discos: ");
        int quantidadeDiscos = scanner.nextInt();

        if (quantidadeDiscos < 1) {
            System.out.println("A quantidade de discos deve ser pelo menos 1.");
            return;
        }

        List<Integer> torreA = new ArrayList<>();
        List<Integer> torreB = new ArrayList<>();
        List<Integer> torreC = new ArrayList<>();

        // Adicionar discos à torre A
        for (int i = quantidadeDiscos; i > 0; i--) {
            torreA.add(i);
        }

        // Exibir o estado inicial das torres
        System.out.println("Estado inicial das torres:");
        exibirTorres(torreA, torreB, torreC);

        // Resolver as Torres de Hanói
        int movimentos = resolverTorresDeHanoi(quantidadeDiscos, 'A', 'C', 'B', torreA, torreB, torreC);

        // Exibir o estado final das torres
        System.out.println("Parabéns! Você concluiu as Torres de Hanói em " + movimentos + " movimentos.");

        scanner.close();
    }

    // Função recursiva para resolver as Torres de Hanói
    public static int resolverTorresDeHanoi(int n, char origem, char destino, char intermediaria, List<Integer> torreOrigem, List<Integer> torreDestino, List<Integer> torreIntermediaria) {
        int movimentos = 0;

        if (n > 0) {
            movimentos += resolverTorresDeHanoi(n - 1, origem, intermediaria, destino, torreOrigem, torreIntermediaria, torreDestino);

            // Mover disco
            torreDestino.add(torreOrigem.remove(torreOrigem.size() - 1));
            movimentos++;

            // Exibir o estado atual das torres
            exibirTorres(torreOrigem, torreIntermediaria, torreDestino);

            movimentos += resolverTorresDeHanoi(n - 1, intermediaria, destino, origem, torreIntermediaria, torreDestino, torreOrigem);
        }

        return movimentos;
    }

    // Função para exibir o estado das torres
    public static void exibirTorres(List<Integer> torreA, List<Integer> torreB, List<Integer> torreC) {
        System.out.println("Torre A: " + torreA);
        System.out.println("Torre B: " + torreB);
        System.out.println("Torre C: " + torreC);
        System.out.println("-------------------------");
    }
}
