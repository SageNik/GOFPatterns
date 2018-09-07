package behavioral.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifierManager("Everething is OK ", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifierManager("Something went wrong", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifierManager("We have had a problem here", Priority.ASAP);
    }
}
