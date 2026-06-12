package Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities;

public class Passagem {

    private String numeroVoo;
    private String nomePassageiro;
    private double precoOriginal;
    private StatusVoo status;

    public Passagem(String nomePassageiro, String numeroVoo, double precoOriginal) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
        this.precoOriginal = precoOriginal;
        this.status = StatusVoo.AGENDADO;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public StatusVoo getStatus() {
        return status;
    }

    public void setStatus(StatusVoo status) {
        this.status = status;
    }

    public double calcularPrecoFinal() {
        return precoOriginal;
    }
}