package Exercicio_Fixacao_Polimorfismo.entities;

import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;

    }
    public LocalDate getManufactureDate(){
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getName() + " $ " + String.format("%.2f", getPrice())
                + " (Manufacture date: " + manufactureDate.format(fmt) + ")";
    }
}