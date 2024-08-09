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
        moana.add_I(new Ingresso(new Date(), moana.getprecoIngresso(), 'C'));
        moana.add_I(new Meia_Entrada(new Date(), moana.getprecoIngresso(), 'M'));
        orquestra.add_I(new Vip(new Date(), orquestra.getprecoIngresso(), 'V'));

        // Listar eventos e receita total
        listarEventos(eventos);
        exibirReceitaTotalAcumulada(eventos);

        // Exibir detalhes de ingressos vendidos para um evento específico
        mostrarDetalhesIngressos(moana);
    }

    private static void listarEventos(ArrayList<Evento> eventos) {
        String resultado = "Eventos:\n";
        for (Evento evento : eventos) {
            resultado += evento.toString() + "\n";
            resultado += "Ingressos Vendidos: " + evento.ingressosVendidos() + "\n";
            resultado += "Ingressos Disponíveis: " + evento.assentos_Disp() + "\n";
            resultado += "Receita: R$ " + evento.somaTotal_Receita() + "\n";
            resultado += "-----------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    private static void exibirReceitaTotalAcumulada(ArrayList<Evento> eventos) {
        double receitaTotal = 0;
        for (Evento evento : eventos) {
            receitaTotal += evento.somaTotal_Receita();
        }
        JOptionPane.showMessageDialog(null, "Receita Total Acumulada de Todos os Eventos:\n" +
                "R$ " + receitaTotal);
    }

    private static void mostrarDetalhesIngressos(Evento evento) {
        evento.listarIngressosVendidos();
    }
}
