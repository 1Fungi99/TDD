import java.util.*;

public class Cart {
    private List<Product> productsInCart=new ArrayList<>();


    public void addItem(String name, double price) {
        Product product = new Product(name,price);
        product.setTax(itemTaxApply(name, price));
        productsInCart.add(product);
    }

    public void display() {
        for (int i = 0; i < productsInCart.size();i++){
            double roundOff = (double) Math.round((productsInCart.get(i).getPrice()+productsInCart.get(i).getTax()) * 100) / 100;
            System.out.println("1 "+productsInCart.get(i).getName()+": $"+(roundOff));
        }
    }

    public double itemTaxApply(String name,double price) {
    if (name.contains("[EXEMPT]") && !name.contains("imported")){
        return 0;
    } else if (name.contains("[EXEMPT]") && name.contains("imported")){
        return (double)Math.round((price*.05) * 100) / 100;
    } else if (!name.contains("[EXEMPT]") && !name.contains("imported")){
        return (double)Math.round((price*.10) * 100) / 100;
    } else if (!name.contains("[EXEMPT]") && name.contains("imported")){
        return (double)Math.round((price*.15) * 100) / 100;
    }
    return 0;
    }

    public double getTotalWithTax() {
        double totalWithTax=0;
        for (int i = 0; i < productsInCart.size();i++){
            totalWithTax += productsInCart.get(i).getTax()+productsInCart.get(i).getPrice();
        }
        double roundOff = (double) Math.round(totalWithTax * 100) / 100;
        return roundOff;
    }

    public double getTaxTotal() {
        double taxTotal = 0;
        for (int i = 0; i < productsInCart.size(); i++) {
            taxTotal += productsInCart.get(i).getTax();
        }
        return taxTotal;
    }
}
