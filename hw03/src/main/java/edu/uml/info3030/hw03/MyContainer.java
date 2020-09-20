package edu.uml.info3030.hw03;

import java.util.*;

public class MyContainer<T> {
    // Marked as final so it can't be changed
    private final T value;

    public MyContainer(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}