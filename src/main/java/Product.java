public class Product {
    private final String name;
    private final int price;
    private final double weight;

    public Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Product setName(String name) {
        return new Product(name, price, weight);
    }

    public Product setPrice(int price) {
        return new Product(name, price, weight);
    }

    public Product setWeight(double weight) {
        return new Product(name, price, weight);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' + ", price=" + price + ", weight=" + weight + '}';
    }
}