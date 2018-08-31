package creational.AbstractFactory.linux;

import creational.AbstractFactory.Button;

/**
 * Created by user on 8/10/2018.
 */
public class LinuxButton implements Button {

    @Override
    public void getDescription() {
        System.out.println("Linux button");
    }
}
