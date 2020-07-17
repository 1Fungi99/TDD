import java.util.*;

public class Cart {
    private List<Product> productsInCart=new ArrayList<Product>();


    public void addItem(String name, double price) {
        Product product = new Product(name,price);
    }
}
