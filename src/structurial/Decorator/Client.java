package structurial.Decorator;

/**
 * Created by user on 8/13/2018.
 */
public class Client {

    public static void main(String[] args) {

        Developer developer1 = new  JavaDeveloper();
        System.out.println(developer1.makeJob());

        Developer developer2 = new SeniorJavaDeveloper(new  JavaDeveloper());
        System.out.println(developer2.makeJob());

        Developer developer3 = new TeamLead(new  JavaDeveloper());
        System.out.println(developer3.makeJob());

        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
