package structurial.Composit;

/**
 * Created by user on 8/13/2018.
 */
public class Leaf extends TreeItem {

    @Override
    int getCount() {
        return count;
    }

    @Override
    void increment() {
        count++;
    }
}
