package creational.AbstractFactory.mac;

import creational.AbstractFactory.Window;

/**
 * Created by user on 8/10/2018.
 */
public class MacWindow implements Window {

    @Override
    public void getDescription() {
        System.out.println("Mac window");
    }
}
