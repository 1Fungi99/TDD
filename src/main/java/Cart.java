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
            System.out.println("Name: "+productsInCart.get(i).getName());
            System.out.println("Price: $"+productsInCart.get(i).getPrice()+"\n");
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
        double total=0;
        double tax=0;
        double totalWithTax=0;
        for (int i = 0; i < productsInCart.size();i++){
            tax += productsInCart.get(i).getTax();
//            System.out.println("tax:" + tax);
            total += productsInCart.get(i).getPrice();
//            System.out.println("total: " + total);
            totalWithTax += tax+total;
        }
        double roundOff = (double) Math.round(totalWithTax * 100) / 100;
        return roundOff;
    }
}
