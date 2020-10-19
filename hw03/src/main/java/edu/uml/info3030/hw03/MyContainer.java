package edu.uml.info3030.hw03;

import java.util.*;

/**
 * This class is my implementation of a generic container
 */
public class MyContainer<T> {
    private T value;

    /**
     * Public constructor invoked when creating an instance of the class
     * @param value of type T
     */
    public MyContainer(T value) {
        this.value = value;
    }

    /**
     * Gets value
     * @return value as type T
     */
    public T get() {
        return value;
    }
}