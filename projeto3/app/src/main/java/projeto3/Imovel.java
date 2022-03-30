package projeto3;

public class Imovel {
    private int codigo;
    private String endereco;
    private double preco;

    public Imovel(int codigo, String endereco, double preco) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostra() {
        System.out.println();
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: " + preco);
        System.out.println("Codigo: " + codigo);
    }

}
