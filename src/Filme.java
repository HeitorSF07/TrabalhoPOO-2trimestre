import java.util.Date;

public class Filme extends Evento{
    Filme(String nome, String local, Date data, int precoIngresso, int quantiaIngressos){
        super(nome, local, data, precoIngresso, quantiaIngressos);
        super.quantiaIngressos = 200;
    }
}
