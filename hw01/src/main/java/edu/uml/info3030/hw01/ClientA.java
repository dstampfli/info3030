package edu.uml.info3030.hw01;

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
