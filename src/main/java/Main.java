public class Main {
    public static void main(String[] args) {
       BookStore store = new BookStore();
       store.setCart(args);
        System.out.println("price " + store.priceCalculate());
    }
}
