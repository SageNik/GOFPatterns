package creational.Singleton;

/**
 * Created by user on 8/10/2018.
 */
class MyLogger {

    static MyLogger myLogger;
    static String logText = "";

    static synchronized MyLogger getMyLogger(){

        if(myLogger == null) myLogger = new MyLogger();
        return myLogger;
    }

    private MyLogger(){}

    void addLog(String log){
        logText +=log + "\n";
    }

    String getLogText(){
        return logText;
    }
}
