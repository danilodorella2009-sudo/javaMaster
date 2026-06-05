package Sistemas_do_Dia_a_Dia_Refatorados_Classes_Enum.Sistema_de_Controle_de_BibliotecaEscolar_Refatorado_Enum.application;


import Sistemas_do_Dia_a_Dia_Refatorados_Classes_Enum.Sistema_de_Controle_de_BibliotecaEscolar_Refatorado_Enum.entities.ResultadoEmprestimo;
import Sistemas_do_Dia_a_Dia_Refatorados_Classes_Enum.Sistema_de_Controle_de_BibliotecaEscolar_Refatorado_Enum.entities.Emprestimo;

import java.util.Scanner;

public class Biblioteca  {
    public static void main(String[] args) {
        Emprestimo emp = new Emprestimo();
        Emprestimo.aluno aluno1 = emp.new aluno(
                "Guilherme",
                1234,
                false,
                4,
                "Java POO",
                100,
                true
        );
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Digite o código do livro: ");
        int codigo = sc.nextInt();
        ResultadoEmprestimo resultado =
                aluno1.realizarEmprestimo(matricula, codigo);

        switch (resultado) {
            case SUCESSO:
                System.out.println("Empréstimo realizado com sucesso!");
                break;

            case ALUNO_NAO_ENCONTRADO:
                System.out.println("Aluno não encontrado.");
                break;

            case MULTA_PENDENTE:
                System.out.println("Empréstimo bloqueado por multa.");
                break;

            case LIMITE_ATINGIDO:
                System.out.println("Limite de empréstimos atingido.");
                break;

            case LIVRO_INDISPONIVEL:
                System.out.println("Livro indisponível.");
                break;
        }
    }
}