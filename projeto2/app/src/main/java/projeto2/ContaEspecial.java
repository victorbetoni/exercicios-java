package projeto2;

public class ContaEspecial extends ContaBancaria{
    private int limite;

    public ContaEspecial(String cliente, int numConta, double saldo, int limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(int quantia) {
        if(this.saldo - quantia < limite) {
            return;
        }
        saldo -= quantia;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("Limite: " + limite);
    }
}
