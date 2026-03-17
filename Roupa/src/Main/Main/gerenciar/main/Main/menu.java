package Main.Main.gerenciar.main.Main;

import Main.Main.gerenciar.GerenciarProdutos;
import Main.Main.gerenciar.Produto;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarProdutos gp = new GerenciarProdutos();
        int opcao;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    gp.cadastrarProduto(new Produto(id, nome, preco, quantidade));
                    break;
                case 2:
                    gp.listarProdutos();
                    break;
                case 3:
                    System.out.print("ID do produto: ");
                    int idAtt = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo nome: ");
                    String nomeAtt = sc.nextLine();

                    System.out.print("Novo preço: ");
                    double precoAtt = sc.nextDouble();

                    System.out.print("Nova quantidade: ");
                    int qtdAtt = sc.nextInt();

                    gp.atualizarProduto(idAtt, nomeAtt, precoAtt, qtdAtt);
                    break;
                case 4:
                    System.out.print("ID para remover: ");
                    int idRem = sc.nextInt();
                    gp.removerProduto(idRem);
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
}
