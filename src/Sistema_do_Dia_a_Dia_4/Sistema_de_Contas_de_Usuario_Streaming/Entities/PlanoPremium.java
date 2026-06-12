package Sistema_do_Dia_a_Dia_4.Sistema_de_Contas_de_Usuario_Streaming.Entities;

public class PlanoPremium extends ContaStreaming {

    private String qualidadeVideo = "4K Ultra HD";
    private int limiteTelas = 4;
    private boolean download = true;

    public PlanoPremium(String nome, String email) {

        super(nome, email, TipoPlano.PREMIUM);
        precoBase = 50.0;

    }

    @Override
    public String toString() {

        return super.toString() +
                "Qualidade: " + qualidadeVideo +
                "Limite de telas: " + limiteTelas +
                "Download offline: " + download +
                "Mensalidade: R$ " + precoBase;

    }
}