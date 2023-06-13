package ListaB_Ex02_Caixa;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------- CAIXA AUTOMÁTICO -----------------------------");

        System.out.println("Quantos operações você deseja realizar? ");
        int numOperacoes = scanner.nextInt();

        for (int i = 1; i <= numOperacoes; i++) {
            System.out.println("\nOperação " + i);
            System.out.print("Digite 'C' para crédito ou 'D' para débito: ");
            String tipo = scanner.next();

            if (tipo.equalsIgnoreCase("C")) {
                System.out.print("Digite o valor do crédito: ");
                double valor = scanner.nextDouble();
                caixa.credito(valor);
            } else if (tipo.equalsIgnoreCase("D")) {
                System.out.print("Digite o valor do débito: ");
                double valor = scanner.nextDouble();
                caixa.debito(valor);
            } else {
                System.out.println("Opção inválida!");
                break;
            }
        }
        System.out.println("\nSaldo final: R$" + caixa.saldoAtual());
    }

}
