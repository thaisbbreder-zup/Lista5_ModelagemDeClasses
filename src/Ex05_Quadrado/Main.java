package Ex05_Main;

import Ex05_Quadrado.Quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------------");
        System.out.println("\n AREA DO QUADRADO");

        Quadrado quadrado = new Quadrado();
        quadrado.mudarLado(5.0);
        System.out.println("\nLado do quadrado: " + quadrado.retornarLado());

        double area = quadrado.calcularArea();
        System.out.println("Área do quadrado: " + area);

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("\nInforme o novo tamanho para o lado do quadrado: ");
        double novoTamanho = entradaDoUsuario.nextDouble();
        quadrado.mudarLado(novoTamanho);
        System.out.println("Novo lado do quadrado: " + quadrado.retornarLado());

        area = quadrado.calcularArea();
        System.out.println("Nova área do quadrado: " + area);
    }
}
