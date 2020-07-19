import java.util.*;

public class Store {
    private String name;
    private Cart cart=new Cart();

    public String getName() {
        return "Kroger";
    }

    public String setName(String newName) {
        this.name=newName;
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public boolean cartExist() {
        if (cart!=null){
            return true;
        }
        return false;
    }

    public String addItemToCart(String name, double price) {
        cart.addItem(name, price);
        return name;
    }

    public void displayCart() {
        cart.display();
    }

    public double checkout() {
        displayCart();
        System.out.println("Sales Taxes: $" + cart.getTaxTotal() + " Total: $"+cart.getTotalWithTax());
        return cart.getTotalWithTax();
    }
}
