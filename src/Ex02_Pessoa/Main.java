package Ex02_Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciando objetos da classe
        Pessoa pessoa1 = new Pessoa("Thaís Braga Breder", 25, 48, 1.56);

        //exibindo caracteristicas iniciais
        pessoa1.exibirCaracteristicas();

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\n------------ Vamos atualizar os dados! ------------");

        System.out.print("Você deseja atualizar a idade? S - sim ou N - não");
        String simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("S")) {
            System.out.print("\nInforme a nova idade: ");
            Integer idade = entradaDoUsuario.nextInt();
            pessoa1.envelhecer(idade);
            if (idade < 21) {
                pessoa1.crescer(0.5);
            }
        } else {
            System.out.println("Ok! vamos manter a idade! ");
        }

        System.out.println("A pessoa emagreceu? S para sim e N para não ");
        simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("S ")) {
            System.out.print("\nInforme quantos kg foram perdidos: ");
            Double peso = entradaDoUsuario.nextDouble();
            pessoa1.emagrecer(peso);
        } else {
            System.out.print("A pessoa engordou? S para sim e N para não ");
            simOuNao = entradaDoUsuario.next();
            if (simOuNao.equalsIgnoreCase("S")) {
                System.out.print("\nInforme quantos kg foram engordados: ");
                Double peso = entradaDoUsuario.nextDouble();
                pessoa1.engordar(peso);
            } else {
                System.out.println("Ok! Vamos manter o peso. ");
            }
        }
        System.out.println("--------------------- DADOS ATUALIZADOS ---------------------");
        pessoa1.exibirCaracteristicas();
    }
}

