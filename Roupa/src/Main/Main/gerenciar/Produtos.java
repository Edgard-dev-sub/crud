package Main.Main.gerenciar;

import java.util.ArrayList;
public class GerenciarProdutos {
    private ArrayList<Produto> lista = new ArrayList<>();
    public void cadastrarProduto(Produto p) {
        lista.add(p);
    }
    public void listarProdutos() {
        System.out.println("| ID | Nome | Preco | Quantidade| Valor em Estoque |");
        for (Produto p : lista) {
            System.out.println(p);
        }
    }
    public void atualizarProduto(int id, String nome, double preco, int quantidade) {
        for (Produto p : lista) {
            if (p.getId() == id) {
                p.setNome(nome);
                p.setPreco(preco);
                p.setQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
    public void removerProduto(int id) {
        lista.removeIf(p -> p.getId() == id);
    }
}