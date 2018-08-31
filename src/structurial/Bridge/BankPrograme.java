package structurial.Bridge;

/**
 * Created by user on 8/13/2018.
 */
public class BankPrograme extends Programe {


    public BankPrograme(Developer developer) {
        super(developer);
    }

    @Override
    void developePrograme() {
        System.out.println("Bank programme development in progress...");
        developer.writeCode();
    }
}
