package org.example.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is Log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){

    }

    public void addLogFile(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
