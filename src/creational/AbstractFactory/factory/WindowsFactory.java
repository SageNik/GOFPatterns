package creational.AbstractFactory.factory;

import creational.AbstractFactory.Button;
import creational.AbstractFactory.Scroll;
import creational.AbstractFactory.Window;
import creational.AbstractFactory.windows.WindowsButton;
import creational.AbstractFactory.windows.WindowsScroll;
import creational.AbstractFactory.windows.WindowsWindow;

/**
 * Created by user on 8/10/2018.
 */
public class WindowsFactory implements Factory {

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Window getWindow() {
        return new WindowsWindow();
    }

    @Override
    public Scroll getScroll() {
        return new WindowsScroll();
    }
}
