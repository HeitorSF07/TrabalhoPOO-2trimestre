import java.util.Date;

public class Teatro extends Evento{
    Teatro(String nome, String local, Date data, int precoIngresso, int quantiaIngressos){
        super(nome, local, data, precoIngresso, quantiaIngressos);
        super.quantiaIngressos = 250;
    }
}

