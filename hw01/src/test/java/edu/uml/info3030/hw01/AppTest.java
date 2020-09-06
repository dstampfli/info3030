package edu.uml.info3030.hw01;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit tests that verify dependency injection is working correctly
 */
public class AppTest 
{
    @Test
    public void testService1()
    {
        Service service = new Service1();
        Client client = new ClientA(service);
        String serviceName = client.doSomething();
        //assertTrue(serviceName == "Service 1");
        assertSame(serviceName, "Service 1");
    }

    @Test
    public void testService2()
    {
        Service service = new Service2();
        Client client = new ClientA(service);
        String serviceName = client.doSomething();
        //assertTrue(serviceName == "Service 2");
        assertSame(serviceName, "Service 2");
    }

    @Test
    public void testService3()
    {
        Service service = new Service3();
        Client client = new ClientA(service);
        String serviceName = client.doSomething();
        //assertTrue(serviceName == "Service 3");
        assertSame(serviceName, "Service 3");
    }
}
