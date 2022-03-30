package projeto4;

public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(String nome, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public boolean atendeEmCasa() {
        return atendeEmCasa;
    }

    public void receitar() {
        System.out.println("Clinico geral receitou um bagulho pro cliente");
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("Trabalha no hospital: " + (atendeEmCasa ? "Sim" : "Não"));
    }
}
