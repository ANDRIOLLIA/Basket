public class Basket {
    private Product product;
    public String items = "";
    public int totalPrice = 0;
    private static int totalPriceAllBaskets = 0;
    private int limit = 1_000_000;
    private double totalWeight = 0;
    private static int countBasket = 0;
    private int countItems;
    private static int countItemsAllBaskets = 0;

    public Basket() {
        items = "Список товаров: ";
        increaseCountBasket(1);
        countItems = 0;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(Product product) {
        this();
        add(product);
    }

    public void add(Product product, int count) {
        String name = product.getName();
        int price = product.getPrice();
        double weight = product.getWeight();
        price *= count;
        totalWeight += (weight * count);
        if (totalPrice + price > limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
            countItems += 1;
            totalPriceAllBaskets += price;
            countItemsAllBaskets += 1;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
            countItems += 1;
            totalPriceAllBaskets += price;
            countItemsAllBaskets += 1;
        }
    }

    public void add(Product product) {
        add(product, 1);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пустая");
        } else {
            System.out.println(items);
            String info = "Стоимость данной корзины равна:" + getTotalPrice();
            System.out.println(info);
            System.out.println("Вес данной корзины: " + getTotalWeight());
        }
    }

    public boolean containsItem(String name) {
        return items.contains(name);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalPrice(int totalPrice) {
        if (totalPrice > limit) {
            return;
        }
        this.totalPrice = totalPrice;
    }

    public static int getCountBasket() {
        return countBasket;
    }

    public static void increaseCountBasket(int countBasket) {
        Basket.countBasket += countBasket;
    }

    public int getAveragePrice() {
        return totalPrice / countItems;
    }

    public static int getOveragePriceAllBaskets(){
        return totalPriceAllBaskets / countItemsAllBaskets;
    }

    @Override
    public String toString() {
        return
                "Название товаров: " + items + "\n" +
                "Общая цена корзины: " + totalPrice + "\n" +
                "Ограничение по стоимости товаров: " +  limit + "\n" +
                "Вес корзины: " + totalWeight + "\n" +
                "Средняя стоимость продукта в данной корзине равна: " + getAveragePrice();
    }
}