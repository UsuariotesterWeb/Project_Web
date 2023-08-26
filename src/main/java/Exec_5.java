import javax.swing.*;

public class Exec_5 {
    static int primeiraNota, segundaNota, mediaNotas;

    public static void main(String[] args) {

        primeiraNota = Integer.parseInt(JOptionPane.showInputDialog("Informe a Primeira nota"));
        segundaNota = Integer.parseInt(JOptionPane.showInputDialog("Informe a Segunda nota"));
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) {
            System.out.println("Aprovado !");
        }
        if (mediaNotas < 5) {
            System.out.println("Reprovado !");
        } else
            System.out.println("Ficou para exame !");
    }
}


