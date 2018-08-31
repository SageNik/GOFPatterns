package creational.Prototype;

/**
 * Created by user on 8/13/2018.
 */
public class Client {


    public static void main(String[] args) {

        Project project = new Project(1L, "Super Project");
        Project cloneProject = project.clone();
        System.out.println("Project: "+ project + " have hashCode: "+ project.hashCode());
        System.out.println("Clone Project: "+ cloneProject +" have hashCode: "+ cloneProject.hashCode());
        System.out.println("Project == Clone Project?: "+ (project == cloneProject));
    }


}
