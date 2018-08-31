package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public class ProductBBuilder extends ProductBuilder {


    @Override
    void buildName() {
        product.setName("PRODUCT_B");
    }

    @Override
    void buildPrice() {
        product.setPrice(50);
    }
}
