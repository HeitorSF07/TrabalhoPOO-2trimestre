import java.util.Date;

public class Concerto extends Evento{
    Concerto(String nome, String local, Date data, int precoIngresso, int quantiaIngressos){
        super(nome, local, data, precoIngresso, quantiaIngressos);
        super.quantiaIngressos = 150;
    }
}
