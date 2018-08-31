package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public class ProductABuilder extends ProductBuilder {


    @Override
    void buildName() {
        product.setName("PRODUCT_A");
    }

    @Override
    void buildPrice() {
        product.setPrice(100.5f);
    }
}
