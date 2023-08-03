/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import model.Produto;
import service.Venda;
        
/**
 *
 * @author kwosilva
 */
public class ExecutaVenda {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Produto 1", 2, 10.0),
            new Produto("Produto 2", 3, 15.0),
            new Produto("Produto 3", 1, 25.0)
        };
        
        Venda venda = new Venda(produtos);
        venda.imprimirResumo();
    }  
    
    
}
