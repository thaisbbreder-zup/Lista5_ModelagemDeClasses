package Ex03_ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Joao da Silva", 336688 - 1, 15000);
        System.out.println("\n------------------- CONTA CORRENTE -------------------");

        //exibindo conta inicial
        conta1.exibirConta();

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\n------------ OPERAÇÕES EM CONTA CORRENTE ------------");

        System.out.println("Você deseja depositar na sua conta? SIM ou NAO");
        String simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("SIM")) {
            System.out.print("\nDigite o valor a ser depositado: ");
            Double novoSaldo = entradaDoUsuario.nextDouble();
            conta1.depositar(novoSaldo);
        } else {
            System.out.println("OK! Essa operação não será realizada.");
        }

        System.out.println("\nVocê deseja sacar? SIM ou NAO ");
        simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("SIM")) {
            System.out.print("\nDigite o valor a ser sacado: ");
            Double novoSaldo = entradaDoUsuario.nextDouble();
            conta1.sacar(novoSaldo);
        } else {
            System.out.println("OK! Essa operação não será realizada.");
        }

        System.out.println("\nClique em ENTER para confirmar a operação");
        entradaDoUsuario.nextLine();

        System.out.println("\n--------------------- SALDO DA CONTA ATUAL ---------------------");
        conta1.exibirConta();
    }
}
