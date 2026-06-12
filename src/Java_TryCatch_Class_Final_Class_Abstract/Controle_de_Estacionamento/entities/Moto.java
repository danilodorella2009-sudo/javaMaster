package Java_TryCatch_Class_Final_Class_Abstract.Controle_de_Estacionamento.entities;

public class Moto extends Veiculo {

    public Moto(String placa, int horaEntrada) {
        super(placa, horaEntrada, TipoVeiculo.MOTO);
    }

    @Override
    public double calcularValor(int horas) {

        double valor = TarifaEstacionamento.calcularTarifa(horas);

        return valor * 0.8;
    }
}