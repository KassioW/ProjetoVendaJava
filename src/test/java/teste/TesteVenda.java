package teste;

import model.Produto;
import service.Venda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author kwosilva
 */
public class TesteVenda {

    @Test
    
    
    public void testCalcularTotal() {
        Produto[] produtos = {
            new Produto("Produto 1", 2, 10.0),
            new Produto("Produto 2", 3, 15.0),
            new Produto("Produto 3", 1, 25.0)
        };

        Venda venda = new Venda(produtos);

        double totalEsperado = 2 * 10.0 + 3 * 15.0 + 1 * 25.0;
        assertEquals(90, venda.calcularTotal());
    }
}
