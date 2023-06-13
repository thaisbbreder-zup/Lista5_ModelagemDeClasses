package Ex04_Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-------------------------  SISTEMA LIGA/DESLIGA CARRO  -------------------------");

        Carro carro1 = new Carro(5, "SUV", "Ford", 2.5, "Desligado");

        carro1.exibirCaracteristicas();

        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("Voê deseja ligar o carro? (SIM ou NAO)");
        String simOuNao = entradaDoUsuario.next();

        if (simOuNao.equals("SIM")) {
            System.out.println("O carro será ligado...");
            System.out.println("..........3.......2.........1.......");
            carro1.ligarCarro();
        } else {
            carro1.desligarCarro();
        }

        System.out.println("------------------------------------\n");
        carro1.exibirCaracteristicas();
    }
}
