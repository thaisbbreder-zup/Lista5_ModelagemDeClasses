package ListaB_Ex02_Caixa;

public class Caixa {
    private double saldo;

    public Caixa() {
        this.saldo = 1000.0;
    }

    // Método para crédito
    public void credito(double valor) {
        saldo += valor;
    }

    // Método para débito
    public void debito(double valor) {
        saldo -= valor;
    }

    // Método saldo atual do caixa
    public double saldoAtual() {
        return saldo;
    }
}
