package structurial.Facade;

/**
 * Created by user on 8/14/2018.
 */
public class WorkFlow {

    private Job job = new Job();
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
