package Ex01_Bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------------");
        System.out.print("\n PEDIDO DE BOLAS");

        // Instanciando objetos da classe Bola
        Bola bola1 = new Bola("Azul", "Nike", "Borracha", 20.0, 10.0);
        Bola bola2 = new Bola("Branca", "Adidas", "Couro", 25.0, 15.0);
        Bola bola3 = new Bola("Rosa", "Puma", "Couro", 22.0, 12.0);

        bola1.exibirCaracteristicas();
        bola2.exibirCaracteristicas();
        bola3.exibirCaracteristicas();

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("\n---------------------------------------------");
        System.out.print("\n Você gostaria de alterar a cor de todas bolas? (Digite S para sim e N para não) ");
        String simOuNao = entradaDoUsuario.next();

        if (simOuNao.equalsIgnoreCase("S")) {
            // Executando métodos da classe Bola nos objetos criados
            System.out.print("\nInforme a nova cor para as bolas: ");
            String entradaNovaCor = entradaDoUsuario.next();

            // Executando métodos da classe Bola nos objetos criados
            System.out.println(" ------------- Bola 1 ------------- ");
            System.out.print("Cor antiga: ");
            bola1.mostraCor();
            bola1.trocaCor(entradaNovaCor);
            System.out.print("Cor atual: ");
            bola1.mostraCor();

            System.out.println(" ------------- Bola 2 ------------- ");
            System.out.print("Cor antiga: ");
            bola2.mostraCor();
            bola2.trocaCor(entradaNovaCor);
            System.out.print("Cor atual: ");
            bola2.mostraCor();

            System.out.println(" ------------- Bola 3 ------------- ");
            System.out.print("Cor antiga: ");
            bola3.mostraCor();
            bola3.trocaCor(entradaNovaCor);
            System.out.print("Cor atual: ");
            bola3.mostraCor();
        } else {
            System.out.println("Ok, vamos manter o pedido da forma como está atualmente.");
        }

        bola1.exibirCaracteristicas();
        bola2.exibirCaracteristicas();
        bola3.exibirCaracteristicas();
    }
}
