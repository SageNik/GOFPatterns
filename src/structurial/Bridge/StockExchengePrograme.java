package structurial.Bridge;

/**
 * Created by user on 8/13/2018.
 */
public class StockExchengePrograme extends Programe {

    public StockExchengePrograme(Developer developer) {
        super(developer);
    }

    @Override
    void developePrograme() {
        System.out.println("Stock exchange programme development in progress...");
        developer.writeCode();
    }
}
