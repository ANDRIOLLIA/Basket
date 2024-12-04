public class Order {
    public void addProductWithDiscount(Product product) {
        if (product.getPrice() >= 1000){
            int percentPrice = (int)(product.getPrice() * 10 / 100);
            int actualPrice = product.getPrice() - percentPrice;

            System.out.println("Актуальная стоимость продукта: " + actualPrice);
        }
    }
    public void addProduct(Product product) {
        System.out.println("Стоимость продукта: " + product.getPrice());
    }
}