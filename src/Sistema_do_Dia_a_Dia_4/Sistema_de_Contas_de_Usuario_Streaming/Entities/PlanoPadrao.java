package Sistema_do_Dia_a_Dia_4.Sistema_de_Contas_de_Usuario_Streaming.Entities;

public class PlanoPadrao extends ContaStreaming {

    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nome, String email) {

        super(nome, email, TipoPlano.PADRAO);
        precoBase = 30.0;

    }

    @Override
    public String toString() {

        return super.toString() +
                "Qualidade: " + qualidadeVideo +
                "Limite de telas: " + limiteTelas +
                "Mensalidade: R$ " + precoBase;

    }
}