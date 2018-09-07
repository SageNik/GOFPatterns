package behavioral.ChainOfResponsibility;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Notifying using simple method: "+message);
    }
}
