package structurial.Facade;

/**
 * Created by user on 8/14/2018.
 */
public class BugTracker {

    private boolean sprintActive;

    public boolean isSprintActive() {
        return sprintActive;
    }

    public void startSprint(){
        System.out.println("Sprint in progress...");
        sprintActive = true;
    }

    public void stopSprint(){
        System.out.println("Sprint is not in progress...");
        sprintActive = false;
    }
}
