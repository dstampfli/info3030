package edu.uml.info3030.hw02;

/** Logs to the terminal
 * Implements the Logger interface
 */
public class LogToTerminal implements Logger {

    /** Returns the logger type
     * @return A LoggerType of TERMINAL
     */
    @Override
    public LoggerType getLoggerType() {
        return LoggerType.TERMINAL;
    }

    /** Writes a message to the terminal
     * @param message The message
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeInfoToLog(String message) {
        System.out.println(message);

        return true;
    }

    /** Writes a message and exception to the terminal
     * @param message The message
     * @param ex The exception
     * @return A boolean indicating whether the write was successful
     */
    @Override
    public boolean writeErrorToLog(String message, Exception ex) {
        System.out.println(message);
        System.out.println(ex.toString());

        return true;
    }
}
