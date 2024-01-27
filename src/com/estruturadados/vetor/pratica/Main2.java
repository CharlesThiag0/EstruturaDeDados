package com.estruturadados.vetor.pratica;

import com.estruturadados.vetor.testa.contato.Contato;
import com.estruturadados.vetor.testa.lista.Lista;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista<Contato> contatoLista = new Lista<>(20);

        popularContato(contatoLista, 5);

        int opcao = 1;
        while (opcao != 0) {

            opcao = tabelaMenu(sc);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(contatoLista, sc);
                    break;
                case 2:
                    adicionarContatoPosicao(contatoLista, sc);
                    break;
                case 3:
                    obtemPosicao(contatoLista, sc);
                    break;
                case 4:
                    consultarContatoPosicao(contatoLista, sc);
                    break;
                case 5:
                    verificarContatoNome(contatoLista, sc);
                    break;
                case 6:
                    removerPorPosicao(contatoLista, sc);
                    break;
                case 7:
                    removerTodos(contatoLista, sc);
                    break;
                case 8:
                    System.out.printf("Tamanho: %d\n", contatoLista.getTamanho());
                    break;
                case 9:
                    System.out.println(contatoLista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("Fim do progama, usuario digitou 0");
    }

    private static int tabelaMenu(Scanner sc) {
        String entradaUsuario;
        int opcao = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("::Opções::");

            System.out.println("1- Adicionar contato no final do vetor");
            System.out.println("2- Adicionar contato em uma posição");
            System.out.println("3- Obtém contato de uma posição");
            System.out.println("4- Consulta contato por posição");
            System.out.println("5- Verifica se contato existe por nome");
            System.out.println("6- Excluir por posição");
            System.out.println("7- Excluir todos");
            System.out.println("8- Verificar tamanho do vetor");
            System.out.println("9- Imprimir vetor");
            System.out.println("0- Sair");

            try {
                entradaUsuario = sc.nextLine();
                opcao = Integer.parseInt(entradaUsuario);

                if (opcao >= 0 && opcao <= 9) {

                    entradaValida = true;
                } else {
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite uma opção válida!\n\n\n");
            }

        }

        return opcao;
    }

    private static void removerPorPosicao(Lista<Contato> contatoLista, Scanner sc) {
        try {
            contatoLista.remover(lerMensagemInt("Digite a posição a ser removida: ", sc));

            System.out.println("Contato excluido!");
        } catch (Exception exception) {
            System.out.println("Digite uma posição valida para exclusão");
        }
    }

    private static void removerTodos(Lista<Contato> contatoLista, Scanner sc) {
        try {
            if (lerMensagem("Desaja apagar tudo? s/n", sc).equals("s")) {
                System.out.println("Aplicando exclusão.. ... .");
                System.out.println("Exclusão completa");
            } else {
                System.out.println("Exclusão cancelada.. ");
            }

        } catch (Exception exception) {
            System.out.println("Digite uma posição valida para excluxão");
        }
    }

    private static void verificarContatoNome(Lista<Contato> contatoLista, Scanner sc) {
        String nome = lerMensagem("Digite o nome do contato: ", sc);
        Contato contato;

        for (int i = 0; i <= contatoLista.getTamanho(); i++) {
            contato = contatoLista.busca(i);

            if (contato.getNome().equals(nome)) {
                System.out.printf("Contato %s está em dados na posicação %d\n", nome, i);

                break;
            } else {
                System.out.println("Contato não existe!");
            }
        }
    }


    private static void consultarContatoPosicao(Lista<Contato> contatoLista, Scanner sc) {
        Contato contato = contatoLista.busca(lerMensagemInt("Digite a posição desejada: ", sc));

        try {
            System.out.println("Contato existent > .. .");
            System.out.println(contato);

        } catch (Exception exception) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoPosicao(Lista<Contato> contatoLista, Scanner sc) {
        String nome = lerMensagem("Digite o nome: ", sc);
        String telefone = lerMensagem("Digite o telefone: ", sc);
        String email = lerMensagem("Digite o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        try {
            contatoLista.adicionarElemento(contato,
                    lerMensagemInt("Digite a posição desejada", sc)/*está retornando um inteiro*/);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception exception) {
            System.out.println("Posição inválida, contato não adicionado!");
        }
    }

    private static void adicionarContatoFinal(Lista<Contato> contatoLista, Scanner sc) {
        String nome = lerMensagem("Digite o nome: ", sc);
        String telefone = lerMensagem("Digite o telefone: ", sc);
        String email = lerMensagem("Digite o email: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        contatoLista.adicionarElemento(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static int lerMensagemInt(String mensagem, Scanner sc) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(mensagem);
                num = sc.nextInt();

                entradaValida = true;
            } catch (Exception exception) {
                System.out.println("Digite novamente!");
            }
        }

        return num;
    }

    private static String lerMensagem(String mensagem, Scanner sc) {
        System.out.println(mensagem);
        String entrada = sc.nextLine();

        return entrada;
    }

    private static void obtemPosicao(Lista<Contato> contatoLista, Scanner sc) {

        try {
            Contato contato = contatoLista.busca(lerMensagemInt("Entre com a posição desejada: ", sc));

            System.out.println("Contato existente, seguem dados:");
            System.out.println(contato);

        } catch (Exception exception) {
            System.out.println("Posição inválida!");
        }
    }

    private static void popularContato(Lista<Contato> lista, int quantidade) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();

            contato.setNome("Contato" + i);
            contato.setEmail("Contato" + i + "@gmail.com");
            contato.setTelefone("999-999-9" + i);

            lista.adicionarElemento(contato);
        }
    }
}
