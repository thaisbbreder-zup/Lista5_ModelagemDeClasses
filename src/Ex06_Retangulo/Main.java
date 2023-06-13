package Ex06_Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------------");
        System.out.println("\nÁREA DO RETÂNGULO");

        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Comprimento do retângulo: " + retangulo.retornarComprimento());
        System.out.println("Largura do retângulo: " + retangulo.retornarLargura());

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("\nInforme o novo tamanho para o comprimento do retângulo: ");
        double novoComprimento = entradaDoUsuario.nextDouble();
        System.out.print("Informe o novo tamanho para a largura do retângulo: ");
        double novaLargura = entradaDoUsuario.nextDouble();

        System.out.println("\n---------------------------------------------");
        System.out.println("\nÁREA DO RETÂNGULO ATUALIZADA");

        retangulo.mudarLados(novoComprimento, novaLargura);
        System.out.println("Novo comprimento do retângulo: " + retangulo.retornarComprimento());
        System.out.println("Nova largura do retângulo: " + retangulo.retornarLargura());

        area = retangulo.calcularArea();
        perimetro = retangulo.calcularPerimetro();
        System.out.println("Nova área do retângulo: " + area);
        System.out.println("Novo perímetro do retângulo: " + perimetro);
    }
}
