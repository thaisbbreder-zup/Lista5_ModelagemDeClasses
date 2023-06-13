package Ex05_Quadrado;

public class Quadrado {
   double tamanhoLado;
   double area;

    public void mudarLado(double novoTamanho) {

        this.tamanhoLado = novoTamanho;
    }

    public double retornarLado() {
        return tamanhoLado;
    }

    public double calcularArea() {
       return tamanhoLado * tamanhoLado;
    }
}
