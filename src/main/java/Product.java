public class Product {
    private double tax;
    private String name;
    private double price;

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {return tax; }

    public void setTax(double itemTaxApplyResult) {
        this.tax=itemTaxApplyResult;
    }
}
