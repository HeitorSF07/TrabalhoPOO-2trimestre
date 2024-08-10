
import java.util.ArrayList;
import javax.swing.JOptionPane;


public abstract class Evento implements RelatorioReceita {
    private String nome;
    private String hora;
    private String local;
    private double precoIngresso;
    protected int quantiaIngressos;
    private String data;
    protected ArrayList<Ingresso> ingressos_V;

    Evento(String nome, String hora, String local, String data, double precoIngresso) {
        this.nome = nome;
        this.hora = hora;
        this.local = local;
        this.data = data;
        this.precoIngresso = precoIngresso;
        this.ingressos_V = new ArrayList<>();
    }

    public double valor_Total() {
        double soma = 0;
        for (Ingresso atual : this.ingressos_V) {
            if (atual != null) {
                soma += atual.valor;
            }
        }
        return soma;
    }

    public int assentos_Disp() {
        return quantiaIngressos - ingressos_V.size();
    }

    public int ingressosVendidos() {
        return ingressos_V.size();
    }

    public abstract void add_I(Ingresso novo_I);

    public int ingressos_Disp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if (atual != null && atual.tipo == 'C') {
                quant++;
            }
        }
        return assentos_Disp() - quant;
    }

    public int ingressos_MeiaDisp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if (atual != null && atual.tipo == 'M') {
                quant++;
            }
        }
        return assentos_Disp() - quant;
    }

    public int ingressos_VipDisp() {
        int quant = 0;
        for (Ingresso atual : this.ingressos_V) {
            if (atual != null && atual.tipo == 'V') {
                quant++;
            }
        }
        return assentos_Disp() - quant;
    }

    @Override
    public double somaTotal_Receita() {
        double somaTotal = 0;
        for (Ingresso ingresso : ingressos_V) {
            if (ingresso != null) {
                somaTotal += ingresso.valor;
            }
        }
        return somaTotal;
    }

    public String getNome() {
        return this.nome;
    }

    public String getHora() {
        return this.hora;
    }

    public String getLocal() {
        return this.local;
    }

    public double getprecoIngresso() {
        return this.precoIngresso;
    }

    public String getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "==== Detalhes do Evento ====\nEvento: " + nome + "\nData: " + data + "\nLocal: " + local + "\nReceita Total: R$ " + somaTotal_Receita() + "\n===========================";
    }

    @Override
    public void extrato_Receita() {
        System.out.println(toString());
    }

    // Novo método para listar detalhes dos ingressos
    public void listarIngressosVendidos() {
        String resultado = "Detalhes dos Ingressos Vendidos para o Evento: " + getNome() + "\n";
        for (Ingresso ingresso : ingressos_V) {
            resultado += "Data de Venda: " + ingresso.data_venda + "\n";
            resultado += "Tipo de Ingresso: " + ingresso.tipo + "\n";
            resultado += "Valor: R$ " + ingresso.valor + "\n";
            resultado += "-----------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
