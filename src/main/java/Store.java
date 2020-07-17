import java.util.*;

public class Store {
    private String name;
    private List<Cart> cartList = new ArrayList<>();

    public String getName() {
        return "Kroger";
    }

    public String setName(String newName) {
        this.name=newName;
        return name;
    }

    public boolean cartListExist() {
       if (this.cartList!=null){
            return true;
        }
        return false;
    }

    public List<Cart> newCart() {
        Cart cart = new Cart();
        cartList.add(cart);
        return cartList;
    }
}
