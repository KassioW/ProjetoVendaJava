package model;

/**
 *
 * @author kwosilva
 */

// construindo a classe produto e definindo seus atributos
public class Produto {
    
    private String nome;
    private int quantidade;
    private double valorUnitario;
    
    public Produto(String nome, int quantidade, double valorUnitario) {
        
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        
    }
    
    // getters e setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    
    
}
