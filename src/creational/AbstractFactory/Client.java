package creational.AbstractFactory;

import creational.AbstractFactory.factory.Factory;
import creational.AbstractFactory.factory.WindowsFactory;

/**
 * Created by user on 8/10/2018.
 */
public class Client {

    public static void main(String[] args) {

        Factory factory = new WindowsFactory();
        Button button = factory.getButton();
        Window window = factory.getWindow();
        Scroll scroll = factory.getScroll();

        button.getDescription();
        window.getDescription();
        scroll.getDescription();
    }
}
