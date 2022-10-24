package org.example.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        //показати що створюється тільки один обʼєкт
//        System.out.println(ProgramLogger.getProgramLogger().toString());
//        System.out.println(ProgramLogger.getProgramLogger().toString());
//        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogFile("First log...");
        ProgramLogger.getProgramLogger().addLogFile("Second log...");
        ProgramLogger.getProgramLogger().addLogFile("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();

    }
}
