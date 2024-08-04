import java.util.Date;

public class Vip extends Ingresso{
    Vip(Date data_venda, double valor, char tipo){
        super(new Date(), valor*2, 'V');
    }
}
