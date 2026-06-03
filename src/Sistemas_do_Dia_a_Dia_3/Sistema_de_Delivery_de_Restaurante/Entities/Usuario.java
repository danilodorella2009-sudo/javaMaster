package Sistemas_do_Dia_a_Dia_3.Sistema_de_Delivery_de_Restaurante.Entities;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {

        return login;
    }

    public String getSenha() {
        return senha;
    }


}

