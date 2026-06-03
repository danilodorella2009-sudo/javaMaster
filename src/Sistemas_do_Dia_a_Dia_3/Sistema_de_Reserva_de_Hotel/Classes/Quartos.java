package Sistemas_do_Dia_a_Dia_3.Sistema_de_Reserva_de_Hotel.Classes;

public class Quartos {
    private int numero;
    private double valorDiaria;

    public Quartos(int numero, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
    }
    public int getNumero(){
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}