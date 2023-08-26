import javax.swing.*;

public class Exec_10 {

    static int numeroDigitado, i = 1;

    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println(" " + numeroDigitado);
            i++;

        }
    }
}

