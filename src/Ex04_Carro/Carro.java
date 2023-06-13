package Ex04_Carro;

public class Carro {
    Integer qntPortas;
    String modelo;
    String marca;
    Double potencia;
    String estadoCarro = "Desligado";

    public Carro(Integer qntPortas, String modelo, String marca, Double potencia, String estadoCarro) {
        this.qntPortas = qntPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void ligarCarro() {
        estadoCarro = "Ligado";
        System.out.println("O carro está ligado.");
    }

    public void desligarCarro() {
        estadoCarro = "Desligado";
        System.out.println("O carro está desligado.");
    }

    public void exibirCaracteristicas() {
        System.out.println("Quantidade de portas:" + qntPortas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Potencia: " + potencia);
        System.out.println("Estado: " + estadoCarro);
    }
}
