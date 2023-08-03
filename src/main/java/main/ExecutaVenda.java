package main;
import java.util.Scanner;
import model.Produto;
import service.Venda;
        
/**
 *
 * @author kwosilva
 */

// declara os produtos, executa a venda e imprime no terminal
public class ExecutaVenda {
 public static void main(String[] args) {
        // criando um scaner pra enfeitar
     
     Scanner scanner = new Scanner(System.in);

        Produto[] produtos = {
            new Produto("Produto 1", 10, 5.0),
            new Produto("Produto 2", 8, 7.5),
            new Produto("Produto 3", 15, 3.0)
        };

       // dando vida para o scanner
        
        System.out.println("Bem-vindo à nossa loja!");

        for (Produto produto : produtos) { 
            System.out.println("Produto: " + produto.getNome());
        }

        System.out.print("Selecione o número do produto que deseja comprar: ");
        int produtoSelecionado = scanner.nextInt();

        if (produtoSelecionado < 1 || produtoSelecionado > produtos.length) { //  verifica se está selecionando o produto corretamente, se n retorna como produto invalido no terminal
            System.out.println("Produto inválido. Encerrando o programa.");
            return;
        }

        Produto produtoEscolhido = produtos[produtoSelecionado - 1]; // armazena o produto escolhido pelo cliente

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        if (quantidade <1 || quantidade > produtoEscolhido.getQuantidade()){ // se a quantidade de produtos for menor que 1 ou maior q a disponivel retorna quantidade invalida no terminal
            
            System.out.println("Quantidade inválida. Encerrando o programa.");
            return;
        }
         // realizando a venda do produto escolhido
        Produto[] produtosSelecionados = {produtoEscolhido};
        Venda venda = new Venda(produtosSelecionados);
        double total = venda.calcularTotal();

        // imprimindo no terminal usando quebra de linhas
        System.out.println("\n===== Resumo da Compra =====");
        System.out.println("Produto: " + produtoEscolhido.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$" + produtoEscolhido.getValorUnitario());
        System.out.println("Subtotal: R$" + (produtoEscolhido.getValorUnitario() * quantidade));
        System.out.println("============================");
    }
}