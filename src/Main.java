import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();

        Evento moana = new Filme("Moana2", "17:30", "Del Rey", "28/11/2024", 35.00);
        Evento PTOGQJA = new Filme("Para Todos Os Garotos Que Já Amei", "19:30", "Del Rey", "30/8/2024", 15.00);
        Evento UTG = new Teatro("Um Tal Guimarães", "17:30", "Casa De Teatro", "16/08/2024", 45.00);
        Evento orquestra = new Concerto("Orquestra", "16:00", "Sala De Minas", "20/08/2024", 50.00);

        eventos.add(moana);
        eventos.add(PTOGQJA);
        eventos.add(UTG);
        eventos.add(orquestra);

        // Simulação de venda de ingressos
        moana.add_I(new Ingresso(new Date(), 35.00, 'C'));
        moana.add_I(new Vip(new Date(), 35.00, 'V'));
        moana.add_I(new Meia_Entrada(new Date(), 35.00, 'M'));

        PTOGQJA.add_I(new Ingresso(new Date(), 15.00, 'C'));
        PTOGQJA.add_I(new Meia_Entrada(new Date(), 15.0, 'M'));

        UTG.add_I(new Ingresso(new Date(), 45.00, 'C'));
        UTG.add_I(new Vip(new Date(), 45.00, 'V'));

        orquestra.add_I(new Ingresso(new Date(), 50.00, 'C'));
        orquestra.add_I(new Vip(new Date(), 50.00, 'V'));

        // Exibição de Eventos
        double receitaTotalAcumulada = 0;
        for (Evento evento : eventos) {
            double receita = evento.somaTotal_Receita();
            receitaTotalAcumulada += receita;
            JOptionPane.showMessageDialog(null,
                    String.format("==== Evento ====\nNome: %s\nData: %s\nHora: %s\nLocal: %s\nReceita Total: R$ %.2f\nIngressos Vendidos: %d\nIngressos Disponíveis: %d\n",
                            evento.getNome(), evento.getData(), evento.getHora(), evento.getLocal(), receita, evento.ingressosVendidos(), evento.assentos_Disp()),
                    "Detalhes do Evento", JOptionPane.INFORMATION_MESSAGE);
        }

        // Exibição da receita total acumulada
        JOptionPane.showMessageDialog(null,
                String.format("Receita Total Acumulada: R$ %.2f", receitaTotalAcumulada),
                "Receita Total", JOptionPane.INFORMATION_MESSAGE);

        // Exibição de Ingressos para um evento específico (exemplo: "Moana2")
        for (Evento evento : eventos) {
            if (evento.getNome().equals("Moana2")) {
                evento.listarIngressosVendidos();
            } else if (evento.getNome().equals("Para Todos Os Garotos Que Já Amei")) {
                evento.listarIngressosVendidos();
            } else if (evento.getNome().equals("Um Tal Guimarães")) {
                evento.listarIngressosVendidos();
            } else if (evento.getNome().equals("Orquestra")) {
                evento.listarIngressosVendidos();
            }

        }
    }
}

