package creational.AbstractFactory.factory;

import creational.AbstractFactory.Button;
import creational.AbstractFactory.Scroll;
import creational.AbstractFactory.Window;

/**
 * Created by user on 8/10/2018.
 */
public interface Factory {

    Button getButton();
    Window getWindow();
    Scroll getScroll();
}
