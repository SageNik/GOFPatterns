package creational.AbstractFactory.mac;

import creational.AbstractFactory.Scroll;

/**
 * Created by user on 8/10/2018.
 */
public class MacScroll implements Scroll {

    @Override
    public void getDescription() {
        System.out.println("Mac scroll");
    }
}
