public class Main {
    public static void main(String[] args) {
//        Product product = new Product("Ручной эспандер", 2500, 0.3);
//        Order firstOrder = new Order();
//        firstOrder.addProductWithDiscount(product);
//        Order secondOrder = new Order();
//        secondOrder.addProduct(product);
//
//        Product secondProduct = new Product("Синий пояс по БЖЖ", 3500, 0.5);
//
//        Product thirdProduct = new Product("Ги для БЖЖ", 12500, 5);
//
//        Basket firstBasket = new Basket(product);
//
//        Basket secondBasket = new Basket(secondProduct);
//        secondBasket.add(thirdProduct);
//
//        System.out.println("Первая корзина: " + firstBasket + "\n");
//        System.out.println("Вторая корзина: " + secondBasket + "\n");
//        System.out.println("Кол-во корзин: " + Basket.getCountBasket());

        DeliveryOrder deliveryOrder = new DeliveryOrder(true, false, true);
        System.out.println(deliveryOrder.toString());
    }
}