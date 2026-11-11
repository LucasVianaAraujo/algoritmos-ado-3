import javax.swing.JOptionPane;

public class MainMenu {
    public static void main(String[] args) {
        int opcao;

        do {
            String menu = "=== MENU PRINCIPAL ===\n\n"
                    + "1 - Listar (Iterativo)\n"
                    + "2 - Listar Recursivo 1 (Decrescente)\n"
                    + "3 - Listar Recursivo 2 (Crescente)\n"
                    + "4 - Fatorial (Iterativo)\n"
                    + "5 - Fatorial (Recursivo)\n"
                    + "0 - Sair\n\n"
                    + "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu - Exemplos do Professor",
                    JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                break;
            }

            opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1:
                    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor a ser iterado:"));
                    listar(n1);
                    break;

                case 2:
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
                    break;

                case 3:
                    int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
                    break;

                case 4:
                    int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para o Fatorial:"));
                    break;

                case 5:
                    int n5 = Integer
                            .parseInt(JOptionPane.showInputDialog("Digite o número para o Fatorial Recursivo:"));
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 0);
    }

    public static void listar(int n) {
        int valor[] = new int[n];
        String resultado = "";

        for (int i = 0; i < n; i++) {
            valor[i] = i + 1;
        }

        for (int num : valor) {
            Integer.toString(num);
            resultado += "Número: " + num + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}