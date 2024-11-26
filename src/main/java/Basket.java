public class Basket {
    private int totalPrice = 0;
    private String items = "";
    private int limit = 1_000_000;
    double totalWeight = 0;

    public Basket() {
        items = "Список товаров:";
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
        if (totalPrice + price > limit) {
            return;
        } else if (containsItem(name)) {
            return;
        } else if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
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
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость данной корзины равна: " + getTotalPrice());
        }
    }

    public boolean containsItem(String name) {
        return items.contains(name);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        if(totalPrice > limit){
            return;
        }
            this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalPrice=" + totalPrice +
                ", items='" + items + '\'' +
                ", limit=" + limit +
                ", totalWeight=" + totalWeight +
                '}';
    }
}