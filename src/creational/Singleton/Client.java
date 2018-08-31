package creational.Singleton;

/**
 * Created by user on 8/10/2018.
 */
public class Client {

     private static MyLogger logger;

    public static void main(String[] args) {
        logger = MyLogger.getMyLogger();

        logger.addLog("First log... bla, bla, bla");
        logger.addLog("Second log... bla, bla, bla");
        logger.addLog("Third log... bla, bla, bla");

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                logger = MyLogger.getMyLogger();
                logger.addLog("Fourth log... bla, bla, bla");
                logger.addLog("Fifth log... bla, bla, bla");
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(logger.getLogText());
    }
}
