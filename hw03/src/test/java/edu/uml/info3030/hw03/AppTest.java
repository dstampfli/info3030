package edu.uml.info3030.hw03;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Unit tests for homework 3
 */
public class AppTest 
{
    /**
     * Tests for my generic container
     */
    @Test
    public void testMyContainer1()
    {
        MyContainer<Integer> container = new MyContainer<Integer>(57);
        assertTrue(container.get() instanceof Integer);
    }

    @Test
    public void testMyContainer2()
    {
        MyContainer<String> container = new MyContainer<String>("John Smith");
        assertTrue(container.get() instanceof String);
    }

    /**
     * Tests for my generic hash map
     */
    @Test
    public void testMyHashMap1()
    {
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
        map.put(1, "John Smith");
        assertTrue(map.get(1) instanceof String);
    }

    @Test
    public void testMyHashMap2()
    {
        MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
        map.put("John Smith", 1);
        assertTrue(map.get("John Smith") instanceof Integer);
    }

    /**
     * Test for MyPrinter
     */
    @Test
    public void testMyPrinterMethod()
    {
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

        assertTrue(count == 1);
    }
}
