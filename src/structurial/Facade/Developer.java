package structurial.Facade;

/**
 * Created by user on 8/14/2018.
 */
public class Developer {

    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isSprintActive()) System.out.println("Developer writes code...");
        else System.out.println("Developer reads literature...");
    }
}
