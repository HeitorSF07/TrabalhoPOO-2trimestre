import java.util.Date;

public class Vip extends Ingresso {
    Vip(Date data_venda, double valor, char tipo) {
        super(data_venda, valor * 2, tipo);
    }
}
