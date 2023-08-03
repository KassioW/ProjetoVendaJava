/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package service;

import model.Produto;

/**
 *
 * @author kwosilva
 */
public class Venda {
    
    // criando a função que serve para armazenar produtos associados a uma venda
    private Produto[] produtos;

    // construindo a classe venda
    public Venda(Produto[] produtos) {
        this.produtos = produtos;
    }
    
    // calculando o valor total da venda somando o subtotal dos produtos
    public double calcularTotal() {
        double total = 0;
        
        // percorrendo a coleção de produtos e realizando calculos com base nas suas informações
        for (Produto produto : produtos) {
            
            total += produto.getQuantidade() * produto.getValorUnitario();
        }
        return total;
    }
    
    // imprimindo um resumo da venda no terminal e listando os produtos e seus atributos
    
    public void imprimirResumo() {
        
        System.out.println(" Resumo da Venda ");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Valor Unitário: R$" + produto.getValorUnitario());
            System.out.println("Subtotal: R$ " + (produto.getQuantidade() * produto.getValorUnitario()));
            System.out.println("------------------------"); // linha pra enfeite            
                    
        }
        
        System.out.println("Total: R$" + calcularTotal());
    }
}
