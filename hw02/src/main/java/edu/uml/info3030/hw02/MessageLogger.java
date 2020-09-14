package edu.uml.info3030.hw02;

public class MessageLogger {
    private Logger logger;

    public MessageLogger(Logger logger) {
        this.logger = logger;
    }

    /** Writes an info message to the log
     * @param message The message
     * @return A boolean indicating whether the write was successful
     */
    public boolean writeInfoToLog(String message) {
        return logger.writeInfoToLog(message);
    }

    /** Writes an error message and exception to the database
     * @param message The message
     * @param ex The exception
     * @return A boolean indicating whether the write was successful
     */
    public boolean writeErrorToLog(String message, Exception ex) {
        return logger.writeErrorToLog(message, ex);
    }
}
