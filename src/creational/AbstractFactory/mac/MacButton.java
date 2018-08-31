package creational.AbstractFactory.mac;

import creational.AbstractFactory.Button;

/**
 * Created by user on 8/10/2018.
 */
public class MacButton implements Button {

    @Override
    public void getDescription() {
        System.out.println("Mac button");
    }
}
