package creational.Builder;

/**
 * Created by user on 8/13/2018.
 */
public class Builder {

    private ProductBuilder productBuilder;

    void setProductBuilder(ProductBuilder productBuilder){
        this.productBuilder = productBuilder;
    }

    Product buildProduct(){
        productBuilder.createProduct();
        productBuilder.buildName();
        productBuilder.buildPrice();
        return productBuilder.getProduct();
    }
}
