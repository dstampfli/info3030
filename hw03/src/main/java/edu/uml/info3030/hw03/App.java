package edu.uml.info3030.hw03;

import java.lang.reflect.*;

public class App 
{
    public static void main( String[] args )
    {
        // 1 - Generic container
        System.out.println("Question 1");
        MyContainer<Integer> myAge = new MyContainer<>(57);
        System.out.println("My age is " + myAge.get());
        MyContainer<String> myName = new MyContainer<>("Homework 3");
        System.out.println("My age is " + myName.get());

        // 2 - Generic hash map
        System.out.println("\nQuestion 2");
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
        map.put(1, "John Smith");
        map.put(2, "Jane Doe");
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        // 3 - Generic printArray method
        System.out.println("\nQuestion 3");
        MyPrinter myPrinter = new MyPrinter();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        int count = 0;
        for (Method method : MyPrinter.class.getDeclaredMethods()) {
            String name = method.getName();
            System.out.println(name);
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }
}
