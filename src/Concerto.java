import java.util.Date;

public class Concerto extends Evento{
    Concerto(String nome, String local, Date data, int precoIngresso){
        super(nome, local, data, precoIngresso);
        super.quantiaIngressos = 150;
    }

    public void  add_I( Ingresso novo_I){
        if(ingressos_V.size() <= quantiaIngressos){
            if(novo_I.tipo == 'V' && ingressos_VipDisp() <= quantiaIngressos*0.1){
                this.ingressos_V.add(novo_I);
            }else{
                this.ingressos_V.add(novo_I);
            }
        }
    }

}
