package Exercicio_Fixacao_Polimorfismo.applcation;

import Exercicio_Fixacao_Polimorfismo.entities.ImportedProduct;
import Exercicio_Fixacao_Polimorfismo.entities.Product;
import Exercicio_Fixacao_Polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2500.00));
        list.add(new Product( "Mouse", 150.00));
        list.add(new ImportedProduct( 200.00, "iPhone", 5000.00));
        list.add(new ImportedProduct(80.00, "Headphone", 300.00));
        list.add(new UsedProduct("Geladeira",800.00, LocalDate.of(2018, 5, 20)));

        for (Product p : list) {
            System.out.println(p.priceTag());
        }
    }
}