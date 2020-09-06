package edu.uml.info3030.hw01;

/**
 * Public ClientA class that implements the Client interface
 * This class uses a parameterized constructor that accepts a Service interface
 * This allows for different service implementations - Service1, Service2, or Service3 - to be passed in
 */
public class ClientA implements Client
{
    Service service;

    public ClientA(Service service)
    {
        this.service = service;
    }

    @Override
    public String doSomething()
    {
        return service.getInfo();
    }
}
