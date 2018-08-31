package structurial.Decorator;

/**
 * Created by user on 8/13/2018.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Making code review \n";
    }

    @Override
    public String makeJob() {
       return super.makeJob() + makeCodeReview();
    }
}
