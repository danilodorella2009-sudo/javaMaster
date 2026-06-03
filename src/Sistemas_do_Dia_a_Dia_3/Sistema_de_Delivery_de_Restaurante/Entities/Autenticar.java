package Sistemas_do_Dia_a_Dia_3.Sistema_de_Delivery_de_Restaurante.Entities;

public class Autenticar {
    private Usuario usuarioCadastro;

    public Autenticar(Usuario usuario) {
    }

    public void Autenticador(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public boolean autenticar(String login, String senha) {
        return usuarioCadastro.getLogin().equals(login)
                && usuarioCadastro.getSenha().equals(senha);
    }
}
