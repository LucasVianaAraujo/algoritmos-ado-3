import javax.swing.JOptionPane;

public class FatDuplo {

    public static int fat(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * fat(num - 2);
    }

    public static void exibeResultado(int num){
        JOptionPane.showMessageDialog(null,"O Resultado do Fatorial é: "+num);
    }
}