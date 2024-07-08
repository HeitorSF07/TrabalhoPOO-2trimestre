import java.util.Date;

public abstract class Evento {

    private String nome;
    private String local;
    private int precoIngresso;
    protected int quantiaIngressos;
    private Date data;

    Evento(String nome,String local, Date data,int precoIngresso, int quantiaIngressos){

        this.nome = nome;
        this.local = local;
        this.data = new Date();
        this.precoIngresso = precoIngresso;
        this.quantiaIngressos = quantiaIngressos;
    }
}
