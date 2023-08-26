import javax.swing.*;

public class Exec_9 {

    public static void main(String[] args) {
        double taxa = 0.05;
        double valorJuros = 0.0;
        double valorTotal = 0.0;
        int i = 1;

        double investimento;

        for(investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o inestmento")); i <= 10; ++i) {
            valorJuros += investimento * taxa;
        }

        System.out.println("Valor dos juros " + valorJuros);
        System.out.println("Valor investimento " + investimento);
        System.out.println("Valor total " + (valorJuros + investimento));
    }
}
