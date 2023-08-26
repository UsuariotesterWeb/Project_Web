import javax.swing.*;

public class Exec_7 {
    static double salario, salarioLiquido, impostoRenda;

    public static void main(String[] args) {
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario:"));

        if (salario >= 0 && salario <= 1903.98) {
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 1903.98 && salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.80;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.33;
            salarioLiquido = salario - impostoRenda;
        }
        else if (salario >= 4664.69){
            impostoRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoRenda;
        }
        System.out.println("Seu salario Bruto sera: R$" + salario);
        System.out.println("Seu salario Liquido sera: R$" + salarioLiquido);
        System.out.println("O valor a ser pago de IR sera: R$" + impostoRenda);
    }

}
