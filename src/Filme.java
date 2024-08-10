import javax.swing.*;

public class Filme extends Evento {
    Filme(String nome, String hora, String local, String data, double precoIngresso) {
        super(nome, hora, local, data, precoIngresso);
        super.quantiaIngressos = 200;
    }

    @Override
    public void add_I(Ingresso novo_I) {
        if (ingressos_V.size() < quantiaIngressos) {
            if (novo_I.tipo != 'V') {
                this.ingressos_V.add(novo_I);
            } else {
                JOptionPane.showMessageDialog(null, "Ingressos VIP não estão disponíveis para este tipo de evento!", "*ERRO*", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public double somaTotal_Receita() {
        return 0;
    }
}
