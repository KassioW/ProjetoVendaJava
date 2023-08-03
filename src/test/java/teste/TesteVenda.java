package teste;

import model.Produto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import service.Venda;

/**
 *
 * @author kwosilva
 */
public class TesteVenda {

    @Test
    
    // declarando produtos para um teste simples
    public void testCalcularTotal() {
        Produto[] produtos = {
            new Produto("Produto 1", 2, 10.0),
            new Produto("Produto 2", 3, 15.0),
            new Produto("Produto 3", 1, 25.0)
        };

        Venda venda = new Venda(produtos); // executa a venda
     
        // calculo basico do total de produtos vendidos em resumo   
        double totalEsperado = 2 * 10.0 + 3 * 15.0 + 1 * 25.0;
      assertEquals(totalEsperado, venda.calcularTotal());    }
}

