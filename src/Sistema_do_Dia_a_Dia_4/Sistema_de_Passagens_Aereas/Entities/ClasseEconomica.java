package Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities;

public class ClasseEconomica extends Passagem {

    private boolean despacharMala;
    private final double taxaBagagem = 120.0;

    public ClasseEconomica(String nomePassageiro,
                           String numeroVoo,
                           double precoOriginal,
                           boolean despacharMala) {

        super(nomePassageiro, numeroVoo, precoOriginal);
        this.despacharMala = despacharMala;
    }

    @Override
    public double calcularPrecoFinal() {

        if (despacharMala) {
            return getPrecoOriginal() + taxaBagagem;
        }

        return getPrecoOriginal();
    }

    @Override
    public String toString() {
        return " PASSAGEM ECONÔMICA " +
                "Passageiro: " + getNomePassageiro() +
                "Número do voo: " + getNumeroVoo() +
                "Status: " + getStatus() +
                "Mala despachada: " + (despacharMala ? "Sim" : "Não") +
                "Preço Final: R$ " + calcularPrecoFinal();
    }
}