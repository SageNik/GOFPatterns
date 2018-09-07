package behavioral.ChainOfResponsibility;

public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Sending SMS to manager: "+message);
    }
}
