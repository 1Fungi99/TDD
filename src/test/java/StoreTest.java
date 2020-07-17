import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    @Order(1)
//    Check if store exists
    public void storeExists(){
        Store store=new Store();
        assertEquals("Kroger", store.getName());
    }

    @Test
    @Order(2)
//    Possible to change the store name
    public void storeChangeName(){
        Store store = new Store();
        assertEquals("Walmart", store.setName("Walmart"));
    }

    @Test
    @Order(3)
//    Checking to see that the cart containing items exists
    public void cartExists(){
        Store store = new Store();
        assertEquals(true,store.cartExist());
    }

    @Test
    @Order(4)
//    Add products to Cart
    public void cartAddItems(){
        Store store = new Store();
        try {
            store.addItemToCart("book", 10.49);
        }catch(Exception e){
            fail();
        }
    }
}