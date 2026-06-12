package Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Application;

import Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities.Passagem;
import Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities.ClasseEconomica;
import Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities.ClasseExecutiva;
import Sistema_do_Dia_a_Dia_4.Sistema_de_Passagens_Aereas.Entities.StatusVoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do passageiro: ");
        String nome = sc.nextLine();

        System.out.print("Número do voo: ");
        String voo = sc.nextLine();

        System.out.print("Preço da passagem: ");
        double preco = sc.nextDouble();

        System.out.println("1 - Econômica");
        System.out.println("2 - Executiva");
        System.out.print("Escolha a classe: ");
        int opcao = sc.nextInt();

        Passagem passagem;

        if (opcao == 1) {

            System.out.print("Deseja despachar mala? (1-Sim / 0-Não): ");
            boolean mala = sc.nextInt() == 1;

            passagem = new ClasseEconomica(nome, voo, preco, mala);

        } else {

            passagem = new ClasseExecutiva(nome, voo, preco);
        }

        System.out.println(" Status do voo:");
        System.out.println("1 - AGENDADO");
        System.out.println("2 - EMBARQUE");
        System.out.println("3 - ATRASADO");
        System.out.println("4 - CANCELADO");
        System.out.println("5 - CONCLUIDO");

        System.out.print("Escolha: ");
        int statusEscolhido = sc.nextInt();

        switch (statusEscolhido) {
            case 1:
                passagem.setStatus(StatusVoo.AGENDADO);
                break;
            case 2:
                passagem.setStatus(StatusVoo.EMBARQUE);
                break;
            case 3:
                passagem.setStatus(StatusVoo.ATRASADO);
                break;
            case 4:
                passagem.setStatus(StatusVoo.CANCELADO);
                break;
            case 5:
                passagem.setStatus(StatusVoo.CONCLUIDO);
                break;
        }

        System.out.println(passagem);

        sc.close();
    }
}