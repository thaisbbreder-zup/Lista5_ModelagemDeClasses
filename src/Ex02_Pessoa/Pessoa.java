package Ex02_Pessoa;

public class Pessoa {

    // atributos
    String nome;
    Integer idade;
    Double peso;
    Double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // método para envelhecer
    public void envelhecer(Integer novaIdade) {
        idade = novaIdade;
    }

    // método para engordar
    public void engordar(Double ganhoPeso) {
        peso += ganhoPeso;
    }

    // método para emagrecer
    public void emagrecer(Double perdaPeso) {
        peso += perdaPeso;
    }

    // método para crescer
    public void crescer(Double crescimento) {
        altura += crescimento;
    }

    // Método para exibir as características
    public void exibirCaracteristicas() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

}
