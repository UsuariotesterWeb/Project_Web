import javax.swing.*;

public class Exec_3 {
    static  int numeroDigitado, resultado;

    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Isira um numero que sera multiplicado: "));
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do Numero digitado é: " + resultado);
    }
}
