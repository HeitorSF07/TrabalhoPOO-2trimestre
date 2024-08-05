import java.util.Date;
public class Meia_Entrada extends Ingresso{
    Meia_Entrada(Date data_venda, double valor, char tipo){

        super(new Date(), valor/2, 'M');
    }
}
