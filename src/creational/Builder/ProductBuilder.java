package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public abstract class ProductBuilder {

    Product product;

    protected void createProduct(){
        product = new Product();
    }

    abstract void buildName();
    abstract void buildPrice();

    Product getProduct(){
        return product;
    }
}
