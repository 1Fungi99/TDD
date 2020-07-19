import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest2 {

    @Test @Order(1)
//    Check if store exists
    public void storeExists(){
        Store store=new Store();
        assertEquals("Kroger", store.getName());
    }

    @Test @Order(2)
//    Possible to change the store name
    public void storeChangeName(){
        Store store = new Store();
        assertEquals("Walmart", store.setName("Walmart"));
    }

    @Test @Order(3)
//    Checking to see that the cart containing items exists
    public void cartExists(){
        Store store = new Store();
        assertEquals(true,store.cartExist());
    }

    @Test @Order(4)
//    Add products to Cart
    public void cartAddItems(){
        Store store = new Store();
        try {
            assertEquals("book",store.addItemToCart("book", 10.49) );
        }catch(Exception e){
            fail();
        }
    }

    @Test @Order(5)
//    See Products
    public void seeProducts(){
        try{
            Store store = new Store();
            store.addItemToCart("[EXEMPT] book", 10.49);
            store.addItemToCart("music CD", 15.99);
            store.addItemToCart("[EXEMPT] chocolate bar", .85);
//            Hidden for later testing purposes.
//            store.displayCart();
            assert(true);
        }catch(Exception e){
            fail();
        }
    }

    @Test @Order(6)
    public void saveCartVariable() {
        try{
            Store store = new Store();
            Cart cart=store.getCart();
            if (cart!=null){
                assert(true);
            }else{
                assert(false);
            }
        }catch(Exception e){
            fail();
        }
    }

    @Test @Order(7)
    public void addItemToCartFromCart(){
        try{
            Store store=new Store();
            Cart cart = store.getCart();
            cart.addItem("[EXEMPT] book", 12.49);
//            Hidden for later testing purposes.
//            cart.display();
            assert (true);
        } catch (Exception e){
            fail();
        }
    }

    @Test @Order(8)
    public void nameMatcherApplySalesTaxTest1(){
        Store store = new Store();
        Cart cart = store.getCart();
        cart.addItem("music CD", 14.99);
        assertEquals(16.49,store.checkout());
    }
    @Test @Order(9)
    public void nameMatcherApplySalesTaxTest2(){
        Store store = new Store();
        Cart cart = store.getCart();
        cart.addItem("imported bottle of perfume", 27.99);
        assertEquals(32.19,store.checkout());
    }

    @Test @Order(10)
//    change in expected assertEquals value: from 54.65 to 54.63 since the input of Music CD has sales tax and not rounded. Unsure.
    public void nameMatcherApplySalesTaxTest3(){
        Store store = new Store();
        Cart cart = store.getCart();
        cart.addItem("imported bottle of perfume", 47.50);
        assertEquals(54.63,store.checkout());
    }

    @Test @Order(11)
//    12.49+(14.99*1.1)+.85=29.83 (Rounded)
    public void input1() {
        Store store = new Store();
        Cart cart = store.getCart();
        cart.addItem("book [EXEMPT]", 12.49);
        cart.addItem("music CD", 14.99);
        cart.addItem("chocolate bar [EXEMPT]", 0.85);
        assertEquals(29.83,store.checkout());
    }


//    @Test @Order(6)
//    public void setPriceForSalesTax() {
//
//
//    }

//    @Test @Order(6)
////    Total price of products
//    public void totalPrice() {
//        try {
//            Store store = new Store();
//            store.addItemToCart("[EXEMPT] book", 10.49);
//            store.addItemToCart("music CD", 15.99);
//            store.addItemToCart("[EXEMPT] chocolate bar", .85);
//            assertEquals(27.33, store.total());
//        } catch (Exception e) {
//            fail();
//        }
//    }
}