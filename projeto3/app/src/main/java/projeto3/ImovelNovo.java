package projeto3;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(int codigo, String endereco, double preco, double adicional) {
        super(codigo, endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("Preço adicional: " + 1900);
        System.out.printf("Preço final: %.2f\n", getPreco() + adicional);
    }
}
