package testa.funcionarios;

public class Gerente extends Funcionario {

    private String usuario;
    private String senha;

    public Gerente(String nome, double salario, String usuario, String senha) {
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public double calculaBonificacao() {
        return this.salario*0.2;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);
    }
}
