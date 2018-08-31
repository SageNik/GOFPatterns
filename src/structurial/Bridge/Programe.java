package structurial.Bridge;

/**
 * Created by user on 8/13/2018.
 */
public abstract class Programe {

   protected Developer developer;

    public Programe(Developer developer) {
        this.developer = developer;
    }

    abstract void developePrograme();
}
