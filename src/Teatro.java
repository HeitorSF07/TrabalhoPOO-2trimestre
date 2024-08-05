import java.util.Date;

public class Teatro extends Evento{
    Teatro(String nome, String local, Date data, int precoIngresso){
        super(nome, local, data, precoIngresso);
        super.quantiaIngressos = 250;
    }

    public void add_I(Ingresso novo_I){
        if(ingressos_V.size()<= quantiaIngressos){
            if(novo_I.tipo == 'M' && ingressos_MeiaDisp() <= quantiaIngressos*0.2){
                this.ingressos_V.add(novo_I);
            }else if(novo_I.tipo=='V' || novo_I.tipo == 'C'){
                this.ingressos_V.add(novo_I);
            }
        }
    }
}

