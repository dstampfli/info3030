package edu.uml.info3030.hw02;

import java.io.FileWriter;
import java.io.IOException;

/** Logs to a file
 * Implements the Logger interface
 */
public class LogToFile implements Logger {

    /** Returns the logger type
     * @return A LoggerType of FILE
     */
    @Override
    public LoggerType getLoggerType() {

        return LoggerType.FILE;
    }

    /** Writes a message to a file named "app.log"
     * @param message The message
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeInfoToLog(String message) {
        boolean success = false;

        try {
            if (message.length() > 0) {
                FileWriter writer = new FileWriter("app.log");
                writer.write(message);
                writer.close();
            }
            success = true;
        } catch (IOException e) {
            System.out.println("An error occurred!");
            success = false;
        }

        return success;
    }

    /** Writes a message and exception to the terminal
     * @param message The message
     * @param ex The exception
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeErrorToLog(String message, Exception ex) {
        boolean success = false;

        try {
            if (message.length() > 0) {
                FileWriter writer = new FileWriter("app.log");
                writer.write(message);
                writer.write(ex.toString());
                writer.close();
            }
            success = true;
        } catch (IOException e) {
            System.out.println("An error occurred!");
            success = false;
        }

        return  success;
    }
}
