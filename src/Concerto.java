
import javax.swing.*;

public class Concerto extends Evento {
    Concerto(String nome, String hora, String local, String data, double precoIngresso) {
        super(nome, hora, local, data, precoIngresso);
        super.quantiaIngressos = 150;
    }

    @Override
    public void add_I(Ingresso novo_I) {
        if (ingressos_V.size() < quantiaIngressos) {
            if (novo_I.tipo == 'V' && ingressos_VipDisp() < quantiaIngressos * 0.1) {
                this.ingressos_V.add(novo_I);
            } else if (novo_I.tipo == 'C' || novo_I.tipo == 'M') {
                this.ingressos_V.add(novo_I);
            } else {
                JOptionPane.showMessageDialog(null, "Os ingressos VIP já esgotaram :(", "*ERRO*", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public double somaTotal_Receita() {
        return 0;
    }

    @Override
    public void extrato_Receita() {

    }
}
