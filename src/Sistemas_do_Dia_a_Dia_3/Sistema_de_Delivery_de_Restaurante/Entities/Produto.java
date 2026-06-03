package Sistemas_do_Dia_a_Dia_3.Sistema_de_Delivery_de_Restaurante.Entities;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {

        return nome;
    }

    public int getCodigo() {

        return codigo;
    }

    public double getPreco() {

        return preco;
    }
}

