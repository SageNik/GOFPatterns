package creational.AbstractFactory.linux;

import creational.AbstractFactory.Window;

/**
 * Created by user on 8/10/2018.
 */
public class LinuxWindow implements Window {

    @Override
    public void getDescription() {
        System.out.println("Linux window");
    }
}
