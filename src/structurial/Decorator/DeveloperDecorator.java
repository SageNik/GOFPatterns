package structurial.Decorator;

/**
 * Created by user on 8/13/2018.
 */
public class DeveloperDecorator implements Developer {

    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
         return developer.makeJob();
    }
}
