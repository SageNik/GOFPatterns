package creational.AbstractFactory.windows;

import creational.AbstractFactory.Scroll;

/**
 * Created by user on 8/10/2018.
 */
public class WindowsScroll implements Scroll {

    @Override
    public void getDescription() {
        System.out.println("Windows scroll");
    }
}
