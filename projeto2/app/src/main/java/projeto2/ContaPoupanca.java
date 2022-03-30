package projeto2;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxa) {
        this.saldo = this.saldo + this.saldo*taxa;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("Dia do rendimento: " + diaRendimento);
    }
}
