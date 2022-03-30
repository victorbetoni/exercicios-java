package projeto4;

public class Medico {
    private String nome;
    private boolean trabalhaNoHospital;

    public Medico(String nome, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public boolean trabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void tratarPacience() {
        System.out.println("Medico tratou o paciente");
    }

    public void mostra() {
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Trabalha no hospital: " + (trabalhaNoHospital ? "Sim" : "Não"));
    }
}
