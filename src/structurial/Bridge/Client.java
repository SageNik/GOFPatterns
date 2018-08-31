package structurial.Bridge;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {

        Programe programe1 = new BankPrograme(new JavaDeveloper());
        Programe programe2 = new StockExchengePrograme(new CppDeveloper());

        programe1.developePrograme();
        programe2.developePrograme();

    }
}
