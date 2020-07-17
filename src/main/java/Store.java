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
}
