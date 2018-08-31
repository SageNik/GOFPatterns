package structurial.Composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {

        int totalCount = 0;

        Leaf item1 = new Leaf();
        Node item2 = new Node();
        item2.add(item1);
        Node item3 = new Node();
        item3.add(item2);

        item3.getCount();
        System.out.println("Total Count before increment:" +totalCount);

        item3.increment();

        totalCount = item3.getCount();
        System.out.println("Total Count after increment:" +totalCount);

        item3.increment();

        totalCount = item3.getCount();
        System.out.println("Total Count after increment:" +totalCount);
    }
}
