package edu.uml.info3030.hw02;

/** Logger interface
 * Implemented by the LogTo* classes
 */
public interface Logger {
    enum LoggerType {
        DATABASE, FILE, TERMINAL
    }

    LoggerType getLoggerType();
    boolean writeInfoToLog(String message);
    boolean writeErrorToLog(String message, Exception ex);
}
