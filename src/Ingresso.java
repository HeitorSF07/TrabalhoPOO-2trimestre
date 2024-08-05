import java.util.Date;
public class Ingresso implements  RelatorioReceita{
    Date data_venda;
    double valor;
    char tipo;

    Ingresso(Date data_venda, double valor, char tipo){
        this.data_venda = new Date();
        this.valor = valor;
        this.tipo = 'C';
    }

    @Override
    public String toString(){
        return "==== Receita do Ingresso ====\nData: "+data_venda+"\nTipo: "+tipo+"\nPreço: "+valor+"\n=============================";
    }

    @Override
    public double somaTotal_Receita(){
        return valor;
    }

    @Override
    public void extrato_Receita(){
        System.out.println(this.toString());
    }


}
