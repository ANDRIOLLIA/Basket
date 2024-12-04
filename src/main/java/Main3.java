public class Main3 {
    public static void main(String[] args) {
        Product product = new Product("Ручник", 2000, 10);
        Order firstOrder = new Order();
        firstOrder.addProductWithDiscount(product);

        Order secondOrder = new Order();
        secondOrder.addProduct(product);
    }
}
