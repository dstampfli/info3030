package edu.uml.info3030.hw01;

public class App
{
    public static void main( String[] args )
    {
        Service service = new Service1();
        Client client = new ClientA(service);
        System.out.println(client.doSomething());

        service = new Service2();
        client = new ClientA(service);
        System.out.println(client.doSomething());

        service = new Service3();
        client = new ClientA(service);
        System.out.println(client.doSomething());
    }
}
