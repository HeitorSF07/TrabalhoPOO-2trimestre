import java.util.Date;
public class Ingresso {
    Date data_venda;
    double valor;
    char tipo;

    Ingresso(Date data_venda, double valor, char tipo){
        this.data_venda = new Date();
        this.valor = valor;
        this.tipo = 'C';
    }
}
