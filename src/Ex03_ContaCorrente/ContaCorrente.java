package Ex03_ContaCorrente;

public class ContaCorrente {
    String nome;
    Integer conta;
    Double saldo;

    public ContaCorrente(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;

    }

    //método para depósito
    public void depositar(Double novoSaldo) {
        saldo += novoSaldo;
    }

    //meotodo para sacar
    public void sacar(Double novoSaldo) {
        if (saldo >= novoSaldo) {
            saldo -= novoSaldo;
        } else {
            System.out.println("Saldo insuficiente para sacar");
        }
    }

    public void exibirConta() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: " + this.saldo);
    }
}
