package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setProductBuilder(new ProductABuilder());

        Product productA = builder.buildProduct();
        System.out.println(productA);

        builder.setProductBuilder(new ProductBBuilder());

        Product productB = builder.buildProduct();
        System.out.println(productB);
    }
}
