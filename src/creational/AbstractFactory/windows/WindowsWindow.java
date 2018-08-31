package creational.AbstractFactory.windows;

import creational.AbstractFactory.Window;

/**
 * Created by user on 8/10/2018.
 */
public class WindowsWindow implements Window {
    @Override
    public void getDescription() {
        System.out.println("Windows window");
    }
}
