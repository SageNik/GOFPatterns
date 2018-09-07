package behavioral.Iterator;

public class Client {

    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Hibernate"};
        JavaDeveloper developer = new JavaDeveloper("Ivan", skills);

        Iterator iterator = developer.getIterator();

        System.out.println("Java Developer name: " + developer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
