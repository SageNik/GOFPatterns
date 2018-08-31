package creational.AbstractFactory.windows;

import creational.AbstractFactory.Button;

/**
 * Created by user on 8/10/2018.
 */
public class WindowsButton implements Button {

    @Override
    public void getDescription() {
        System.out.println("Windows button");
    }
}
