package Sistemas_do_Dia_a_Dia_Refatorados_Classes_Enum.Sistema_De_Controle_Online_Refatorado_Enum.application;

import Sistemas_do_Dia_a_Dia_Refatorados_Classes_Enum.Sistema_De_Controle_Online_Refatorado_Enum.entities.compra;

public class main {

    public static void main(String[] args) {

        compra compra = new compra();

        compra.adicionarProdutos();

        compra.dadosCliente();

        compra.calcularFrete();

        compra.finalizarCompra();
    }
}