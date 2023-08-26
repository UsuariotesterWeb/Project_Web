import javax.swing.*;

public class Exec_2 {
    public static void main(String[] args) {
        int primeiroValor, segundoValor;

        primeiroValor = Integer.parseInt((JOptionPane.showInputDialog("Digite o Primeiro Valor: ")));
        segundoValor = Integer.parseInt((JOptionPane.showInputDialog("Digite o Segundo Valor: ")));
        System.out.println("Primeiro Valor Digitado " + primeiroValor);
        System.out.println("Segundo Valor Digitado " + segundoValor);
    }
}
