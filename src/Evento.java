import java.util.ArrayList;
import java.util.Date;

public abstract class Evento implements RelatorioReceita{

    private String nome;
    private String local;
    private int precoIngresso;
    protected int quantiaIngressos;
    private Date data;
    protected ArrayList<Ingresso> ingressos_V;

    Evento(String nome,String local, Date data,int precoIngresso){

        this.nome = nome;
        this.local = local;
        this.data = new Date();
        this.precoIngresso = precoIngresso;
        this.ingressos_V = new ArrayList<>();
    }

    public double valor_Total(){
        double soma = 0;
        for(Ingresso atual : this.ingressos_V){
            if(atual != null){
                soma += atual.valor;
            }
        }
        return soma;
    }

    public int assentos_Disp() {

        return quantiaIngressos - ingressos_V.size();
    }

    public abstract void add_I(Ingresso novo_I);

    public int ingressos_Disp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if(atual != null && atual.tipo == 'C') {
                quant++;
            }
        }
        return assentos_Disp()-quant;
    }

    public int ingressos_MeiaDisp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if(atual != null && atual.tipo == 'M') {
                quant++;
            }
        }
        return assentos_Disp()-quant;
    }

    public int ingressos_VipDisp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if(atual != null && atual.tipo == 'V') {
                quant++;
            }
        }
        return assentos_Disp()-quant;
    }

    @Override
    public double somaTotal_Receita(){
        double somaTotal = 0;
        for(Ingresso ingresso : ingressos_V){
            if(ingresso !=  null){
                somaTotal += ingresso.valor;
            }
        }
        return somaTotal;
    }


    @Override
    public String toString(){
        return "==== Receita do Evento ====\nEvento: "+nome+"\nData: "+data+"\nLocal: "+local+"\nTotal da Receita: "+somaTotal_Receita()+"\n===========================";
    }

    @Override
    public void  extrato_Receita(){
        System.out.println(toString());
    };

}