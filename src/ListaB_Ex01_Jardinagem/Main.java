package ListaB.Ex01_Jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------ Vamos calcular os valores! ------------");

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Qual o nome do jardim? ");
        String nomeJardim = entradaDoUsuario.nextLine();

        System.out.print("Informe a quantidade de metros do jardim: ");
        int qtdMetros = entradaDoUsuario.nextInt();

        System.out.print("Informe a quantidade de plantas no jardim: ");
        int qtdPlantas = entradaDoUsuario.nextInt();

        System.out.print("Informe a quantidade de metros de grama no jardim: ");
        int qtdMetrosGrama = entradaDoUsuario.nextInt();

        System.out.print("Informe a quantidade de gramas de adubo a ser usado por cada 2 metros de grama: \n");
        int gramaAdubo = entradaDoUsuario.nextInt();

        Jardinagem jardinagem = new Jardinagem(nomeJardim, qtdMetros, qtdPlantas, qtdMetrosGrama, gramaAdubo, 2, 5, 10);

        System.out.print("-----------------------------------------------------------------------------------\n");

        jardinagem.exibirCaracteristicas();

        double aduboUtilizado = jardinagem.usarAdubo();
        System.out.println("Quantidade de adubo utilizado: " + aduboUtilizado + " gramas.");
    }

}
