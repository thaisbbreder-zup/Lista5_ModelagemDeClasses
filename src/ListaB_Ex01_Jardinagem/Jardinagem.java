package ListaB.Ex01_Jardinagem;

public class Jardinagem {

    String nomeJardim;
    int qtdMetros;
    int qtdPlantas;
    int qtdMetrosGrama;
    int gramaAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;

    public Jardinagem(String nomeJardim, int qtdMetros, int qtdPlantas, int qtdMetrosGrama, int gramaAdubo, double valorAdubo, double valorMetroGrama, double valorConteGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
    }

    public double usarAdubo() {
        int qtdAdubo = qtdMetrosGrama / 2 * gramaAdubo;
        return qtdAdubo;
    }

    public double precoAdubo() {
        double aduboUtilizado = usarAdubo();
        double precoAdubo = aduboUtilizado * valorAdubo;
        return precoAdubo;
    }

    public double precoCorteGrama() {
        double precoCorteGrama = qtdMetrosGrama * valorMetroGrama;
        return precoCorteGrama;
    }

    public void exibirCaracteristicas() {
        System.out.println("Nome do Jardim: " + nomeJardim);
        System.out.println("Quantidade de Metros: " + qtdMetros);
        System.out.println("Quantidade de Plantas: " + qtdPlantas);
        System.out.println("Quantidade de Metros de Grama: " + qtdMetrosGrama);
        System.out.println("Quantidade de Gramas de Adubo: " + gramaAdubo);
        System.out.println("Valor do Adubo: R$" + valorAdubo);
        System.out.println("Valor por Metro de Grama: R$" + valorMetroGrama);
        System.out.println("Valor do Corte de Grama: R$" + valorConteGrama);


    }

}
