import javax.swing.*;

public class Exec_8 {

    static int numeroDigitado, i = 1, resultado;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que sera multiplicado:"));

        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + "x" + i + "=" + resultado);
            i++;
        }
    }
}
