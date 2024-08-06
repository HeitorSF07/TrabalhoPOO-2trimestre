import javax.swing.*;
import java.util.Date;

public class Filme extends Evento{
    Filme(String nome, String local, Date data, int precoIngresso){
        super(nome, local, data, precoIngresso);
        super.quantiaIngressos = 200;
    }

    public void add_I(Ingresso novo_I){
        if(ingressos_V.size() <= quantiaIngressos){
            if(novo_I.tipo != 'V'){
                this.ingressos_V.add(novo_I);
            }else{
                JOptionPane.showMessageDialog(null, "Ingressos Vip não estão disponíveis para esse tipo de evento!","*ERRO*", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
