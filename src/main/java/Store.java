import java.util.*;

public class Store {
    private String name;
    private Cart cart;

    public String getName() {
        return "Kroger";
    }

    public String setName(String newName) {
        this.name=newName;
        return name;
    }

    public boolean cartExist() {
        cart=new Cart();
        if (cart!=null){
            return true;
        }
        return false;
    }
}
