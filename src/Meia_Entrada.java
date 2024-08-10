import java.util.Date;

public class Meia_Entrada extends Ingresso {
    Meia_Entrada(Date data_venda, double valor, char tipo) {
        super(data_venda, valor / 2, 'M');
    }
}
