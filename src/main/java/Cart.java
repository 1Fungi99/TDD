import java.util.*;

public class Cart {
    private List<Product> productsInCart=new ArrayList<>();


    public void addItem(String name, double price) {
        Product product = new Product(name,price);
        productsInCart.add(product);
    }

    public void display() {
        for (int i = 0; i < productsInCart.size();i++){
            System.out.println("Name: "+productsInCart.get(i).getName());
            System.out.println("Price: $"+productsInCart.get(i).getPrice()+"\n");
        }
    }
}
