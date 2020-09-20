package edu.uml.info3030.hw02;

//TODO Implement using Apache Derby
/** Logs to a database
 * Implements the Logger interface
 */
public class LogToDatabase implements Logger {

    /** Returns the logger type
     * @return A LoggerType of DATABASE
     */
    @Override
    public LoggerType getLoggerType() {
        return LoggerType.DATABASE;
    }

    /** Writes a message to a database"
     * @param message The message
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeInfoToLog(String message) {
        return true;
    }

    /** Writes a message and exception to the database
     * @param message The message
     * @param ex The exception
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeErrorToLog(String message, Exception ex) {
        return true;
    }
}
