import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {
    @Test
    public void testSameBook(){
        String[] cart = {"1", "1" ,"1", "1"};
        BookStore store = new BookStore(cart);
        int expect = 4 * 100;
        int result = store.priceCalculate();
        assertEquals(expect, result);
    }
}