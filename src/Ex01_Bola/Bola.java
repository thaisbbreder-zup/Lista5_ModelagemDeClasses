package Ex01_Bola;

public class Bola {
    // atributos
    String cor;
    String marca;
    String material;
    Double velocidade;
    Double circunferencia;

    // construtor
    public Bola(String cor, String marca, String material, double velocidade, double circunferencia) {
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
        this.circunferencia = circunferencia;
    }

    public void mostraCor() {
        System.out.println(cor);
    }

    // método para trocar a cor da bola
    public void trocaCor(String novaCor) {
        cor = novaCor;
    }

    // Método para exibir as características
    public void exibirCaracteristicas() {
        System.out.println("\nCor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Material: " + this.material);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Circunferência: " + this.circunferencia);
    }
}
