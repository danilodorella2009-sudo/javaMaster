package Sistema_do_Dia_a_Dia_4.Sistema_de_Contas_de_Usuario_Streaming.Entities;

public class ContaStreaming {

    protected String nomeUsuario;
    protected String email;
    protected double precoBase;
    protected TipoPlano tipoPlano;

    public ContaStreaming(String nomeUsuario, String email, TipoPlano tipoPlano) {

        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.tipoPlano = tipoPlano;

    }

    @Override
    public String toString() {

        return "Nome: " + nomeUsuario +
                "E-mail: " + email +
                "Plano: " + tipoPlano;
    }
}