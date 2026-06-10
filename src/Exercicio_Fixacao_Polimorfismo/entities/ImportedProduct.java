package Exercicio_Fixacao_Polimorfismo.entities;

public class ImportedProduct extends Product {

    private double customsFree;

    public ImportedProduct(double customsFree, String name, double price) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }

    public double totalPrice() {
        return getPrice() + customsFree;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                +"(Customs fee: $ "
                + String.format("%.2f", customsFree)
                + ")";
    }
}