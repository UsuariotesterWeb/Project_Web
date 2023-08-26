import javax.swing.*;

public class Exec_6 {
    static double salario, inss;

    public static void main(String[] args) {

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario: "));

        if (salario <= 1045.00) {
            inss = salario * 0.75;
        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        }
        else if (salario >= 6101.07) {
            inss = salario * 0.14;
        }
        System.out.println("O Valor a ser pago de Inss é: R$"+ inss);
    }
}
