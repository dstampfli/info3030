package edu.uml.info3030.hw02;

public class App 
{
    public static void main( String[] args ) {

        // Write to the terminal
        Logger logger = new LogToTerminal();
        MessageLogger messageLogger = new MessageLogger(logger);
        if (messageLogger.writeInfoToLog("Writing to terminal!")) {
            System.out.println("Successfully wrote to terminal!");
        }

        // Write to file
        logger = new LogToFile();
        messageLogger = new MessageLogger(logger);
        if (messageLogger.writeInfoToLog("Writing to file!")) {
            System.out.println("Successfully wrote to file!");
        }

        // Write to database
        logger = new LogToDatabase();
        messageLogger = new MessageLogger(logger);
        if (messageLogger.writeInfoToLog("Writing to database!")) {
            System.out.println("Successfully wrote to database!");
        }
    }
}
