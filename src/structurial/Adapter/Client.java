package structurial.Adapter;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaAppToDataBase();

        dataBase.create();
        dataBase.read();
        dataBase.update();
        dataBase.remove();
    }
}
