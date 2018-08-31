package creational.FactoryMethod;

/**
 * Created by user on 8/10/2018.
 */
public class Client {

    public static void main(String[] args) {

        Product product = Product.getProduct("a");
        product.getDescription();

        Product product2 = Product.getProduct("b");
        product2.getDescription();
    }
}
