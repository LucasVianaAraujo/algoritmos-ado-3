import javax.swing.JOptionPane;

public class MainMenu {
    public static void main(String[] args) {
        int opcao;

        do {
            String menu = "=== MENU PRINCIPAL ===\n\n"
                    + "1 - Listar (Iterativo)\n"
                    + "2 - Somar Recursivo (entre X e Y)\n"
                    + "3 - Listar Recursivo 2 (Crescente)\n"
                    + "4 - Fatorial Duplo (recursivo)\n"
                    + "5 - Fibonacci (Recursivo)\n"
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
                    double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X:").replace(",", "."));
                    double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y:").replace(",", "."));
                    if (x > y) {
                        double aux = x;
                        x = y;
                        y = aux;
                    }
                    double soma = somar(x, y);
                    JOptionPane.showMessageDialog(null, "Soma de " + x + " até " + y + " = " + soma);
                    break;

                case 3:
                    int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
                    break;

                case 4:
                    int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para o Fatorial:"));
                    exibeResultado(fat(n4));
                    break;
                    
                case 5:
                    int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número o Fibonacci:"));
                    int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite de Termos"));
                    String msg = "Termo " + n5 + ": " + fib(n5)
                       + "\nSérie: " + serie(limite);
                     JOptionPane.showMessageDialog(null, msg);
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

    // Soma recursiva enquanto não passar de y
    public static double somar(double x, double y) {
        if (x > y) {          // passar do limite, não soma mais nada
            return 0;
        }
        return x + somar(x + 1, y);  // passo recursivo: soma x e chama para o próximo
    }

    // Fibonacci
    public static int fib(int num){
        int limite = 100;
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }
        return fib(num-1) + fib(num-2);
        
    }

    public static String serie (int limite){
          String resultado = " ";
        for (int i = 0; i < limite; i++) {
            resultado += fib(i) + " ";
        }
        return resultado;
    }
    //Termino

    //Fatorial Duplo 
        public static int fat(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * fat(num - 2);
    }

    public static void exibeResultado(int num){
        JOptionPane.showMessageDialog(null,"O Resultado do Fatorial é: "+num);
    }
    //Termino
}