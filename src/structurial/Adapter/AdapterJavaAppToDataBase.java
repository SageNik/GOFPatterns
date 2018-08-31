package structurial.Adapter;

/**
 * Created by user on 8/13/2018.
 */
public class AdapterJavaAppToDataBase extends JavaApp implements DataBase {

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
