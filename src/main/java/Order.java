public class Order {
    public void addProductWithDiscount(Product product) {
        if (product.getPrice() >= 1_000) {
            int percentPrice = (int) (product.getPrice() * 10 / 100);
            int actualPrice = product.getPrice() - percentPrice;
            Product currentProduct = product.setPrice(actualPrice);
            System.out.println("Актуальная стоимость продукта " + currentProduct.getName() + " равна: " + currentProduct.getPrice());
        }
    }

    public void addProduct(Product product) {
        System.out.println("Стоимость продукта " + product.getName() + " равна: " + product.getPrice());
    }
}