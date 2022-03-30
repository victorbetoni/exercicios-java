package projeto3;

public class ImovelUsado extends Imovel {
    private double desconto;

    public ImovelUsado(int codigo, String endereco, double preco, double desconto) {
        super(codigo, endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("Desconto: " + desconto);
        System.out.printf("Preço final: %.2f\n", getPreco() - desconto);
    }
}
