package projeto2;

public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(int quantia) {
        if(quantia > saldo) {
            return;
        }
        saldo-=quantia;
    }

    public void depositar(int quantia) {
        saldo+=quantia;
    }

    public void mostra() {
        System.out.println();
        System.out.printf("Cliente: %s\nN. Conta: %d\nSaldo: %.2f", cliente, numConta, saldo);
    }

}
