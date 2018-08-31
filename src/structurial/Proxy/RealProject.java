package structurial.Proxy;

/**
 * Created by user on 8/13/2018.
 */
public class RealProject implements Project {

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from url: "+ url +"...");
    }

    @Override
    public void run() {
        System.out.println("Running project with url: "+ url +"...");
    }
}
