package Ex06_Retangulo;

public class Retangulo {
    double comprimento;
    double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarLados(double novoComprimento, double novaLargura) {
        this.comprimento = novoComprimento;
        this.largura = novaLargura;
    }

    public double retornarComprimento() {
        return comprimento;
    }

    public double retornarLargura() {
        return largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}
