package Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities;

public class ClasseExecutiva extends Passagem {

    private boolean servicoBordoVip = true;
    private boolean acessoSalaVip = true;

    public ClasseExecutiva(String nomePassageiro,
                           String numeroVoo,
                           double precoOriginal) {

        super(nomePassageiro, numeroVoo, precoOriginal);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoOriginal() * 1.5;
    }

    @Override
    public String toString() {
        return " PASSAGEM EXECUTIVA " +
                " Passageiro: " + getNomePassageiro() +
                " Número do voo: " + getNumeroVoo() +
                " Status: " + getStatus() +
                " Serviço VIP: " + (servicoBordoVip ? "Sim" : "Não") +
                " Sala VIP: " + (acessoSalaVip ? "Sim" : "Não") +
                " Preço Final: R$ " + calcularPrecoFinal();
    }
}