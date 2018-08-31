package creational.AbstractFactory.factory;

import creational.AbstractFactory.Button;
import creational.AbstractFactory.Scroll;
import creational.AbstractFactory.Window;
import creational.AbstractFactory.linux.LinuxButton;
import creational.AbstractFactory.linux.LinuxScroll;
import creational.AbstractFactory.linux.LinuxWindow;

/**
 * Created by user on 8/10/2018.
 */
public class LinuxFactory implements Factory {

    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Window getWindow() {
        return new LinuxWindow();
    }

    @Override
    public Scroll getScroll() {
        return new LinuxScroll();
    }
}
