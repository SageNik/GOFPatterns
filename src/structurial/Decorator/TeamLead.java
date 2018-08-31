package structurial.Decorator;

/**
 * Created by user on 8/13/2018.
 */
public class TeamLead extends DeveloperDecorator {


    public TeamLead(Developer developer) {
        super(developer);
    }

    public String writeWeekReport(){
        return "Writing week report \n";
    }

    @Override
    public String makeJob() {
       return super.makeJob()+ writeWeekReport();
    }
}
