package structurial.Proxy;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {

        Project project = new ProxyProject("http://www.github/superUser/project_one");
        project.run();
    }
}
