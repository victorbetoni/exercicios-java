package testa.funcionarios;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaBonificacao() {
        return salario*0.1;
    }

    public void mostraDados() {
        System.out.println("");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Salário com bonificação: " + calculaBonificacao());
    }
}
