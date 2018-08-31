package creational.AbstractFactory.factory;

import creational.AbstractFactory.Button;
import creational.AbstractFactory.Scroll;
import creational.AbstractFactory.Window;
import creational.AbstractFactory.mac.MacButton;
import creational.AbstractFactory.mac.MacScroll;
import creational.AbstractFactory.mac.MacWindow;

/**
 * Created by user on 8/10/2018.
 */
public class MacFactory implements Factory {

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Window getWindow() {
        return new MacWindow();
    }

    @Override
    public Scroll getScroll() {
        return new MacScroll();
    }
}
