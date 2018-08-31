package creational.FactoryMethod;

/**
 * Created by user on 8/10/2018.
 */
public abstract class Product {

    abstract void getDescription();
    public static Product getProduct(String productType){

        if(productType.equalsIgnoreCase("a")){
            return new ProductA();
        }else if(productType.equalsIgnoreCase("b")){
            return new ProductB();
        }else throw new RuntimeException("Error unknown product type: "+productType);

    }
}
