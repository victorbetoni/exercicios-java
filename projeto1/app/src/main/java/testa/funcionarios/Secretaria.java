package testa.funcionarios;

public class Secretaria extends Funcionario {
    private int ramal;

    public Secretaria(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Ramal: " + ramal);
    }
}
