package creational.AbstractFactory.linux;

import creational.AbstractFactory.Scroll;

/**
 * Created by user on 8/10/2018.
 */
public class LinuxScroll implements Scroll {

    @Override
    public void getDescription() {
        System.out.println("Linux scroll");
    }
}
