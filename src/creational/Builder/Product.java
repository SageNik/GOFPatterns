package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public class Product {

    private String name;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
