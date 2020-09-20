package edu.uml.info3030.hw02;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit tests that verify dependency injection is working correctly
 */
public class AppTest 
{
    @Test
    public void testLogToTerminal() {
        Logger logger = new LogToTerminal();
        assertTrue(logger.getLoggerType() == Logger.LoggerType.TERMINAL);
    }

    @Test
    public void testLogToFile() {
        Logger logger = new LogToFile();
        assertTrue(logger.getLoggerType() == Logger.LoggerType.FILE);
    }

    @Test
    public void testLogToDatabase() {
        Logger logger = new LogToDatabase();
        assertTrue(logger.getLoggerType() == Logger.LoggerType.DATABASE);
    }
}
