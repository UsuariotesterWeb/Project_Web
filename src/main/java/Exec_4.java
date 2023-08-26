import javax.swing.*;

public class Exec_4 {
    static int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaoMedia;

    public static void main(String[] args) {

        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo  valor: "));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro valor: "));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = valorInformado1 - valorInformado2 - valorInformado3;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = (soma / 3);

        System.out.println("\n Soma: " + soma + "\n Subtracao: " + subtracao + "\n Multiplicacao: " + multiplicacao + "\n Media: " + divisaoMedia);
    }
}
