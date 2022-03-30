package projeto4;

public class Cirurgiao extends Medico {

    public Cirurgiao(String nome, boolean trabalhaNoHospital) {
        super(nome, trabalhaNoHospital);
    }

    @Override
    public void tratarPacience() {
        System.out.println("O cirurgião tratou o paciente");
    }

    public void fazerIncisao(){
        System.out.println("Cirurgiao fez uma incisão no paciente");
    }
}
